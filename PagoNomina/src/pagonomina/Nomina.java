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
                return 845000;
            case "Jefe planta":
                return 900000;
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
     * calcula la suma de los sueldos reales de una lista de empleados
     * @param listaEmpleados
     * @return double
     */
    double calcularSumaSueldos(Empleado listaEmpleados[]){
        double suma = 0;
        if(listaEmpleados!=null){
            for(int i= 0; i<listaEmpleados.length; i++){
                 System.out.println(calcularSueldoReal(listaEmpleados[i]));
                 suma += calcularSueldoReal(listaEmpleados[i]);
            }
            return suma;
        }
        else{
            return suma;
        }
    }
    
    /**
     * Calcula el sueldo real de una lista de empleados
     * @param listaEmpleados a calcular la lista de los sueldos
     * @return double[] con la lista de los sueldos reales
     */
    double[] calcularSueldoEmpleados(Empleado listaEmpleados[]){
        
        if(listaEmpleados!=null){
            double[] listaSueldos = new double[listaEmpleados.length];
            for(int i= 0; i<listaEmpleados.length; i++){
                 System.out.println(calcularSueldoReal(listaEmpleados[i]));
                 listaSueldos[i] = calcularSueldoReal(listaEmpleados[i]);
            }
            return listaSueldos;
        }
        else{
            return null;
        }
    }
    
    /**
     * Calcula el promedio de una lista de empeados
     * @param listaEmpleados a calcular el promedio
     * @return double con el promedio
     */
    double calcularPromedioSueldos(Empleado listaEmpleados[]){
        
        double promedio = 0;
        
        if(listaEmpleados!=null){
            for(int i= 0; i<listaEmpleados.length; i++){
                 promedio += calcularSueldoReal(listaEmpleados[i]);
            }
            return (promedio/listaEmpleados.length);
        }
        else{
            return promedio;
        }
            
        
    }
    
    
    /**
     * Recibe un arreglo de empleados y retorna un ArrayList con las cédulas de todos los empleados.
     * @param listaEmpleados a listar la cedula
     * @return String[] con las cedulas de los empleados
     */
    String[] obtenerIdEmplados(Empleado listaEmpleados[]){
        
        if(listaEmpleados!=null){
            String[] idCedula = new String[listaEmpleados.length];
            for(int i= 0; i<listaEmpleados.length; i++){
                 idCedula[i] = listaEmpleados[i].getCedula();
            }

            return idCedula;
        }else{
            return null;
        }
        
    }
    
    /**
     * Recibe una lista de empleados y computa la suma de todos los salarios en bruto de los empleados
     * @param listaEmpleados a calcular la suma de los sueldos brutos
     * @return double con la suma de los sueldos
     */
    double calcularTotalAPagar(Empleado listaEmpleados[]){
        double totalSueldos = 0;
        if(listaEmpleados!=null){
            for(int i= 0; i<listaEmpleados.length; i++){
                 totalSueldos += calcularSueldoBruto(listaEmpleados[i]);
            }
            return totalSueldos;
        }else{
            return 0;
        }
        
    }
    
    
    /**
     * Recibe una lista de empleados y devuelve el que tenga el menor sueldo.
     * @param listaEmpleados
     * @return 
     */
    String obtenerEmpleadoGanaMenos(Empleado listaEmpleados[]){
        
        int menor = 0;
        if(listaEmpleados!=null){
            for(int i= 0; i<listaEmpleados.length; i++){
                 if(calcularSueldoBruto(listaEmpleados[menor])>calcularSueldoBruto(listaEmpleados[i])){
                     menor = i;
                 }
            }

            return "El empleados de menor sueldo es:"+listaEmpleados[menor].getNombres()+" "+listaEmpleados[menor].getApellidos()+", cedula: "+listaEmpleados[menor].getCedula();
        }else{
            return "No hay empleados en la lista";

        }
    }
}
