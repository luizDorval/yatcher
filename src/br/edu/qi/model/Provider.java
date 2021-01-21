/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.model;

/**
 *
 * @author Luiz Dorval
 * @since 10/07/2019
 * @version 1.0.1 beta C56
 */
public class Provider {
    
    private long idprovider;
    private String name;
    private String cpf;
    private String email;
    private String phoneNumber;
    private int age;

    public Provider() {
    }
    
    /**
     * 
     * @param idprovider recebe um código de identificação de um fornecedor
     * @param name recebe o nome de um fornecedor
     * @param cpf recebe o cpf de um fornecedor
     * @param email recebe o email de um fornecedor
     * @param phoneNumber recebe o telefone de um fornecedor
     * @param age recebe a idade de um fornecedor
     */
    public Provider(long idprovider, String name, String cpf, String email, String phoneNumber, int age) {
        this.idprovider = idprovider;
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public long getIdprovider() {
        return idprovider;
    }

    public void setIdprovider(long idprovider) {
        this.idprovider = idprovider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nIdprovider = " + idprovider 
             + "\nNome = " + name 
             + "\nCPF = " + cpf 
             + "\nE-mail = " + email 
             + "\nTelefone = " + phoneNumber 
             + "\nIdade = " + age;
    }
    
    
}
