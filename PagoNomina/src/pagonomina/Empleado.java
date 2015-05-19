/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagonomina;

/**
 *
 * @author alvaroms
 */
public class Empleado {
    
    private String nombres;
    private String Apellidos;
    private String cargo;
    private String cedula;

    

    public Empleado(String nombres, String Apellidos, String cargo, String cedula) {
        this.nombres = nombres;
        this.Apellidos = Apellidos;
        this.cargo = cargo;
        this.cedula = cedula;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    
}
