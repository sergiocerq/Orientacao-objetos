package DAO;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entities.Tanque; 

public class DAOTanque implements DAOInterface {
	
	private Connection conn;
	
	public DAOTanque () {
		try {
			conn = ConexaoBanco.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Tanque> getAll() throws SQLException {
		List<Tanque> lista = new ArrayList();
		String sql = "SELECT * FROM Tanque";
		PreparedStatement ptsm = conn.prepareStatement(sql);
		ResultSet rs = ptsm.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			int qtdAcionamento = rs.getInt("qtd_acionamentos");
			int qtdLitro = rs.getInt("qtd_litros");
			Tanque t  = new Tanque(id, qtdLitro, qtdAcionamento);
			lista.add(t);
		}
		return lista;
	}
	
	public boolean getValor(Tanque t) {
		String sql = "SELECT * FROM Tanque WHERE id=?";
		
		PreparedStatement ptsm = conn.prepareStatement(sql);
		
		ptsm.setInt(0, t.getId());
		ResultSet rs = ptsm.executeQuery();
		if(rs.next()) {
			return true;
		}
		return false;
	}
	
}
