/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.dao;

import br.edu.qi.model.Yacht;
import br.edu.qi.persistance.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Luiz Dorval
 * @since 04/07/2019
 * @version 1.0.1 beta C56
 */
public class YachtDAO {
    public void addYacht(Yacht yacht) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql;
            
            sql = "insert into yacht(idyacht, imo, model, color, type, material, width, height, weight)"
                    + "values(null, '"+ yacht.getImo() +"','" + yacht.getModel() + "','"+ yacht.getColor() + "','"+ yacht.getType() 
                    + "','"+ yacht.getMaterial() + "',"+ yacht.getWidth() + "," + yacht.getHeight() + "," + yacht.getWeight() +")";
            statement.execute(sql);
        } catch (SQLException sQLException) {
            throw new SQLException("Erro ao cadastrar! " + sQLException.getMessage());
        } finally {
            connection.close();
            statement.close();
        }
    }
    
    public ArrayList<Yacht> searchYacht() throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql = "select * from yacht";
            ResultSet resultSet = statement.executeQuery(sql);
            ArrayList<Yacht> yachts = new ArrayList<>();
            while(resultSet.next()) {
                Yacht yacht = new Yacht();
                yacht.setIdYacht(resultSet.getLong("idyacht"));
                yacht.setImo(resultSet.getInt("imo"));
                yacht.setModel(resultSet.getString("model"));
                yacht.setColor(resultSet.getString("color"));
                yacht.setType(resultSet.getString("type"));
                yacht.setMaterial(resultSet.getString("material"));
                yacht.setWidth(resultSet.getDouble("width"));
                yacht.setHeight(resultSet.getDouble("height"));
                yacht.setWeight(resultSet.getDouble("weight"));
                yachts.add(yacht);
            }
            return yachts;
        } catch (SQLException sQLException) {
             throw new SQLException ("ERRO! " + sQLException.getMessage());
        }finally{
            connection.close();
            statement.close();
        }
    }
    
    public void deleteYacht(long idYacht) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql;
            
            sql = "delete from yacht where idyacht=" + idYacht;
            
            statement.execute(sql);
        } catch (SQLException sQLException) {
            throw new SQLException("Erro! " + sQLException.getMessage());
        }finally{
            connection.close();
            statement.close();
        }
    }
    
    public void updateYacht(Yacht yacht) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        try {
            String sql;
            
            sql = "update yacht set " 
                    + "imo=" + yacht.getImo() + "," 
                    + "model='" + yacht.getModel() + "',"
                    + "color='" + yacht.getColor() + "',"
                    + "type='" + yacht.getType() + "',"
                    + "material='" + yacht.getMaterial() + "',"
                    + "width=" + yacht.getWidth() + ","
                    + "height=" + yacht.getHeight() + ","
                    + "weight=" + yacht.getWeight() + "where idyacht=" + yacht.getIdYacht();
            
            statement.execute(sql);
        } catch (SQLException sQLException) {
            throw new SQLException("Erro! " + sQLException.getMessage());
        }finally{
            connection.close();
            statement.close();
        }
    }
    
    public ArrayList<Yacht> filterYacht(String search, String filter) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        Statement statement = connection.createStatement();
        try {
            String query = "";
            if(filter.equalsIgnoreCase("código")) {
                query = "where idyacht = " + search;
            } else if(filter.equalsIgnoreCase("imo")) {
                query = "where imo like'%" + search + "%'";
            } else if(filter.equalsIgnoreCase("modelo")) {
                query = "where model like '%" + search + "%'";
            } else if(filter.equalsIgnoreCase("cor")) {
                query = "where color like '%" + search + "%'";
            } else if(filter.equalsIgnoreCase("tipó")) {
                query = "where type like '%" + search + "%'";
            } else if(filter.equalsIgnoreCase("material")) {
                query = "where material like '%" + search + "%'";
            } else if(filter.equalsIgnoreCase("largura")) {
                query = "where width like '%" + search + "%'";
            } else if(filter.equalsIgnoreCase("altura")) {
                query = "where height like '%" + search + "%'";
            } else if(filter.equalsIgnoreCase("peso")) {
                query = "where weight like '%" + search + "%'";
            }
            String sql = "select * from yacht " + query;
            
            ResultSet resultSet = statement.executeQuery(sql);
            ArrayList<Yacht> yachts = new ArrayList<>();
            while(resultSet.next()) {
                Yacht yacht = new Yacht();
                yacht.setIdYacht(resultSet.getLong("idyacht"));
                yacht.setImo(resultSet.getInt("imo"));
                yacht.setModel(resultSet.getString("model"));
                yacht.setColor(resultSet.getString("color"));
                yacht.setType(resultSet.getString("type"));
                yacht.setMaterial(resultSet.getString("material"));
                yacht.setWidth(resultSet.getDouble("width"));
                yacht.setHeight(resultSet.getDouble("height"));
                yacht.setWeight(resultSet.getDouble("weight"));
                yachts.add(yacht);
            }
            return yachts;
        } catch (SQLException sQLException) {
            throw new SQLException("Erro! " + sQLException.getMessage());
        } finally {
            connection.close();
            statement.close();
        }
        
    }
}
