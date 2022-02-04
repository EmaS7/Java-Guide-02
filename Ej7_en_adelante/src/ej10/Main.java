

package ej10;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author $EmaS7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double arrayA[]=new double[50];
        double arrayB[]=new double[20];
       
        for (int i = 0; i < 50; i++) {
            arrayA[i] = (Math.random()*10);
        }
        imprimeArray(arrayA);
        Arrays.sort(arrayA);
        System.out.println("-----------ARRAY A-------------");
        System.out.println(Arrays.toString(arrayA));
        
        arrayB = Arrays.copyOfRange(arrayA, 0, 21);
        Arrays.fill(arrayB, 10, 21, 0.5);
       // Arrays.fill(arrayB, 10, 20, 0.5);
       
        System.out.println("-----------ARRAY B-------------");
        //Arrays.copyOfRange(arrayB, 10, 19);
        System.out.println(Arrays.toString(arrayB));
        System.out.println(" ");
        //Arrays.fill(arrayC, 5, 12, 6);
        //System.out.println(Arrays.toString(arrayC));

    }

    
    
    
    
    
    public static void imprimeArray(double array[]){
        for (int i = 0; i <array.length ; i++) {
            System.out.println(i+")["+array[i]+"]");
        }
}
}

