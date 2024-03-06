package JDBC;

import java.util.List;
import java.sql.SQLException;

public interface DAOInterface<T> {
	public List<T> getAll() throws SQLException; 
	public T getValue(T valor) throws SQLException;
	public boolean cadastraValor(T valor) throws SQLException;
}
