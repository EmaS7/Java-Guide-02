/*
 
 */

package ej6;


/*
  @author EmaS7 
 */
public class Cafeteria {
    
    private static int capacidadMaxima = 1200;
    private int cantidadActual;

    public Cafeteria() {
    }

    public Cafeteria(int capacidadMaxima, int cantidadActual) {
        Cafeteria.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        Cafeteria.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
 
}
