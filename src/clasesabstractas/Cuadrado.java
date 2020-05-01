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
public class Cuadrado extends Figura {
    
    private double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    public double getLado() {
        return this.lado;
    }
    
    public String getDescripcion() {
        return "Cuadrado (" + getLado() + " de lado): " + getPerimetro() + " de perímetro y " +
                getArea() + " de área.";
    }
    
    public double getPerimetro() {
        return 4 * this.lado;
    }
    
    public double getArea() {
        return Math.pow(lado, 2);
    }
    
}
