/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5.newpackage;

/**
 *
 * @author HP
 */
public class Cuenta {
    private String cliente;
    private long cbu = 0024624647;
    private long numCuenta = 1232465487;
    private long dni;
    private double saldo,intereses;

    public Cuenta() {
    }

    public Cuenta(String cliente, int cbu, int numCuenta, long dni, double saldo, double intereses) {
        this.cliente = cliente;
        this.cbu = cbu;
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.intereses = intereses;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public long getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    
    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double isSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double isIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }
    
    
    public void ingresar(double ingreso){
        saldo += ingreso;
    }
    public void retirar(double retiro){
        if(saldo < retiro){
            saldo = 0;
        }else{
        saldo -= retiro;
      } 
    }
    public void extraccionRapida(){
     double porc,retiro;
     /*retiro = saldo * 0.2;
        while(saldo <= retiro){
         saldo -= retiro; 
     }*/
    }
    public void consultarSaldo(){
        System.out.println("Su saldo acutal es de: " +saldo);
        
    }
    public void consultarDatos(){
        System.out.println("Numero de cuenta: "+numCuenta);
        System.out.println("DNI: "+dni);
    }
    
    
}
