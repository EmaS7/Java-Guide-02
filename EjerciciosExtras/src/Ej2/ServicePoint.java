/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
 */

package Ej2;

import java.util.Scanner;


/*
  @author $EmaS7
 */
public class ServicePoint {
    static Scanner read = new Scanner(System.in);
    public static void crearPuntos(Puntos p1){
        System.out.println("Ingrese las coordenadas del punto 1: "); p1.setX1(read.nextDouble()); p1.setY1(read.nextDouble());
        System.out.println("Ingrese las coordenadas del punto 2: "); p1.setX2(read.nextDouble()); p1.setY2(read.nextDouble());
        
    }
    public static double calcularDistancia(Puntos p1){
       // double raiz;
        double calc = Math.pow(p1.getX2()-p1.getX1(), 2)+Math.pow(p1.getY2()-p1.getY1(), 2);
        return calc;
    }
//    public static void radicalizacion(){
//        double raiz;
//        int num;
//                
//    }
    
    public static void mostrarResultado(Puntos p1, double calc){
        System.out.println("La distancia entre el punto 1("+p1.getX1()+")("+p1.getY1()+") y el punto 2 ("+p1.getX2()+")("+p1.getY2()+") es raiz de: "+calc);
        
    }
 
}
