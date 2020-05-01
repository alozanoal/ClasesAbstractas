/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesabstractas;

/**
 *
 * @author Airam
 */
public class Circulo extends Figura {
    
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return this.radio;
    }
    
    public String getDescripcion() {
        return "Círculo (" + getRadio() + " de radio): " + getPerimetro() + " de perímetro y " +
                getArea() + " de área.";
    }
    
    public double getPerimetro() {
        return 2 * Math.PI * this.radio;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
}
