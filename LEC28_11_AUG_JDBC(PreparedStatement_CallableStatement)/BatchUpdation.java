package Jdbc_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdation {
	
	public static void main(String[] args) throws SQLException {
		
		String url ="jdbc:mysql://localhost:3306/jdbcproject";
		String username="root";
		String password="root";
		
		 Connection con=   DriverManager.getConnection(url,username,password);
		 
		 Statement stm = con.createStatement();
		 
		 String query1="insert into student(rollNo,name) values(12,'harsh')";
		 String query2= "delete from student where rollNo=2";
		 String query3= "update student set rollNo=29 where name='asif'";
		 String query4= "insert into student(rollNo,name) values(9,'gurneet')";
		 
//		 stm.executeUpdate(query1);
//		 stm.executeUpdate(query2);
//		 stm.executeUpdate(query3);
		 
		 stm.addBatch(query1);
		 stm.addBatch(query2);
		 stm.addBatch(query3);
		 stm.addBatch(query4);
		 
		 
		int[] count= stm.executeBatch();
		System.out.println(count.length);
		 
//		 
		 stm.close();
		 
		 		}

}
;