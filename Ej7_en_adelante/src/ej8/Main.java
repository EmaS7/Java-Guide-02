

package ej8;

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
       
        Cadena cad = new Cadena();
        Cadena cad2 = new Cadena();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String letter, letter2, letter3;
        
        System.out.println("Ingrese una palabra o frase: "); cad.setFrase(read.next());
        System.out.println("Ingrese un caracter para buscar su repeticion: "); letter = read.next();
        char letra = letter.charAt(0);
        
       ServiceCadena.longitud(cad);
       ServiceCadena.mostrarVocales(cad);
       //Cadena.mostrarVocalesv2(cad);
       ServiceCadena.invertirFrase(cad);
       ServiceCadena.vecesRepetido(cad, letra);
    
       //cad2.setFrase("Blanca");
       System.out.println("Ingrese una nueva frase: "); cad2.setFrase(read.next());
       ServiceCadena.compararLongitud(cad, cad2);
       ServiceCadena.unirFrases(cad, cad2);
       System.out.println("Ingrese un caracter para reemplazar por la 'a': "); letter2 = read.next();
       char letra2 = letter2.charAt(0);
       ServiceCadena.reemplazar(cad, cad2, letra2);
       System.out.println("Ingrese un caracter a buscar en la frase: "); letter3 = read.next();
       char letra3 = letter3.charAt(0);
       ServiceCadena.contiene(cad,cad2, letra3);

    }

}
