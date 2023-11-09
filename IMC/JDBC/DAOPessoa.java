package JDBC;

import java.sql.*;
import java.util.*;
import entities.*;

public class DAOPessoa implements DAOInterface {
	
	private Connection conn;
	
	public DAOPessoa() throws SQLException {
		try {
			conn = ConexaoBanco.getConnection();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean cadastrar(Pessoa p) throws SQLException {
		String sql = "INSERT INTO pessoa(nome, altura, peso) VALUES(?,?,?);";
		PreparedStatement ptsm = conn.prepareStatement(sql);
		ptsm.setString(0, p.getNome());
		ptsm.setDouble(1, p.getAltura());
		ptsm.setDouble(2, p.getPeso());
		ResultSet rs = ptsm.executeQuery();
		if(rs.next()) {
			return true;
		}
		return false;
	}

	public List getAllValues() throws SQLException {
		List<Pessoa> lista = new ArrayList();
		String sql = "SELECT * FROM pessoa";
		PreparedStatement pstm = ConexaoBanco.getConnection().prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		while(rs.next()) {
			String nome = rs.getString("nome");
			double peso = rs.getDouble("peso");
			double altura = rs.getDouble("altura");
			Pessoa p = new Pessoa(nome, peso, altura);
			lista.add(p);
		}
		return lista;
	}

	public Pessoa getValue(Pessoa p) throws SQLException {
		String sql = "SELECT * FROM pessoa WHERE id=?";
		PreparedStatement ptsm = ConexaoBanco.getConnection().prepareStatement(sql);
		ptsm.setInt(0, p.getId());
		ResultSet rs = ptsm.executeQuery();
		if(rs.next()) {
			return p;
		}
		return null;
	}
}
