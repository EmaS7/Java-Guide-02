package ej8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
  @author $EmaS7
 */
public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
//    public static void mostrarVocalesv2(Cadena cad){
//       int cont = 0;
//        for (int i = 0; i < cad.getLongitud(); i++) {
//           if(cad.getFrase().equals("a") ){//|| cad.getFrase().charAt(i)=='e' || cad.getFrase().charAt(i)=='i' || cad.getFrase().charAt(i)=='o' || cad.getFrase().charAt(i)=='u'){
//             cont +=1;
//           }
//          
//        }
//       System.out.println("vocales: " +cont);
//    }   

}