/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesabstractas;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Airam
 */
public class Empleado extends Persona {
    
    private static int idSiguiente;
    
    private double sueldo;
    private Date altaContrato;
    private int id;
        
    public Empleado(String nombre, double sueldo, int agno, int mes, int dia) {
        super(nombre);
        this.sueldo = sueldo;
        this.altaContrato = (new GregorianCalendar(agno, mes - 1, dia)).getTime();
        ++idSiguiente;
        this.id = idSiguiente;
    }
    
    public double getSueldo() {
        return this.sueldo;
    }
    
    public Date getAltaContrato() {
        return this.altaContrato;
    }
    
    public void subeSueldo(double porcentaje) {
        double aumento = this.sueldo * (porcentaje / 100);
        this.sueldo += aumento;
    }
    
    @Override
    public String getDescripcion() {
        return "Este empleado tiene el Id " + this.id + " y un sueldo de " +
                String.format("%.2f", this.sueldo) + " €";
    }
    
}
