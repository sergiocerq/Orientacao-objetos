package JDBC;

import java.sql.*;

public class ConexaoBanco {
	
	private static String url = "jdbc:postgres:localhost:1521/partidos";
	private static String user = "system";
	private static String password = "12345";
	
	private ConexaoBanco() {
	}
	
	public static Connection getConection() throws SQLException {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}