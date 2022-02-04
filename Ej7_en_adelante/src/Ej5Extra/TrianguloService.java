/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej5Extra;

import java.util.Scanner;


/*
  @author $EmaS7
 */
public class TrianguloService {
  static Scanner leer = new Scanner(System.in).useDelimiter("\n");
 
    public static Triangulo crear() {
//        System.out.print("Ingrese el lado que se repite: ");
//        double repetido = leer.nextDouble();
//        System.out.print("Ingrese el lado que no se repite: ");
//        double base = leer.nextDouble();
//        return new Triangulo(repetido, base);
        return new Triangulo(Math.random() * 10, Math.random() * 10);
    }
 
    public static double calcularAltura(Triangulo tri) {
        return Math.sqrt(Math.pow(tri.getLadoRepetido(), 2) - (Math.pow(tri.getLadoNoRepetido(), 2) / 4));
    }
 
    public static double calcularArea(Triangulo tri) {
        return tri.getLadoNoRepetido() * calcularAltura(tri);
    }
 
    public static double calcularPerimetro(Triangulo tri) {
        return tri.getLadoNoRepetido() + 2 * tri.getLadoRepetido();
    }
 
}
