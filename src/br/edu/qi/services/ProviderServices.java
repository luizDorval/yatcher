/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.services;

import br.edu.qi.dao.DAOFactory;
import br.edu.qi.dao.ProviderDAO;
import br.edu.qi.model.Provider;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Luiz Dorval
 * @since 10/07/2019
 * @version 1.0.1 beta C56
 */
public class ProviderServices {
    public void addProvider(Provider provider) throws SQLException {
        ProviderDAO providerDAO = DAOFactory.getProviderDAO();
        providerDAO.addProvider(provider);
    }
    
    public ArrayList<Provider> searchProvider() throws SQLException {
        ProviderDAO providerDAO = DAOFactory.getProviderDAO();
        return providerDAO.searchProvider();
    }
    
    public void deleteProvider(long idProvider) throws SQLException {
        ProviderDAO providerDAO = DAOFactory.getProviderDAO();
        providerDAO.deleteProvider(idProvider);
    }
    
    public void updateProvider(Provider provider) throws SQLException {
        ProviderDAO providerDAO = DAOFactory.getProviderDAO();
        providerDAO.updateProvider(provider);
    } 
    
    public ArrayList<Provider> filterProvider(String search, String filter) throws SQLException {
        ProviderDAO providerDAO = DAOFactory.getProviderDAO();
        return providerDAO.filterProvider(search, filter);
    }
}
