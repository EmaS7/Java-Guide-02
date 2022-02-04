/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;

import java.util.Scanner;


/*
  @author $EmaS7
 */
public class ServiceCadena {

    public static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void longitud(Cadena cad) {
        cad.setLongitud(cad.getFrase().length());
        System.out.println("el largo de la cadena es: " + cad.getLongitud());
    }

    public static void mostrarVocales(Cadena cad) {
        int vocales = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().charAt(i) == 'a' || cad.getFrase().charAt(i) == 'e' || cad.getFrase().charAt(i) == 'i' || cad.getFrase().charAt(i) == 'o' || cad.getFrase().charAt(i) == 'u') { //ver si hay otra forma de hacelo
                vocales += 1;
            }
        }
        System.out.println("La frase contiene " + vocales + " vocales");
    }

    public static void invertirFrase(Cadena cad) {
        String reverse = "";
        for (int i = cad.getLongitud() - 1; i >= 0; i--) {
            reverse += cad.getFrase().charAt(i);
        }
        System.out.println("Palabra invertida: " + reverse);
    }

    public static void vecesRepetido(Cadena cad, char letra) {
        int repeticion = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().charAt(i) == letra) {
                repeticion += 1;
            }
        }
        System.out.println("En la frase: " + cad.getFrase() + " la letra " + letra + " se repite " + repeticion + " veces");
    }

    public static void compararLongitud(Cadena cad, Cadena cad2) {
        if (cad.getFrase().length() > cad2.getFrase().length()) {
            System.out.println("La segunda frase es mas larga");
        } else {
            System.out.println("La primera frase es mas larga");
        }

    }

    public static void unirFrases(Cadena cad, Cadena cad2) {
        System.out.println("La frase unida: " + cad.getFrase().concat(cad2.getFrase()));
    }

    public static void reemplazar(Cadena cad, Cadena cad2, char letra) {
        String newFrase = null, newFrase2 = null;
        for (int i = 0; i < cad2.getFrase().length(); i++) {
            for (int j = 0; j < cad.getFrase().length(); j++) {
                // if(cad2.getFrase().charAt(j)== 'a')
                newFrase2 = cad2.getFrase().replace('a', letra);
            }
            newFrase = cad.getFrase().replace('a', letra);
        }
        System.out.println("reemplazo: " + newFrase.concat(newFrase2));
    }

    public static void contiene(Cadena cad, Cadena cad2, char letra) {
        boolean var = false;
        for (int i = 0; i < cad2.getFrase().length(); i++) {
            for (int j = 0; j < cad.getFrase().length(); j++) {
                if (cad2.getFrase().charAt(j) == letra) {
                    var = true;
                    break;
                }
                if (cad.getFrase().charAt(i) == letra) {
                    var = true;
                    break;
                }
            }

        }
        if (var == true) {
            System.out.println("La letra " + letra + " esta en la frase");
        } else {
            System.out.println("No esta la letra en la frase");
        }

    }
}
