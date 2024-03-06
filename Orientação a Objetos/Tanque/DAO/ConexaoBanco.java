package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
	
	private static String url = "jdbc:oracle:@thin:localhost:1521/sistema/tanque";
	private static String user = "system";
	private static String password = "12345";
	
	@SuppressWarnings("finally")
	public static Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
}
