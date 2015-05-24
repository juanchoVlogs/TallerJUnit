/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagonomina;

import javax.swing.JOptionPane;
import java.util.Arrays;


/**
 *
 * @author alvaroms
 */
public class PagoNomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion = 1;
        while(opcion!= 0){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite: 1-sueldo bruto empleado \n "
                                                                + " 2- suelo real empleado \n"
                                                                + " 3- calcular sueldo empleados \n"
                                                                + " 4- calcular suma sueldos \n"
                                                                + " 5- calcular promedios sueldos\n"
                                                                + " 6- obtener id empleados \n"
                                                                + " 7- calcular total a pagar \n"
                                                                + " 8- obtener empleado gana menos \n"
                                                                + " 0- salir \n"));
            switch(opcion){
                case 1:
                    String nombres = JOptionPane.showInputDialog("Ingrese el nombre del empleado ");
                    String apellidos = JOptionPane.showInputDialog("Ingrese el apellido del empleado ");
                    String cedula = JOptionPane.showInputDialog("Ingrese el cedula del empleado ");
                    String cargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado ");
                    Empleado miEmpleado = new Empleado(nombres, apellidos, cargo, cedula);
                    Nomina nominaEmp = new Nomina();
                    JOptionPane.showMessageDialog(null, nominaEmp.calcularSueldoBruto(miEmpleado)); 
                    break;
                case 2:
                    nombres = JOptionPane.showInputDialog("Ingrese el nombre del empleado ");
                    apellidos = JOptionPane.showInputDialog("Ingrese el apellido del empleado ");
                    cedula = JOptionPane.showInputDialog("Ingrese el cedula del empleado ");
                    cargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado ");
                    miEmpleado = new Empleado(nombres, apellidos, cargo, cedula);
                    nominaEmp = new Nomina();
                    JOptionPane.showMessageDialog(null, nominaEmp.calcularSueldoReal(miEmpleado)); 
                    break;
                case 3: 
                    int numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de empleados que desea crear "));
                    Empleado[] listaEmpleados = new Empleado[numeroEmpleados];
                    for(int i= 0; i<numeroEmpleados; i++){
                        nombres = JOptionPane.showInputDialog("Ingrese el nombre del empleado ");
                        apellidos = JOptionPane.showInputDialog("Ingrese el apellido del empleado ");
                        cedula = JOptionPane.showInputDialog("Ingrese el cedula del empleado ");
                        cargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado ");
                        miEmpleado = new Empleado(nombres, apellidos, cargo, cedula);
                        listaEmpleados[i]= miEmpleado;
                        
                    }
                    nominaEmp = new Nomina();
                    JOptionPane.showMessageDialog(null, nominaEmp.calcularSueldoEmpleados(listaEmpleados).toString());
                    break;
                case 4:
                    numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de empleados que desea crear "));
                    listaEmpleados = new Empleado[numeroEmpleados];
                    for(int i= 0; i<numeroEmpleados; i++){
                        nombres = JOptionPane.showInputDialog("Ingrese el nombre del empleado ");
                        apellidos = JOptionPane.showInputDialog("Ingrese el apellido del empleado ");
                        cedula = JOptionPane.showInputDialog("Ingrese el cedula del empleado ");
                        cargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado ");
                        miEmpleado = new Empleado(nombres, apellidos, cargo, cedula);
                        listaEmpleados[i]= miEmpleado;
                        
                    }
                    nominaEmp = new Nomina();
                    JOptionPane.showMessageDialog(null, nominaEmp.calcularSumaSueldos(listaEmpleados));
                    break;
                case 5:
                    numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de empleados que desea crear "));
                    listaEmpleados = new Empleado[numeroEmpleados];
                    for(int i= 0; i<numeroEmpleados; i++){
                        nombres = JOptionPane.showInputDialog("Ingrese el nombre del empleado ");
                        apellidos = JOptionPane.showInputDialog("Ingrese el apellido del empleado ");
                        cedula = JOptionPane.showInputDialog("Ingrese el cedula del empleado ");
                        cargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado ");
                        miEmpleado = new Empleado(nombres, apellidos, cargo, cedula);
                        listaEmpleados[i]= miEmpleado;
                        
                    }
                    nominaEmp = new Nomina();
                    JOptionPane.showMessageDialog(null, nominaEmp.calcularPromedioSueldos(listaEmpleados));
                    break;
                case 6:
                    numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de empleados que desea crear "));
                    listaEmpleados = new Empleado[numeroEmpleados];
                    for(int i= 0; i<numeroEmpleados; i++){
                        nombres = JOptionPane.showInputDialog("Ingrese el nombre del empleado ");
                        apellidos = JOptionPane.showInputDialog("Ingrese el apellido del empleado ");
                        cedula = JOptionPane.showInputDialog("Ingrese el cedula del empleado ");
                        cargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado ");
                        miEmpleado = new Empleado(nombres, apellidos, cargo, cedula);
                        listaEmpleados[i]= miEmpleado;
                        
                    }
                    nominaEmp = new Nomina();
                    JOptionPane.showMessageDialog(null, nominaEmp.obtenerIdEmplados(listaEmpleados));
                    break;
                case 7:
                    numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de empleados que desea crear "));
                    listaEmpleados = new Empleado[numeroEmpleados];
                    for(int i= 0; i<numeroEmpleados; i++){
                        nombres = JOptionPane.showInputDialog("Ingrese el nombre del empleado ");
                        apellidos = JOptionPane.showInputDialog("Ingrese el apellido del empleado ");
                        cedula = JOptionPane.showInputDialog("Ingrese el cedula del empleado ");
                        cargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado ");
                        miEmpleado = new Empleado(nombres, apellidos, cargo, cedula);
                        listaEmpleados[i]= miEmpleado;
                        
                    }
                    nominaEmp = new Nomina();
                    JOptionPane.showMessageDialog(null, nominaEmp.calcularTotalAPagar(listaEmpleados));
                    break;
                case 8:
                    numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de empleados que desea crear "));
                    listaEmpleados = new Empleado[numeroEmpleados];
                    for(int i= 0; i<numeroEmpleados; i++){
                        nombres = JOptionPane.showInputDialog("Ingrese el nombre del empleado ");
                        apellidos = JOptionPane.showInputDialog("Ingrese el apellido del empleado ");
                        cedula = JOptionPane.showInputDialog("Ingrese el cedula del empleado ");
                        cargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado ");
                        miEmpleado = new Empleado(nombres, apellidos, cargo, cedula);
                        listaEmpleados[i]= miEmpleado;
                        
                    }
                    nominaEmp = new Nomina();
                    JOptionPane.showMessageDialog(null, nominaEmp.obtenerEmpleadoGanaMenos(listaEmpleados));
                    break;
                default:                    
                    JOptionPane.showMessageDialog(null, "Por favor digite una opcion valida");
                    break;
            }
        } 
    }
    
}
