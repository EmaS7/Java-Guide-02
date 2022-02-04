

package Ej12;

import java.util.Scanner;

/**
 *
 * @author $EmaS7
 */
public class NewMainej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona pers = new Persona();
        
        ServicePer.crearPersona(pers);       
        System.out.println("Fecha ingresada: "+pers.getFechaNacimiento().toString());
        ServicePer.calcularEdad(pers);
    }

}
