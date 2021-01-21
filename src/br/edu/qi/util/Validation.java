/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.util;

/**
 *
 * @author Luiz Dorval
 * @since 08/07/2019
 * @version 1.0.1 beta C56 
 */
public class Validation {
    
    public static boolean validateImo(String validateImo) {
        return validateImo.matches("^[0-9]{7}$");
    }
    public static boolean validateModel(String validateModel) {
        return validateModel.matches("^[a-zA-Z0-9 ]{1,30}$");
    }
    
    public static boolean validateColor(String validateColor) {
        return validateColor.matches("^[a-zA-Z ]{4,30}$");
    }
    
    public static boolean validateMaterial(String validateMaterial) {
        return validateMaterial.matches("^[a-zA-Z ]{3,120}$");
    }
    
    public static boolean validateWidth(String validateWidth) {
        return validateWidth.matches("^[0-9]{1,99}$");
    }
    
    public static boolean validateHeight(String validateHeight) {
        return validateHeight.matches("^[0-9]{1,99}$");
    }
    
    public static boolean validateWeight(String validateWeight) {
        return validateWeight.matches("^[0-9]{1,99}$");
    }
    
    public static boolean validateName(String validateName) {
        return validateName.matches("^[a-zA-Z ]{2,30}$");
    }
    
    public static boolean validateCpf(String validateCpf) {
        return validateCpf.matches("^[0-9]{11}$");
    }
    
    public static boolean validatePhoneNumber(String validatePhoneNumber) {
        return validatePhoneNumber.matches("^[0-9]{9,20}$");
    }
    
    public static boolean validateAge(String validateAge) {
        return validateAge.matches("^[0-9]{1,3}$");
    }
}
