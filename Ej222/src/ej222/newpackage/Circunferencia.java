/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej222.newpackage;


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

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: "); radio = read.nextDouble();
    }
    public double area(){
        double area;
        area = PI * Math.pow(this.radio, 2);
        return area;
    }
    public void perimetro(){
        double perim;
        perim = 2 * PI * this.radio;
        System.out.println("El perimetro es: " +perim);
    }
        
    
    
}
