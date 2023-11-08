package JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import properties.Produto;

public class DAOProduto implements DAOConexao {
	
	private Connection conn;
	
	public DAOProduto() throws SQLException {
		try {
			conn = Database.getConnection();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public Object getValor() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List getTodosValores() throws SQLException {
		String sql = "SELECT * FROM produto";
		PreparedStatement ps = conn.prepareStatement(sql);
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int id = rs.getInt("id");
			String nome = rs.getString("nome");
			double preco = rs.getDouble("preco");
			
			Produto p = new Produto(id, nome, preco);
			System.out.println(p);
			lista.add(p);
		}
		return lista;
	}

	public boolean cadastraValor(Object valor) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeValor(Object valor) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean atualizaValor(Object valor) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
