package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_First_Program {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
			Scanner sc = new Scanner(System.in);
		
		{
		
		
	//step-1
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step-2
		
		String url="jdbc:mysql://localhost:3306/wasif";
		String username="root";
		String password="root";
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		Statement stm = con.createStatement();
		
		String query="create database Wasif";

//		stm.executeUpdate(query);
		
		
		String createTable = "create table student(rollNo int,name varchar(100))";
//		stm.executeUpdate(createTable);
		
		String inserdata = "insert into student(rollNo,name) values(1,'harsh')";
//		stm.executeUpdate(inserdata);
		
		System.out.println("Enter rollNo");
		int rollno = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		
		String insertUserInput = "insert into student(rollNo,name) values("+rollno+",'"+name+"')";
		 
		int count=stm.executeUpdate(insertUserInput);
		System.out.println(count);
		
		
		 String userInputUpdate = "update student set name='"+ name +	"' where rollNo=" + rollno;	
//		 stm.execute(userInputUpdate);
		 
		 
		 String deleteRow = "delete from student where rollNo="+ rollno;
		 stm.execute(deleteRow);
		
		stm.close();
		
		}
	}

}
