package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestInsert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String url= "jdbc:mysql://localhost:3306/hr";
		String userName="root";
		String passWord="#Blackcrown06";
		
		try {
			Connection con = DriverManager.getConnection(url,userName,passWord);
			
			int i =0;
			boolean session = true;
			while(i<5 && session)
			{
				System.out.println("Enter First Name: ");
				String nameString = sc.nextLine();
				System.out.println("Enter age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter address: ");
				String addressString = sc.nextLine();
				System.out.println("Enter course id: ");
				int course = sc.nextInt();
				sc.nextLine();
				
				String query = "insert into student(name,age,address,course) values('"+nameString+"','"+age+"','"+addressString+"','"+course+"')";
				
				Statement stmt = con.createStatement();
				
				int rs = stmt.executeUpdate(query);
				
				System.out.println("Inserted Successfully! Do you want to continue?");
				
				String resString = sc.next();
				if(resString.equals("n"))
					session=false;
			}
			
			System.out.println("Connection Successful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
