/*
Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
 */

package Ej12;

import java.util.Date;
import java.util.Scanner;


/*
  @author $EmaS7
 */
public class ServicePer {
    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    
    public static void crearPersona(Persona pers){
        int anio, mes, dia;
        System.out.println("Ingrese un nombre: "); pers.setNombre(read.next());
        
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.println("Dia: "); dia = read.nextInt();
        System.out.println("Mes: "); mes = read.nextInt();
        System.out.println("Año: "); anio = read.nextInt();
        Date fecha = new Date();
        fecha.setDate(dia);
        fecha.setMonth(mes-1);
        fecha.setYear(anio-1900);
        ServicePer.llenaFecha(fecha, pers);
       
    }
    
    public static void llenaFecha(Date fecha, Persona pers){
        pers.setFechaNacimiento(fecha);
    }
    public static void calcularEdad(Persona pers){
        Date fechaActual = new Date();
        int calc =fechaActual.getYear()-pers.getFechaNacimiento().getYear();
        System.out.println("La edad de la persona es: "+calc+" años");
        
    }
    
}
