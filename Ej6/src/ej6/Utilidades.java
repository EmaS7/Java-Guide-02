/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej6;

import java.util.Scanner;
/*
  @author $EmaS7
 */
public class Utilidades {
    public static void menu(){
        int opc;
        Cafeteria coffee = new Cafeteria();
        Scanner read = new Scanner(System.in);
        do{
        System.out.println("Elija una opcion: ");
        System.out.print("1) Llenar cafetera\n2)Servir en taza\n3)Agregar cafe\n4)Vaciar cafetera\n5)Mostrar capacidad actual\n6)Finalizar programa\n");
        opc = read.nextInt(); 
        //&& opc != 3 && opc != 4 && opc != 5){
        switch(opc){
            case 1: 
                Servicios.llenarCafetera(coffee);
                System.out.println("\nCafetera llena!");
                System.out.println(coffee.getCantidadActual()+" ml");
                break;
            case 2:
                System.out.println("\nIngrese el tamano(en ml) de la taza: ");
                Servicios.servirTaza(read.nextInt(), coffee);
                break;
            case 3:
                System.out.println("\nIngrese la cantidad de cafe(en ml) a agregar: ");
                Servicios.agregarCafe(read.nextInt(), coffee);
                break;
            case 4:
                Servicios.vaciarCafetera(coffee);
                System.out.println("\nCafetera vacia!");
                break;
            case 5:
                System.out.println("\nActualmente hay "+coffee.getCantidadActual()+" ml de cafe");
                break;
            case 6:
                System.out.println("---Programa Finalizado!---");
                break;
            default:
                System.out.println("Ingrese una opcion valida!");
                break;
            }
        }while(opc >= 1 && opc <= 5);
    }
}
