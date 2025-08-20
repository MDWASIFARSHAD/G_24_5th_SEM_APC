package Jdbc_package;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementExample_11_08 {

	
	public static void main(String[] args) throws SQLException {
		
		String url ="jdbc:mysql://localhost:3306/jdbcproject";
		String username="root";
		String password="root";
		
		 Connection con=   DriverManager.getConnection(url,username,password);
		 
		 CallableStatement cs = con.prepareCall("{call getStudentNames(?,?)}");
		 cs.setInt(1, 29);
		 cs.registerOutParameter(2, Types.VARCHAR);
		 
		 cs.execute();
		 
		 String name = cs.getString(2);
		 System.out.println(name);
	}
}
