

package ej222;

import ej222.newpackage.Circunferencia;
import java.util.Scanner;


/**
 *
 * @author $EmaS7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Circunferencia c1 = new Circunferencia();
        
        //c1.crearCircunferencia();
        Scanner read = new Scanner(System.in);
        double radio;
        System.out.println("Ingrese radio: " ); radio = read.nextDouble();
        Circunferencia c1 = new Circunferencia(radio);
        System.out.println("El area es: " +c1.area());
        c1.perimetro();
    }

}
