package JDBC;
import java.sql.*;

public class ConexaoBanco {
	
	private static String url = "jdbc/oracle/localhost:3231/teste";
	private static String user = "system";
	private static String password = "12345";
	
	private ConexaoBanco() {
	}
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}