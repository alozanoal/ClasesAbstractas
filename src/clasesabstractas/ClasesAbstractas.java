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
public class ClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona[] personas = {new Empleado("Luis Conde", 50000, 2009, 2, 25),
                              new Alumno("Ana López", "Biológicas")};
        for(Persona persona : personas) {            
            System.out.printf("%s: %s.%n", persona.getNombre(), persona.getDescripcion());
        }
        
        System.out.println("----------------------------------------------------");
        
        Figura[] figuras = {new Cuadrado(5),
                            new Circulo(5),
                            new Triangulo(3, 4, 5)};
        for(Figura figura : figuras) {
            System.out.println(figura.getDescripcion());
        }
    }
    
}
