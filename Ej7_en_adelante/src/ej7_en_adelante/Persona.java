/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ej7_en_adelante;


/*
  @author $EmaS7
 */
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso, altura;
    



//defect constructor
    public Persona() {
    }
//constructor with all atributes
    public Persona(String nombre, int edad, String sexo, float peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
//get of name
    public String getNombre() {
        return nombre;
    }
//set of name
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//
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

    public float getPeso() {
        return (float) peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}

