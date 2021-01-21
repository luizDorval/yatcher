/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Luiz Dorval
 * @since 05/07/2019
 * @version 1.0.1 beta C56
 */
public class ConnectionFactory {

    //Atributos estáticos com os dados do Banco de Dados
    private static final String URL = "jdbc:mysql://localhost:3306/rental_agency";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    //Método que efetua a conexão com o MySQL
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao conectar! " + sQLException.getMessage());
        }//fecha catch
        return connection;
    }//fecha metodo
    
}//fecha classe

