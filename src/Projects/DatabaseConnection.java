package Projects;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DatabaseConnection {
	public DatabaseConnection() throws Exception {
		var con = DriverManager.getConnection("jdbc:mysql://localhost:3308/?serverTimezone=UTC", "root", "0000");
		var stmt = con.createStatement();

		stmt.execute("SET GLOBAL local_infile = 1");

		System.out.println("connector 연결");
		
	}
}