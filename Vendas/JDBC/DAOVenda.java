package JDBC;

import java.sql.*;
import java.util.List;
import properties.*;

public class DAOVenda implements DAOConexao {
	
	private Connection conn;
	
	public DAOVenda() {
		try {
			conn = Database.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List getTodosValores() throws SQLException {
		String sql = "SELECT * FROM venda";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int qtd = rs.getInt("Quantidade");
			int id = rs.getInt("ID");
			
			Venda v = new Venda(id, qtd, 0);
			System.out.println(v);
		}
		return null;
	}

	public boolean cadastraValor(Object valor) throws SQLException {
		
		return false;
	}

	public boolean removeValor(Object valor) throws SQLException {
		
		return false;
	}

	public boolean atualizaValor(Object valor) throws SQLException {
		
		return false;
	}

	@Override
	public Object getValor() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
