/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.services;

/**
 *
 * @author Luiz Dorval
 * @since 05/07/2019
 * @version 1.0.1 beta C56
 */
public class ServicesFactory {
    private static final YachtServices YACHTSERVICES = new YachtServices();
    
    public static YachtServices getYachtServices() {
        return YACHTSERVICES;
    }

    private static final ProviderServices PROVIDERSERVICES = new ProviderServices();
    
    public static ProviderServices getProviderServices() {
        return PROVIDERSERVICES;
    }
}
