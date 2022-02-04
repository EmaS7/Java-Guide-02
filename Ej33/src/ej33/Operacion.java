/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej33;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Operacion {
    private int num1, num2;

    public Operacion() {
        
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
    public void crearOperacion(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos numeros: "); num1 = read.nextInt(); num2 = read.nextInt();
    }
     public int suma(){
        int suma;
        suma = num1 + num2;
        return suma;
    }
    
     public int resta(){
         int resta;
         resta = num1 - num2;
         return resta;
     }
     
     public int multiplicacion(){
         int multip;
         /*if(num1 == 0 || num2 == 0){
           // System.out.println("ERROR");
            return 0;
         }*/
         multip = num1 * num2;
         return multip;
    }
     
     public double dividir(){
         double division;
         if(num2 == 0){
             return 0;
         }else{
         
         division = (double) num1 / (double) num2;
         return division;
         } 
     }
     
    
}
