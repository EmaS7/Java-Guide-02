/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void creaRectangulo(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo: "); base = read.nextInt();
        System.out.println("Ingrese la altura del rectangulo: "); altura = read.nextInt();
        
    }
    public void superficie(){
        double superf = base * altura;
    } 
    public void perimetro(){
        double perim = 2 * (base + altura);
    }
    public void dibuja(){
       // int i,j;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
          }  
        }
    }
    
    
    

