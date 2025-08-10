package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JDBC_08_08 {
	
	public static void main(String[] args) throws SQLException {
		
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter roll no");
//	int rollno = sc.nextInt();
//	System.out.println("Enter name");
//	String name = sc.next();
	
	String url="jdbc:mysql://localhost:3306/wasif";
	String username="root";
	String password="root";
	
	Connection con=DriverManager.getConnection(url,username,password);
	
//	String insert = "insert into student(rollNo,name) values(1,'amar')";
//	
//	String insertUserInput = "insert into student(rollNo,name) values("+rollno+",'"+name+"')";
//	
	Statement st = con.createStatement();
//	      st.executeUpdate(insertUserInput);
	
	String query = "select * from student";
	ResultSet rs= st.executeQuery(query);
	while(rs.next())
	{
	System.out.println(rs.getInt(1) + "    "+ rs.getString(2));
	}
	      
	      st.close();
	}

}
