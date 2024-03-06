package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entities.Corrida;


public class DAOCorrida implements DAOInterface {
	
	Connection conn = null;
	
	public DAOCorrida() throws SQLException {
		try {
			conn = ConexaoBanco.getConnection();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Corrida> getAll() throws SQLException {
		List<Corrida> lista = new ArrayList();
		String sql = "SELECT * FROM Piloto";
		try {
			conn = ConexaoBanco.getConnection();
			PreparedStatement ptsm = conn.prepareStatement(sql);
			ResultSet rs = ptsm.executeQuery();
			while(rs.next()) {
				String pais = rs.getString("pais");
				int numeroVoltas = rs.getInt("numero_voltas");
				double kms = rs.getInt("kms");
				Corrida c = new Corrida(pais, numeroVoltas, kms);
				lista.add(c);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			return lista;
		}
	}

	public boolean inserir(Object valor) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public Object buscaValor(Object valor) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
