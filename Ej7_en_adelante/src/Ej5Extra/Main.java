

package Ej5Extra;

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
        int n;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese cantidad de triangulos a generar aleatoriamente.");
        n = leer.nextInt();

        Triangulo[] arregloTri = new Triangulo[n];
 
        for (int i = 0; i < arregloTri.length; i++) {
 
            arregloTri[i] = TrianguloService.crear();
 
        }
 
        double aux = TrianguloService.calcularArea(arregloTri[0]);
        int auxPos = 0;
        for (int i = 1; i < arregloTri.length; i++) {
            if (TrianguloService.calcularArea(arregloTri[i]) > aux) {
                aux = TrianguloService.calcularArea(arregloTri[i]);
                auxPos = i;
            }
        }
 
        System.out.println(arregloTri[auxPos].toString());
 
        System.out.println("El area del triangulo " + (auxPos + 1) + " es de: " + TrianguloService.calcularArea(arregloTri[auxPos]));
        System.out.println("El perimetro del triangulo " + (auxPos + 1) + " es de: " + TrianguloService.calcularPerimetro(arregloTri[auxPos]));
    }


}


