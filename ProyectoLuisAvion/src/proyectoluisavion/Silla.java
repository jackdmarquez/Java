/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoluisavion;


public class Silla {
    
   private int ubicacion;
    private int clase;
    private int nro;

    public Silla(int ubicacion, int clase, int nro) {
        this.ubicacion = ubicacion;
        this.clase = clase;
        this.nro = nro;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Ubicacion= " + ubicacion + ", Clase=" + clase + ", Numero silla=" + nro;
    }

    
    
}
