package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

public abstract class DAOInterface<T> {
    public abstract ArrayList<T> getAll() throws SQLException;
    public abstract T getValor(T valor) throws SQLException;
    //public abstract boolean inserir(T valor) throws SQLException;
}
