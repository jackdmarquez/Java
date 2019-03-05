/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodanielllanos;

/**
 *
 * @author Julian Zemanate
 */
public class Propietario {
 private String nombre;
   private int cedula, telefono;

    public Propietario(String nombreP,int cedulaP, int telefono) {
        this.nombre = nombreP;
        this.cedula = cedulaP;
        this.telefono = telefono;
    }

    public int getCedulaP() {
        return cedula;
    }

    public void setCedulaP(int cedulaP) {
        this.cedula = cedulaP;
    }

    public String getNombreP() {
        return nombre;
    }

    public void setNombreP(String nombreP) {
        this.nombre = nombreP;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
   public String toString() {
       return "Nombre:"+nombre+
               "\n"+ " Cedula:"+cedula+             
               "\n"+" Telefono:" +telefono;             
    
   }
}
