package database;

import java.sql.*;
import java.util.ArrayList;

public class Sqlite {
    private String dbPath;
    private Connection connection = null;

    private static Sqlite instance = null;

    public static Sqlite getInstance() {
        if (instance == null)
            instance = new Sqlite("atm.db");

        return instance;
    }

    public Sqlite(String dbPath) {
        this.dbPath = dbPath;
    }

    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);
        } catch (ClassNotFoundException notFoundException) {
            notFoundException.printStackTrace();
            System.out.println("Erreur de connexion");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Erreur de connexion");
        }
    }

    public Object[] ExecuteQueryRow(String sql, Object... args) {
        try {
            var statement = connection.prepareStatement(sql);
            var index = 1;
            for (var arg : args) {
                statement.setObject(index, arg);
                index++;
            }
            var res = statement.executeQuery();

            return ExtractData(res).iterator().next();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public void ExecuteNonQuery(String sql, Object... args) {
        try {
            var statement = connection.prepareStatement(sql);
            var index = 1;
            for (var arg : args) {
                statement.setObject(index, arg);
                index++;
            }
           statement.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private Iterable<Object[]> ExtractData(ResultSet res) throws SQLException {
        var result = new ArrayList<Object[]>();
        while (res.next()) {
            var columnNumber = res.getMetaData().getColumnCount();
            var row = new Object[columnNumber];
            for (int i = 0; i <= columnNumber - 1; i++) {
                row[i] = res.getObject(i+1);
            }
            result.add(row);
        }

        return result;
    }

    public void close() {
        try {
            connection.close();
            System.out.println("Connexion à la base de données fermée");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}