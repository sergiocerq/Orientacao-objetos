package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entities.Piloto;

public class DAOPiloto implements DAOInterface {
	
	Connection conn = null;
	
	public DAOPiloto() throws SQLException {
		try {
			conn = ConexaoBanco.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Piloto> getAll() throws SQLException {
		List<Piloto> lista = new ArrayList();
		String sql = "SELECT * FROM Piloto";
		try {
			conn = ConexaoBanco.getConnection();
			PreparedStatement ptsm = conn.prepareStatement(sql);
			ResultSet rs = ptsm.executeQuery();
			while(rs.next()) {
				String nome = rs.getString("nome");
				int numeroVoltas = rs.getInt("numero_voltas");
				int tempo = rs.getInt("tempo");
				int voltaRapida = rs.getInt("volta_rapida");
				Piloto p = new Piloto(nome, numeroVoltas, voltaRapida, tempo);
				lista.add(p);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			return lista;
		}
	}

	public boolean inserir(Piloto p) throws SQLException {
		String sql = "INSERT INTO Piloto VALUES (?,?,?,?)";
		PreparedStatement ptsm = conn.prepareStatement(sql);
		ptsm.setString(1, p.getNome());
		ptsm.setInt(2, p.getNumeroVoltas());
		ptsm.setInt(3, p.getVoltaMaisRapida());
		ptsm.setInt(4, p.getTempoCorrida());
		ResultSet rs = ptsm.executeQuery();
		if(rs.next()) {
			return true;
		}
		return false;
	}

	public boolean buscaValor(Piloto p) throws SQLException {
		String sql = "SELECT * FROM Piloto WHERE nome=(?)";
		PreparedStatement ptsm = conn.prepareStatement(sql);
		ptsm.setString(1, p.getNome());
		ResultSet rs = ptsm.executeQuery();
		if(rs.next()) {
			return true;
		}
		return false;
	}

}
