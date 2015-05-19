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
public class Nomina {
    
    /**
     * Calculo de sueldo bruto a base del cargo del empleado
     * @param miEmpleado
     * @return double con el sueldo bruto
     */
    double calcularSueldoBruto(Empleado miEmpleado)
    {
        switch(miEmpleado.getCargo()){
            case "Gerente":
                return 5000000;                
            case "Secretaria":
                return 1000000;
            case "Vendedor":
                return 1520000;
            case "Operador":
                return 8450000;
            case "Jefe planta":
                return 8000000;
            default:
                return -1;
                
        }
    }
    
    /**
     * Calcula el suelo real a base del porcentaje de contribucion
     * @param miEmpleado
     * @return double con el sueldo real
     */
    double calcularSueldoReal(Empleado miEmpleado){
        
        double sueldoReal = calcularSueldoBruto(miEmpleado)*0.92;        
        return sueldoReal;
    }
    
    /**
     * Calcula el sueldo real de una lista de empleados
     * @param listaEmpleados a calcular la suma de los sueldos
     * @return double con la suma de los sueldos reales
     */
    double calcularSueldoEmpleados(Empleado listaEmpleados[]){
        
        double totalSueldos = 0;
        for(int i= 0; i<listaEmpleados.length; i++){
             totalSueldos += calcularSueldoReal(listaEmpleados[i]);
        }
        return totalSueldos;
    }
    
    /**
     * Calcula el promedio de una lista de empeados
     * @param listaEmpleados a calcular el promedio
     * @return double con el promedio
     */
    double calcularPromedioSueldos(Empleado listaEmpleados[]){
        
        double promedio = (calcularSueldoEmpleados(listaEmpleados)/listaEmpleados.length);
        return promedio;
    }
    
    
    /**
     * Recibe un arreglo de empleados y retorna un ArrayList con las cédulas de todos los empleados.
     * @param listaEmpleados a listar la cedula
     * @return String[] con las cedulas de los empleados
     */
    String[] obtenerIdEmplados(Empleado listaEmpleados[]){
        
        String[] idCedula = new String[listaEmpleados.length];
        for(int i= 0; i<listaEmpleados.length; i++){
             idCedula[i] = listaEmpleados[i].getCedula();
        }
        
        return idCedula;
        
    }
    
    /**
     * Recibe una lista de empleados y computa la suma de todos los salarios en bruto de los empleados
     * @param listaEmpleados a calcular la suma de los sueldos brutos
     * @return double con la suma de los sueldos
     */
    double calcularTotalAPagar(Empleado listaEmpleados[]){
        double totalSueldos = 0;
        for(int i= 0; i<listaEmpleados.length; i++){
             totalSueldos += calcularSueldoBruto(listaEmpleados[i]);
        }
        return totalSueldos;
    }
    
    
    /**
     * Recibe una lista de empleados y devuelve el que tenga el menor sueldo.
     * @param listaEmpleados
     * @return 
     */
    String obtenerEmpleadoGanaMenos(Empleado listaEmpleados[]){
        
        int menor = 0;
        for(int i= 0; i<listaEmpleados.length; i++){
             if(calcularSueldoBruto(listaEmpleados[menor])>calcularSueldoBruto(listaEmpleados[i])){
                 menor = i;
             }
        }
        
        return "El empleados de menor sueldo es:"+listaEmpleados[menor].getNombres()+" "+listaEmpleados[menor].getApellidos()+", cedula: "+listaEmpleados[menor].getCedula();
    }
}
