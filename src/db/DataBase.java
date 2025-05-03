package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataBase {
    private static Connection connection = null;
    private static final String URL = "dburl";
    private static final String DB_PROPERTIES_FILE = "db.properties";

    /**
     * Estabelece e retorna uma Conexão com o Banco de Dados
     * @return Connection
     */
    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties properties = loadProperties();
                String url = properties.getProperty(URL);
                connection = DriverManager.getConnection(url, properties);

            } catch (SQLException e) {
                throw new DataBaseException(e.getMessage());
            }
        }
        return connection;
    }

    /**
     * Fecha a Conexão com o Banco de Dados, caso esteja aberta
     */
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new DataBaseException(e.getMessage());
            }
        }
    }

    /**
     * Carrega as propriedades do arquivo "db.properties" e popula um Objeto Properties
     * @return Properties
     */
    private static Properties loadProperties() {
        try (FileInputStream fileInputStream = new FileInputStream(DB_PROPERTIES_FILE)) {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            return properties;

        } catch (IOException e) {
            throw new DataBaseException(e.getMessage());
        }
    }
}