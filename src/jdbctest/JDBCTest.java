package jdbctest;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * In order for the connection to work, user need to download 
 * the MySql java connection which can be found here:
 * http://dev.mysql.com/downloads/connector/j/5.0.html
 * 
 * then user needs to do this: http://recordit.co/Km1zr8phLQ
 * 
 * this is an example of code where I fetch the data
 * from MySQL and then save the result as a CSV file.
 * 
 */
//STEP 1. Import required packages for the database connection.
import java.sql.*;

public class JDBCTest {
	
	//JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	//jdbc:mysql://hostname/ databaseName or you can add the port after hostname
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";

	//Database credentials
	static final String USER = "root";
	static final String PASS = "mastek";
	   
	public static void main(final String[] args) throws SQLException {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      //getInstance() method can also be use as a work around noncompliant JVMs, 
		  //but then you'll have to code for two extra Exceptions.
		   Class.forName("com.mysql.jdbc.Driver");	

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);
	      
	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      
	      stmt = conn.createStatement();
	      String sql;
	      sql =   ("SELECT "
	      		+ 	" * "
	      		+ "FROM "
	      		+ 	"world.country INNER JOIN "
	      		+ 	"world.countrylanguage ON country.Code = countrylanguage.CountryCode ");
	      ResultSet rs = stmt.executeQuery(sql);
	      
	  
	      //while(rs.next()){
	      //Retrieve by column name from the database table
	       //  String Name  = rs.getString("Name");
	       //  String CountryCode = rs.getString("Code");
	        // String Language = rs.getString("Language");
	       //  String Continent = rs.getString("Continent");
	        // String Population = rs.getString("Population");

	         //Display values
	         //System.out.println("##################################");
	         //System.out.println("Country Name: " + Name);
	         //System.out.println("Country Code: " + CountryCode);
	         //System.out.println("Language: " +  Language);
	         //System.out.println("Continent: " + Continent );
	         //System.out.println("Population: " + Population);
	        // System.out.println("##################################");
	             
	         String f = "C:\\Users\\jelica60589\\Desktop\\outputFileExample.csv";
	         PrintWriter csvWriter = new PrintWriter(new File(f)) ;
	         ResultSetMetaData meta = rs.getMetaData() ; 
	         int numberOfColumns = meta.getColumnCount() ; 
	         String dataHeaders = "\"" + meta.getColumnName(1) + "\"" ; 
	         for (int i = 2 ; i < numberOfColumns + 1 ; i ++ ) { 
	                 dataHeaders += ",\"" + meta.getColumnName(i) + "\"" ;
	         }
	         csvWriter.println(dataHeaders) ;
	         //STEP 5: Extract data from result set
	         while (rs.next()) {
	             String row = "\"" + rs.getString(1) + "\""  ; 
	             for (int i = 2 ; i < numberOfColumns + 1 ; i ++ ) {
	                 row += ",\"" + rs.getString(i) + "\"" ;
	             }
	         csvWriter.println(row) ;
	         }
	         csvWriter.close();
	   
	      //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	   } catch ( ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null) {
				stmt.close();
			}
	      }catch(SQLException se2){
	      }
	      try{
	         if(conn!=null) {
				conn.close();
			}
	      }catch(SQLException se){
	         se.printStackTrace();
	      }
	   }
	   System.out.println("Done!");
	}
	
	/**
	 * this method will try to insert data on the database.
	 */
	public void establishConnection(){
		Connection conn = null;
		Statement stmt = null;
		
	}
}
