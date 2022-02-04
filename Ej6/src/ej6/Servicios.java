/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej6;

import static java.lang.Math.abs;

/*
  @author $EmaS7
 */
public class Servicios{ 

    public static void llenarCafetera(Cafeteria coffee){
        coffee.setCantidadActual(coffee.getCapacidadMaxima());
    }
    public static void servirTaza(int taza, Cafeteria coffee){
        //taza = cantidadActual;
        if(coffee.getCantidadActual() < taza){
            coffee.setCantidadActual(0);
            System.out.println("La taza no se lleno");
        }else{
            taza-=coffee.getCantidadActual();
            coffee.setCantidadActual(abs(taza));
            System.out.println("La taza se lleno");
        }
    }
    
    public static void vaciarCafetera(Cafeteria coffee){
        coffee.setCantidadActual(0);
    }
    
    public static void agregarCafe(int cantidad, Cafeteria coffee){
        if(coffee.getCantidadActual()>coffee.getCapacidadMaxima()){
            System.out.println("La cafetera llego a su capacidad maxima");
        }
        cantidad+=coffee.getCantidadActual();
        coffee.setCantidadActual(cantidad);
    }
}
