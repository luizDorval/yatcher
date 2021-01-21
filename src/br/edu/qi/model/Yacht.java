/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.qi.model;

/**
 *
 * @author Luiz Dorval
 * @since 04/07/2019
 * @version 1.0.1 beta C56
 */
public class Yacht {
    
    private long idyacht;
    private int imo;
    private String model;
    private String color;
    private String type;
    private String material;
    private double width;
    private double height;
    private double weight;

    public Yacht() {
    }

    /**
     * 
     * @param idyacht recebe um codigo de identificação de um yacht
     * @param imo recebe um imo
     * @param model recebe um modelo
     * @param color recebe um cor
     * @param type recebe um tipo
     * @param material recebe um material
     * @param width recebe uma largura
     * @param height recebe uma altura
     * @param weight  recebe um peso
     */
    public Yacht(long idyacht, int imo, String model, String color, String type, String material, double width, double height, double weight) {
        this.idyacht = idyacht;
        this.imo = imo;
        this.model = model;
        this.color = color;
        this.type = type;
        this.material = material;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public long getIdYacht() {
        return idyacht;
    }

    public void setIdYacht(long idyacht) {
        this.idyacht = idyacht;
    }

    public int getImo() {
        return imo;
    }

    public void setImo(int imo) {
        this.imo = imo;
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    /**
     * 
     * @return calcula a capacidade de pessoas do iate 
     */
    public double calculatePeopleCapacity() {
        return (width * height) / 15;
    }
    
    /**
     * 
     * @return calcula a capacidade de peso do iate 
     */
    public double calculateWeightCapacity() {
        return calculatePeopleCapacity() * 68;
    }
    
    @Override
    public String toString() {
        return "\nIdyacht = " + idyacht
             + "\nIMO = " + imo
             +  "\nModel = " + model 
             + "\nColor = " + color 
             + "\nType = " + type 
             + "\nMaterial = " + material 
             + "\nWidth = " + width 
             + "\nHeight = " + height 
             + "\nWeight = " + weight;
    }
    
    
}
