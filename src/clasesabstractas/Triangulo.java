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
public class Triangulo extends Figura {
    
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
            
    public double getLadoA() {
        return this.ladoA;
    }
    
    public double getLadoB() {
        return this.ladoB;
    }
    
    public double getLadoC() {
        return this.ladoC;
    }
    
    public String getDescripcion() {
        return "Triángulo (lados " + getLadoA() + ", " + getLadoB() + ", " + getLadoC() + "): " +
                getPerimetro() + " de perímetro y " + getArea() + " de área.";
    }
    
    public double getPerimetro() {
        return this.ladoA + this.ladoB + this.ladoC;         
    }
    
    public double getArea() {
        // Fórmula de Herón
        double semiP = getPerimetro() / 2;
        return Math.sqrt(semiP * (semiP - this.ladoA) * (semiP - this.ladoB) * (semiP - this.ladoC));
    }
    
}
