/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej7_en_adelante;

import static java.lang.Math.pow;
import java.util.Scanner;


/*
  @author $EmaS7
 */
public class PersonaService {
    public static Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public static void crearPersona(Persona per){
        System.out.println("Ingrese su nombre:" ); per.setNombre(read.next());
        System.out.println("Ingrese su edad: "); per.setEdad(read.nextInt());
        char sexo;
        //do{
        System.out.println("Ingrese su sexo(H o M): "); per.setSexo(read.next().toUpperCase());
        sexo=per.getSexo().charAt(0);
        while(sexo != 'H'&& sexo != 'M'){
           // do{
            System.out.println("Ingrese el dato nuevamente: "); per.setSexo(read.next());
        //}while(sexo != 'H'&& sexo != 'M');
        //}
    }
        System.out.println("Ingrese su peso(en kg): "); per.setPeso(read.nextDouble());
        System.out.println("Ingree su altura: "); per.setAltura(read.nextDouble());
}   
    public static int calcularMC(Persona per/*, double peso, double altura*/){
        int MC;
        double calc = (per.getPeso()/pow(per.getAltura(), 2));
        System.out.println("Calc: "+calc);
        if(calc < 20){
           MC = -1;
           //return var;
        }else if(calc >=20 && calc<=25){
            MC = 0;
            //return var;
        }else
            MC = 1;
        return MC;
    }
//        public static void imprimeMC(int MC){
//        
//        if(MC == -1)
//            System.out.println("La persona esta debajo de su peso ideal!");
//        else if(MC == 0)
//         System.out.println("La persona esta en su peso ideal");
//        else if(MC == 1)
//         System.out.println("La persona esta por encima de su peso ideal!");
//        
//    }
    public static boolean esMayorEdad(Persona per/*, int edad*/){
        boolean var;
        if(per.getEdad() >= 18){
            var = true;
        }else{
            var = false;
        }
        return var;
        
    }

}



//   for (int i = 0; i < 10; i++) {
//            a1.getPaljueg()[i]
//
//        }