

package ej33;

//import java.util.Scanner;

/**
 *
 * @author $EmaS7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operacion op1 = new Operacion();
        
        op1.crearOperacion();
        System.out.println("La suma es: " +op1.suma());
        System.out.println("La resta es: " +op1.resta());
        
        if(op1.multiplicacion() == 0){
            System.out.println("Error");
        }else{
        System.out.println("El producto es: " +op1.multiplicacion());
        }
        if(op1.getNum2() == 0 && op1.dividir()==0){
            System.out.println("Error");
        }else{
        System.out.println("La division es: " +op1.dividir());
        }

    }

}
