package org.jdbc;

//import the package 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDB {
	
	private static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static String userName = "system";
	private static String passWord = "admin1";
	
	public static void main(String[] args) throws Exception {
		

		// load and Register the Driver 
		Class.forName("oracle.jdbc.driver.OracleDriver");  // need the qualified name 
		
		// Establish the connection
		Connection con = DriverManager.getConnection(url,userName,passWord);
		
		/*Connection con = DriverManager.getConnection(  
				"jdbc:oracle:thin:@localhost:1521:orcl","c##db","pass");*/  
		
		
		// Create statement 
		Statement stmt = con.createStatement(); 
		
		// Execute the Query
		ResultSet rs = stmt.executeQuery("select * from AB_Bus");  
		 
		
		// Process the result 
		while(rs.next()){  
			System.out.println("Inside");
			String id = rs.getString(1);
			String model = rs.getString(2);
			String type = rs.getString(3);
			
			System.out.println(id+" "+model+" "+type+" ");  
		
		}  

		// close the connection
		stmt.close();
		con.close();
	}
}
