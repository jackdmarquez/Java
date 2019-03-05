/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;


public class Casillas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        
        String  msj="";
        for (int i = 0; i < 400; i++) {
            msj+= "getCasillas().add(jButton" + (i+1) +");\n";
        }
        System.out.println(msj);
        
        
    }

}
