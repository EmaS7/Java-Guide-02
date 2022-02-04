

package ej9;

import static java.lang.Math.random;
//import java.util.Scanner;

/**
 *
 * @author $EmaS7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematica calc = new Matematica();
        
        calc.setNum1(random()*10);
        calc.setNum2(random()*10);
        
        System.out.println("Numero1: "+calc.getNum1());
        System.out.println("Numero2: "+calc.getNum2());
        System.out.println("--------------------------");
        
        double mayor = ServiceMath.devolverMayor(calc);
        if(mayor==calc.getNum1())
            System.out.println("El numero mas grande es: "+calc.getNum1());
        else
            System.out.println("El numero mas grande es: "+calc.getNum2());
        
        ServiceMath.calcularPotencia(calc);
        ServiceMath.calculaRaiz(calc);
        
    }

}
