

package Ej2;

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

        Puntos p1 = new Puntos();
        ServicePoint.crearPuntos(p1);
        double calculo = ServicePoint.calcularDistancia(p1);
        ServicePoint.mostrarResultado(p1, calculo);
    }

}
