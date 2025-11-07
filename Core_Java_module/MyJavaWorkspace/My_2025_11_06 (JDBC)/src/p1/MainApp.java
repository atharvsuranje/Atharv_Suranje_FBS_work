package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		//Step 1: Load the Drivers
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
//			getConnection takes a Connection String
			//Its format is
			//protocol:subprotocol:DB-specific information
			
			
			int id;
			String username,password;
			Scanner sc=new Scanner(System.in);
			id=sc.nextInt();
			sc.nextLine();
			username=sc.nextLine();
			password=sc.nextLine();
			sc.close();
			
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/helpline_chat","root","Atharv@2604");
			String query="insert into users(id,username,password) values (?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.setString(2, username);
			pstmt.setString(3, password);
			
			int rowCount=pstmt.executeUpdate();
			System.out.println(rowCount+" Rows Updated");
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
