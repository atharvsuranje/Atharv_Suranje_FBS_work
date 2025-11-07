package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {

	public static void main(String[] args) {
		
		//Step 1: Load the Drivers
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			getConnection takes a Connection String
			//Its format is
			//protocol:subprotocol:DB-specific information
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight_management_case_study","root","Atharv@2604");
			String query="select * from aircrafts";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString(1)+"  "+rs.getString(2));
			}
			con.close();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}
