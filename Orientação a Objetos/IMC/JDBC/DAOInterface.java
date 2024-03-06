package JDBC;
import java.sql.*;
import java.util.List;

public interface DAOInterface<T> {
	boolean cadastrar (T valor) throws SQLException;
	List<T> getAllValues() throws SQLException;
	T getValue(T valor) throws SQLException;
}
