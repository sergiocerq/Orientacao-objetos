package JDBC;

import java.sql.*;
import java.util.List;

public interface DAOConexao<T> {
	T getValor() throws SQLException;
	List<T> getTodosValores() throws SQLException;
	boolean cadastraValor(T valor) throws SQLException;
	boolean removeValor(T valor) throws SQLException;
	boolean atualizaValor(T valor) throws SQLException;
}
