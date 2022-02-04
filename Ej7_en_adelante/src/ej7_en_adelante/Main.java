/*Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el
código con una cláusula try-catch para probar la nueva excepción que debe ser
controlada.*/

package ej7_en_adelante;

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
    int vecMC[] = new int [4];
    boolean vecEdad[] = new boolean [4];
    double mayor=0,sobrePeso=0,bajoPeso=0,pesoIdeal=0; 
    
    Persona per = new Persona();
    per=null;
    try{
        PersonaService.esMayorEdad(per);
    }catch(Exception e){
        System.out.println("error 404");
    }
    
//    Persona per2 = new Persona();
//    Persona per3 = new Persona();
//    Persona per4 = new Persona();
    
//    PersonaService.crearPersona(per);
//    vecMC[0] = PersonaService.calcularMC(per);
//    vecEdad[0]=PersonaService.esMayorEdad(per);
    
//    PersonaService.crearPersona(per2);
//    vecMC[1]=PersonaService.calcularMC(per2);
//    vecEdad[1]=PersonaService.esMayorEdad(per2);
//    
//    PersonaService.crearPersona(per3);
//    vecMC[2]=PersonaService.calcularMC(per3);
//    vecEdad[2]=PersonaService.esMayorEdad(per3);
//    
//    PersonaService.crearPersona(per4);
//    vecMC[3]=PersonaService.calcularMC(per4);
//    vecEdad[3]=PersonaService.esMayorEdad(per4);
//    
        for (int i = 0; i < 4; i++) {
            if(vecEdad[i]){
                mayor+=25;
            }
        
        switch(vecMC[i]){
            case -1:
                bajoPeso+=25;
                break;
            case 0:
                pesoIdeal+=25;
                break;
            case 1:
                sobrePeso+=25;
                break;
        }
    }
       System.out.println("Porcentaje de Personas con: " +"\n"+ "Bajo Peso: " + bajoPeso + " %" + "\n" +
                           "Peso Ideal: " + pesoIdeal + " %" + "\n" +
                           "Sobrepeso: " + sobrePeso + " %" );
        
        
        System.out.println("El porcentaje de personas mayores es: " + mayor + " %"+"\n"+
                           "El porcentaje de personas menores es: " + (100-mayor) + " %");
    
  }
}
