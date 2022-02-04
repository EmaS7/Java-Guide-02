/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.newpackage;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Libro {
    public String ISBN;
    public String author;
    public String titulo;
    public int paginas;

    public Libro() {
    }
    
    
    public Libro(String ISBN, String author, String titulo, int paginas) {
        this.ISBN = ISBN;
        this.author = author;
        this.titulo = titulo;
        this.paginas = paginas;
    }
    
    public void crear(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN: ");this.ISBN = read.next(); 
        System.out.println("Ingrese el titulo: ");this.titulo = read.next();
        System.out.println("Ingrese el autor: "); this.author = read.next();
        System.out.println("Ingrese la cant. de paginas: ");this.paginas = read.nextInt();
        
    }

    public void show(){
        System.out.println("ISBN: " +this.ISBN);
        System.out.println("Title: " +this.titulo);
        System.out.println("Author: " +this.author);
        System.out.println("Pages: "  +this.paginas);
    }
}
