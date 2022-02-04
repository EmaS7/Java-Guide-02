/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2.newpackage;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Circunferencia {
    private double radio;

public Circunferencia() {
    }

public double getRadio() {
        return radio;
    }

public void setRadio(double radio) {
        this.radio = radio;
    }
public void creacCircunferencia(){
    Scanner read = new Scanner(System.in);
    System.out.println("Ingrese el radio de la circunferencia: "); this.radio= read.nextDouble();
}
 public void area(){
    double area;
    area = PI * ((this.radio)*this.radio); 
     System.out.println("El area es igual a: " +area);
 } 
 public void perim(){
    double perim;
    perim = 2 * PI *(this.radio);  
     System.out.println("El perimetro es igual a: "+perim);
 }  



}

