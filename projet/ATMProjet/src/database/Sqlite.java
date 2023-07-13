package database;
import java.sql.*;
import java.util.ArrayList;

public class Sqlite {

    // Chemin du fichier de base de données
    private String dbPath;

    // Objet Connection pour établir la connexion à la base de données
    private Connection connection = null;

    // Instance unique de la classe Sqlite
    private static Sqlite instance = null;

    public static Sqlite getInstance() {
        if (instance == null)
            // Crée une nouvelle instance de Sqlite avec le chemin du fichier de base de données
            instance = new Sqlite("atm.db");

        return instance;
    }

    //Constructeur de Sqlite qui prend en parametre une chaine de caractère la variable dbPath (donc le chemin de la base de donnée)
    public Sqlite(String dbPath) {

        // Initialise le chemin du fichier de base de données avec la valeur fournie en paramètre
        this.dbPath = dbPath;
    }

    public void connect() {
        try {
            // Charge le pilote JDBC pour SQLite (le fameux mdr)
            Class.forName("org.sqlite.JDBC");

            // Établit la connexion à la base de données SQLite en utilisant le chemin du fichier
            connection = DriverManager.getConnection("jdbc:sqlite:" + dbPath);

            //En cas d'exception ces bloque permette d'afficher les erreurs
        } catch (ClassNotFoundException notFoundException) {
            notFoundException.printStackTrace();

            // Affiche un message d'erreur en cas d'échec de chargement du pilote JDBC
            System.out.println("Erreur de connexion");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            // Affiche un message d'erreur en cas d'échec de connexion à la base de données
            System.out.println("Erreur de connexion");
        }
    }

    //Constructeur de la methode ExecuteQueryRow
    //Nino ma aider pour cette partie ;)
    public Object[] ExecuteQueryRow(String sql, Object... args) {
        try {
            // Prépare la requête SQL en utilisant l'objet Connection
            var statement = connection.prepareStatement(sql);
            var index = 1;
            for (var arg : args) {
                // Remplit les paramètres de la requête SQL avec les valeurs fournies en paramètre
                statement.setObject(index, arg);
                index++;
            }
            // Exécute la requête SQL et récupère le résultat dans un objet ResultSet
            var res = statement.executeQuery();

            // Extrait les données du résultat et retourne la première ligne sous forme de tableau d'objets
            return ExtractData(res).iterator().next();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public void ExecuteNonQuery(String sql, Object... args) {
        try {
            // Prépare la requête SQL en utilisant l'objet Connection
            var statement = connection.prepareStatement(sql);
            var index = 1;
            for (var arg : args) {
                // Remplit les paramètres de la requête SQL avec les valeurs fournies en paramètre
                statement.setObject(index, arg);
                index++;
            }
            // Exécute la requête SQL qui ne retourne pas de résultat
            statement.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private Iterable<Object[]> ExtractData(ResultSet res) throws SQLException {

        // Crée une nouvelle instance d'ArrayList (tableau d'objet) et plusieurs dimansion pour stocker les données extraites
        var result = new ArrayList<Object[]>();
        // Parcourt chaque ligne du résultat
        while (res.next()) {
            var columnNumber = res.getMetaData().getColumnCount();  // Récupère le nombre de colonnes du résultat
            var row = new Object[columnNumber];  // Crée un tableau d'objets pour stocker les valeurs de la ligne courante
            for (int i = 0; i <= columnNumber - 1; i++) {
                row[i] = res.getObject(i + 1);  // Récupère la valeur de chaque colonne de la ligne courante et l'ajoute au tableau
            }
            result.add(row);  // Ajoute le tableau représentant la ligne dans l'ArrayList
        }

        return result;  // Retourne l'ArrayList contenant les données extraites
    }

    public void close() {
        try {
            connection.close();  // Ferme la connexion à la base de données
            System.out.println("Connexion à la base de données fermée");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
