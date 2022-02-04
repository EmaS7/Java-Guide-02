/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej5Extra;


/*
  @author $EmaS7
 */
public class Triangulo {

    private double ladoRepetido;
    private double ladoNoRepetido;
 
//    @Override
//    public String toString() {
//        return "Triangulo{" + "ladoRepetido=" + ladoRepetido + ", ladoNoRepetido=" + ladoNoRepetido + '}';
//    }
     public Triangulo(double ladoRepetido, double ladoNoRepetido) {
        this.ladoRepetido = ladoRepetido;
        this.ladoNoRepetido = ladoNoRepetido;
    }
 
    public Triangulo() {
    }
 
    public double getLadoRepetido() {
        return ladoRepetido;
    }
 
    public void setLadoRepetido(double ladoRepetido) {
        this.ladoRepetido = ladoRepetido;
    }
 
    public double getLadoNoRepetido() {
        return ladoNoRepetido;
    }
 
    public void setLadoNoRepetido(double ladoNoRepetido) {
        this.ladoNoRepetido = ladoNoRepetido;
    }
 


}
