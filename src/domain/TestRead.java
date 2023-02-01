package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url= "jdbc:mysql://localhost:3306/hr";
		String userName="root";
		String passWord="#Blackcrown06";
		
		try {
			Connection con = DriverManager.getConnection(url,userName,passWord);
			
			String query = "select first_name , last_name , email , phone_number , salary from employees";
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				String fName = rs.getNString(1);
				String lName = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				Float salary = rs.getFloat(5);
				
				System.out.println(fName+"---"+lName+"---"+email+"---"+phone+"---"+salary);
			}
			
			System.out.println("Connection Successful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
