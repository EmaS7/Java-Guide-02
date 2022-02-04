/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:

• Un constructor por defecto.

• Un constructor con todos los atributos como parámetro.

• Métodos getters y setters de cada atributo.

• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje

• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.

• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */

package ej7;

import static java.lang.Math.pow;
import java.util.Scanner;


/*
  @author $EmaS7
 */
public class Persona{
    Scanner read = new Scanner(System.in);
    private String nombre;
    private int edad;
    private String sexo;
    private double altura;
    private double peso;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void crearPersona(){
        System.out.println("Ingrese nombre: ");
        this.nombre = read.nextLine();
        System.out.println("Ingrese edad: ");
        this.edad = read.nextInt();
      /*  do{
           System.out.println("Ingrese sexo (H,M,O): ");
           this.sexo = read.nextLine();
       if(!"H".equals(sexo) || !"M".equals(sexo) || !"O".equals(sexo)){
            System.out.println("Datos invalidos");  
          }else{
              break;
          }
        }while(!"H".equals(sexo) || !"M".equals(sexo) || !"O".equals(sexo));
*/
        System.out.println("Ingrese altura: ");
        this.altura = read.nextDouble();
        System.out.println("Ingrese el peso en kg: ");
        this.peso = read.nextDouble();
        
    } 
 /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.*/
    
    public void calcularMC(Persona per){
        double calculo = per.getPeso()/pow(per.getAltura(), 2);
        int var=0;
        if(calculo > 25){
            var = 1;
        //    System.out.println("");
        }else if(calculo >= 20 && calculo<=25){
            var = 0;
        }else if(calculo < 20){
            var = -1;
        }
        System.out.println("El calculo es: "+calculo+" y la variable: " +var);
    }
 /*   • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.*/
    
    public boolean esMayorEdad(Persona per){
        boolean ban=false;
        if(per.edad >= 18){
            ban = true;
            System.out.println("Es mayor");
        }else{
            System.out.println("Es menor");
        }
        return ban;
    }
    
}
