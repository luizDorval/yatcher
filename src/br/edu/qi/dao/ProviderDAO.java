/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.dao;
import br.edu.qi.model.Provider;
import java.sql.Connection;
import java.sql.SQLException;
import br.edu.qi.persistance.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 * 
 *@author Luiz Dorval
 * @since 10/07/2019
 * @version 1.0.1 beta C56
 */
public class ProviderDAO {
    
    public void addProvider(Provider provider) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql;
            sql = "insert into provider(idprovider, name, cpf, email, phoneNumber, age)" +
                    "values(null, '" + provider.getName() +"','"+ provider.getCpf() +"','"
                    + provider.getEmail() +"','" + provider.getPhoneNumber() + "',"+ provider.getAge() +")"; 
            statement.execute(sql);
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao cadastrar! " + sQLException.getMessage());
        } finally {
            connection.close();
            statement.close();
        }
    }
    
    public ArrayList<Provider> searchProvider() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql = "select * from provider";
            ResultSet resultSet = statement.executeQuery(sql);
            ArrayList<Provider> providers = new ArrayList<>();
            while(resultSet.next()) {
                Provider provider = new Provider();
                provider.setIdprovider(resultSet.getLong("idprovider"));
                provider.setName(resultSet.getString("name"));
                provider.setCpf(resultSet.getString("cpf"));
                provider.setEmail(resultSet.getString("email"));
                provider.setPhoneNumber(resultSet.getString("phoneNumber"));
                provider.setAge(resultSet.getInt("age"));
                providers.add(provider);
            }
            return providers;
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao buscar! " + sQLException.getMessage());
        } finally {
            connection.close();
            statement.close();
        }
    }
    
    public void deleteProvider(long idProvider) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql;
            
            sql = "delete from provider where idprovider=" + idProvider;
            
            statement.execute(sql);
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao deletar! " + sQLException.getMessage());
        }finally{
            connection.close();
            statement.close();
        }
    }
    
    public void updateProvider(Provider provider) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql;
            
            sql = "update provider set " 
                    + "name=" + provider.getName()+ "," 
                    + "cpf='" + provider.getCpf()+ "',"
                    + "email='" + provider.getEmail()+ "',"
                    + "phoneNumber='" + provider.getPhoneNumber()+ "',"
                    + "age=" + provider.getAge() + " where idprovider=" + provider.getIdprovider();
            
            statement.execute(sql);
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao alterar! " + sQLException.getMessage());
        }finally{
            connection.close();
            statement.close();
        }
    }
    
    public ArrayList<Provider> filterProvider(String search, String filter) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        try {
            String query = "";
            if(filter.equalsIgnoreCase("código")) {
                query = "where idprovider = " + search;
            } else if(filter.equalsIgnoreCase("Nome")) {
                query = "where name like'%" + search + "%'";
            } else if(filter.equalsIgnoreCase("cpf")) {
                query = "where cpf like '%" + search + "%'";
            } else if(filter.equalsIgnoreCase("email")) {
                query = "where email like '%" + search + "%'";
            } else if(filter.equalsIgnoreCase("número de telefone")) {
                query = "where phoneNumber like '%" + search + "%'";
            } else if(filter.equalsIgnoreCase("idade")) {
                query = "where age like '%" + search + "%'";
            }
            
            String sql = "select * from provider " + query;
            
            ResultSet resultSet = statement.executeQuery(sql);
            ArrayList<Provider> providers = new ArrayList<>();
            while(resultSet.next()) {
                Provider provider = new Provider();
                provider.setIdprovider(resultSet.getLong("idprovider"));
                provider.setName(resultSet.getString("name"));
                provider.setCpf(resultSet.getString("cpf"));
                provider.setEmail(resultSet.getString("email"));
                provider.setPhoneNumber(resultSet.getString("phoneNumber"));
                provider.setAge(resultSet.getInt("age"));
                providers.add(provider);
            }
            return providers;
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao filtrar! " + sQLException.getMessage());
        } finally {
            connection.close();
            statement.close();
        }
        
    }
}
