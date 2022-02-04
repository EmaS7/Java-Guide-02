

package ej2;

import ej2.newpackage.Circunferencia;
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
        
    Scanner read = new Scanner(System.in);
    
    Circunferencia circ1 = new Circunferencia();
    
    circ1.creacCircunferencia();
    circ1.area();
    circ1.perim();
        
    }

}
