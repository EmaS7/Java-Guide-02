

package ej11;

import java.util.Date;
import java.util.Scanner;

/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();

Si necesiten acá tienen más información en clase Date: Documentacion Oracle
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Date dateActual = new Date();
        
        System.out.println("Introduzca una fecha: "); Date fecha = new Date(read.nextInt(), read.nextInt(), read.nextInt());
        //Date fecha = new Date(anio,mes,dia);
        System.out.println("Fecha ingresada: "+fecha);
        System.out.println("------------------------");
        System.out.println("Fecha Actual: "+dateActual);
        int calc = dateActual.getYear() - fecha.getYear();
         System.out.println("------------------------");
        System.out.println("La diferencia de anios es: " +calc);
        

    }

}
