package DAO;

import java.sql.SQLException;
import java.util.List;

public interface DAOInterface <T> {
	List <T> getAll() throws SQLException;
	boolean inserir (T valor) throws SQLException;
	T buscaValor (T valor) throws SQLException;
}
