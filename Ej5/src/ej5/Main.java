

package ej5;

import ej5.newpackage.Cuenta;
import java.util.Scanner;

/**
 *
 * @author $EmaS7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Cuenta c1 = new Cuenta();
        c1.setSaldo(10500);
        System.out.println("Ingrese nombre del cliente: "); c1.setCliente(read.next());
        System.out.println("Ingrese DNI: "); c1.setDni(read.nextInt());
        System.out.println("Ingrese monto a ingresar:"); c1.ingresar(read.nextInt());
        
        System.out.println("Cliente: " +c1.getCliente());
        System.out.println("CBU: "+c1.getCbu());
        c1.consultarDatos();
        c1.consultarSaldo();
        

    }

}
