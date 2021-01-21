/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.dao;

/**
 *
 * @author Luiz Dorval
 * @since 04/07/2019
 * @version 1.0.1 beta C56
 */
public class DAOFactory {
    
    private static final YachtDAO YACHTDAO = new YachtDAO();
    
    public static YachtDAO getYachtDAO() {
        return YACHTDAO;
    }
    
    private static final ProviderDAO PROVIDERDAO = new ProviderDAO();
    
    public static ProviderDAO getProviderDAO() {
        return PROVIDERDAO;
    }
}
