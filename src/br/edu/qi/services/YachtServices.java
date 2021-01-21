/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.services;

import br.edu.qi.model.Yacht;
import br.edu.qi.dao.DAOFactory;
import br.edu.qi.dao.YachtDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Luiz Dorval
 * @since 05/07/2019
 * @version 1.0.1 beta C56
 */
public class YachtServices {
    public void addYacht(Yacht yacht) throws SQLException {
        YachtDAO yachtDAO = DAOFactory.getYachtDAO();
        yachtDAO.addYacht(yacht);
        
    }
    
    public ArrayList<Yacht> searchYachts() throws SQLException {
            YachtDAO yachtDAO = DAOFactory.getYachtDAO();
            return yachtDAO.searchYacht();
        }

    public void deleteYacht(long idYacht) throws SQLException {
        YachtDAO yachtDAO = DAOFactory.getYachtDAO();
        yachtDAO.deleteYacht(idYacht);
    }
    
    public void updateYacht(Yacht yacht) throws SQLException {
        YachtDAO yachtDAO = DAOFactory.getYachtDAO();
        yachtDAO.updateYacht(yacht);
    } 
    
    public ArrayList<Yacht> filterYacht(String search, String filter) throws SQLException {
        YachtDAO yachtDAO = DAOFactory.getYachtDAO();
        return yachtDAO.filterYacht(search, filter);
    }
}
