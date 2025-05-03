package application;

import db.DataBase;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Connection connection = DataBase.getConnection();

        if (connection != null) {
            System.out.println("Conectado com Sucesso! :)");
            DataBase.closeConnection();

        } else {
            System.out.println("Conexão com Banco de Dados FALHOU! ):");
        }
    }
}