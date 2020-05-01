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
public class Alumno extends Persona {
    
    private String carrera;
    
    public Alumno(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }
    
    @Override
    public String getDescripcion() {
        return "Este alumno está estudiando la carrera de " + this.carrera;
    }
    
}
