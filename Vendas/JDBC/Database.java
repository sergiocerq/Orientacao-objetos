package JDBC;
import java.sql.*;

public class Database {
	
	private static String url = "jdbc:mysql://localhost:3275:TESTE";
	private static String user = "root";
	private static String password = "123456";
	
	public Database() {
	}
	
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	

}
