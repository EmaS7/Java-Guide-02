/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej9;

import java.util.Scanner;

/*
  @author $EmaS7
 */
public class ServiceMath {
    public static Scanner read = new Scanner(System.in).useDelimiter("\n");
    public static double devolverMayor(Matematica calc){
        if(calc.getNum1()>calc.getNum2())
            return calc.getNum1();
        else
            return calc.getNum2();
    }
    public static void calcularPotencia(Matematica calc){
        double res;
        double num1 = Math.round(calc.getNum1());
        double num2 = Math.round(calc.getNum2());
        if(num1>num2){
            res = Math.pow(num1,num2);
            System.out.println("Potencia de "+num1+" elevado a "+num2+" es: "+res);
    }else{
            res = Math.pow(num2,num1);
            System.out.println("Potencia de "+num2+" elevado a "+num1+" es: "+res);
    }
}
    public static void calculaRaiz(Matematica calc){
        double res;
        double num1 = Math.round(calc.getNum1());
        double num2 = Math.round(calc.getNum2());
        if(num1<num2){
            res = Math.sqrt(num1);
            System.out.println("Raiz cuadrada de "+num1+" es: "+res);
        }else{
            res = Math.sqrt(num2);
            System.out.println("Raiz cuadrada de "+num2+" es: "+res);
       }
    }
}
