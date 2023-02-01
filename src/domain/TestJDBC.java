package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url= "jdbc:mysql://localhost:3306/hr";
		String userName="root";
		String passWord="#Blackcrown06";
		
		try {
			Connection con = DriverManager.getConnection(url,userName,passWord);
			System.out.println("Connection Successful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
