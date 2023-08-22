package Projects;

import java.sql.DriverManager;

public class DatabaseConnection {
	public DatabaseConnection() throws Exception {
		var con = DriverManager.getConnection("jdbc:mysql://localhost:3308/?serverTimezone=UTC", "root", "0000");
		var stmt = con.createStatement();
		
		stmt.execute("SET GLOBAL local_infile = 1");
		
		System.out.println("connector 연결");
		
		stmt.execute("DROP SCHEMA IF EXISTS `mdh`");
		stmt.execute("CREATE SCHEMA `mdh` DEFAULT CHARACTER SET utf8 ;\r\n");
		
		System.out.println("mdh schema 생성");
		
	}
}
