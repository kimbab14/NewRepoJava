package jdbctest;

/**
 * Three things need to be change here: 
 * 
 * @DB_URL = your database hostname + database name
 * @USER = your MySQL username
 * @PASS = your MySQL password
 * 
 */
//STEP 1. Import required packages for the database connection.
import java.sql.*;


public class TestConnection {
	 
	//JDBC driver name and database URL
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	//jdbc:mysql://hostname/ databaseName or you can add the port after hostname
	static final String DB_URL = "jdbc:mysql://localhost:3306/world";

	//Database credentials
	private static final String USER = "root";
	private static final String PASS = "mastek";
	private static Connection conn = null;
	private static Statement stmt = null;
	private static CallableStatement proc = null;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		connectToDB();
		//callStoredProcedure();
		callSPWithParam();
		//selectDataToDB();
		//InserDataToDB();
	    //UpdateData();
	    //deleteDate();
	    //conn.close();
	}
	
	/**
	 * Method to connect on the MySQL database.
	 */
	public static void connectToDB(){
		//STEP 2: Register JDBC driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//STEP 3: Open a connection
			System.out.println("Connecting to selected database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Connected to the database successfully...");
			//conn.close();	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Error: Cant find MySQL Connector driver,"
						+ "Please add the MySQL jar connector in you Libray path.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Cannot establish a connection, Please check your: " 
					+ "\nDB_URL: " + DB_URL
					+ "\nUser: " + USER
					+ "\nPassword: " + PASS);
		}
	}
	
	/**
	* Method to select a query and get the top 10 data from the database.
	* 
	*/
	public static void selectDataToDB(){
		//STEP 4: Execute a query
	    System.out.println("Creating statement...");
	    try {
	    stmt = conn.createStatement();
	    String sql;
	    sql = ("SELECT"
	    			+ 	"*"
	      		+ "FROM "
	      			+ 	"world.country INNER JOIN "
	      			+ 	"world.countrylanguage ON country.Code = countrylanguage.CountryCode "
	      		+ "WHERE "
	      			+ " CountryCode = 'PHL' ");
	      ResultSet rs = stmt.executeQuery(sql);
	     //System.out.println(sql);
	      try{
	      while(rs.next()){
	    	
	    // Retrieve by column name from the database table
	       String Name  = rs.getString("Name");
	       String CountryCode = rs.getString("Code");
	       String Language = rs.getString("Language");
	       String Continent = rs.getString("Continent");
	       String Population = rs.getString("Population");

	      //Display values
	       System.out.println("##################################");
	       System.out.println("Country Name: " + Name);
	       System.out.println("Country Code: " + CountryCode);
	       System.out.println("Language: " +  Language);
	       System.out.println("Continent: " + Continent );
	       System.out.println("Population: " + Population);
	       System.out.println("##################################");
	    	
	    	 }
	     }catch(SQLException e){
    		 System.err.println("Column name not found.");
    	 }
	      
	   
	    }catch (SQLException e) {
           e.printStackTrace();
	    	System.err.println("You have an error in your SQL syntax;"
           		+ "check the manual that corresponds to your MySQL server version for the right syntax.");
	    }    
	}
	
	
	/**
	 * Method use to Insert data on the database
	 * 
	 */
	public static void InserDataToDB(){
		System.out.println("Inserting records into the table...");
		try {
			stmt = conn.createStatement();
			String insertSQL = "INSERT INTO countrylanguage " +
		                   "VALUES ('PHL' , 'Ilocano' , 'F', 1.2)";
		    stmt.executeUpdate(insertSQL);
		    System.out.println("Successfully inserted data.");	
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				if (e.getSQLState().startsWith("23") == true){
					System.err.println("Insertion Failed. Duplicated Primary Key");
				}else{
					System.err.println("Insertion Failed. You have an error in your SQL syntax;"
			           		+ "check the manual that corresponds to your MySQL server version for the right syntax.");			 
				}
		}
	}
	
	/**
	 * Method use to update data on the database.
	 */
	public static void UpdateData(){
		System.out.println("Updating database...");
		try{
			stmt = conn.createStatement();
			String updateSQL = "UPDATE countrylanguage " +
							   "SET Percentage = 0.5 WHERE Language = 'Ilocano' ";
			stmt.executeUpdate(updateSQL);
			System.out.println("Update Succesful...");
		}catch (SQLException e){
			System.err.println("Updating Failed, check your MySQL syntax....");
		}
		
	}
	
	/**
	 * Method use to delete data on the database.
	 */
	public static void deleteDate(){
		System.out.println("Deleting  data on the datase...");
		try{
			stmt = conn.createStatement();
			String deleteSQL = "DELETE FROM countrylanguage " 
								+ "WHERE language = 'Ilocano' ";
			stmt.executeUpdate(deleteSQL);
			System.out.println("Data Deleted.");
		}catch (SQLException e){
			e.printStackTrace();
			System.err.println("Deleting data failed, check your MySQL syntax");
		}
	}
	
	/*
	 * call stored procedure here without parameter
	 */
	public static void callStoredProcedure(){
		String spCall = "{CALL getALLPHL()}";
		try {
			proc = conn.prepareCall(spCall);
			 ResultSet rs = proc.executeQuery();
		     //System.out.println(sql);
		    
		      while(rs.next()){
		    	
		    // Retrieve by column name from the database table
		       String Code  = rs.getString("CountryCode");
		       String Language = rs.getString("language");
		       String isOfficial = rs.getString("IsOfficial");
		       String Percentage = rs.getString("Percentage");
		    
		      //Display values
		       System.out.println("##################################");
		       System.out.println("Country Code: " + Code);
		       System.out.println("Language: " + Language);
		       System.out.println("IsOfficial: " +  isOfficial);
		       System.out.println("Percentaget: " + Percentage);
		       //System.out.println("Population: " + Population);
		       System.out.println("##################################");
		      }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	//call stored procedure with parameter
	public static void callSPWithParam(){
		String spCall = "{CALL getCounty('PHL')}";
		try {
			proc = conn.prepareCall(spCall);
			 ResultSet rs = proc.executeQuery();
		     //System.out.println(sql);
		    
		      while(rs.next()){
		    	
		    // Retrieve by column name from the database table
		       String Code  = rs.getString("CountryCode");
		       String Language = rs.getString("language");
		       String isOfficial = rs.getString("IsOfficial");
		       String Percentage = rs.getString("Percentage");
		    
		      //Display values
		       System.out.println("##################################");
		       System.out.println("Country Code: " + Code);
		       System.out.println("Language: " + Language);
		       System.out.println("IsOfficial: " +  isOfficial);
		       System.out.println("Percentaget: " + Percentage);
		       //System.out.println("Population: " + Population);
		       System.out.println("##################################");
		      }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
}
