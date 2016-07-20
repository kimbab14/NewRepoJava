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

 class TestConnection {
	 
	//JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	//jdbc:mysql://hostname/ databaseName or you can add the port after hostname
	static final String DB_URL = "jdbc:mysql://localhost/test";

	//Database credentials
	static final String USER = "root";
	static final String PASS = "";
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		 
		//STEP 2: Register JDBC driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    //STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Connection Successful.");
			conn.close();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't connect to the database, please check your \n"
					+ "UserName: " + USER 
					+ "\nPass: " + PASS 
					+ "\nDB_URL: " + DB_URL);
		}	


	}

}
