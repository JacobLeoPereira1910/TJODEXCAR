package br.com.tjodex.dal;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionModule {
	
public static Connection conector() {
		
		java.sql.Connection conection = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://10.26.45.116:3306/tjodex?useSSL=false";
		String user = "admin";
		String password = "123@Senac";

		try {
			Class.forName(driver); conection = DriverManager.getConnection(url,user,password);
			return conection;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

}
