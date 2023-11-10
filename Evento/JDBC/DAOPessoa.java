package JDBC;

import java.util.ArrayList;
import java.util.List;

import enitities.Pessoa;

import java.sql.*;

public class DAOPessoa implements DAOInterface {
	
	private Connection conn;

	public List getAll() throws SQLException {
		List <Pessoa> lista = new ArrayList();
		
		String sql = "SELECT * FROM pessoa";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		while(rs.next()) {
			rs.getString("nome");
			rs.getDouble("saldo");
			Pessoa p = new Pessoa();
			lista.add(p);
		}
		return lista;
	}

	public Pessoa getValue(Pessoa pessoa) throws SQLException {
		String sql = "SELECT * FROM pessoa WHERE id=?";
		PreparedStatement ptsm = conn.prepareStatement(sql);
		ptsm.setInt(0, pessoa.getId());
		ResultSet rs = ptsm.executeQuery();
		if(rs.next()) {
			return pessoa;
		}
		return null;
	}

	public boolean cadastraValor(Pessoa p) throws SQLException {
		String sql = "INSERT INTO pessoa(nome, saldo) VALUES=(?,?)";
		PreparedStatement ptsm = conn.prepareStatement(sql);
		ptsm.setString(0, p.getNome());
		ptsm.setDouble(0, p.getSaldo());
		ResultSet rs = ptsm.executeQuery();
		if(rs.next()) {
			return true;
		}
		return false;
	}
}