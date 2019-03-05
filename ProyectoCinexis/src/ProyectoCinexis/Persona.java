/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCinexis;

/**
 *
 * @author Master
 */
public class Persona {
    
    //Atributos
    private String nombre="";
    private int Identidad=0;
    //Constructor
    public Persona(String nombre, int Identidad){
        this.nombre=nombre;
        this.Identidad=Identidad;
        
    }
    //"SOBRECARGA"
    public Persona( ){
    }

    public String ObtenerInformacionPasajero( ){
        String info="";
        info="Nombre: "+nombre+"\nIdentidad: "+Identidad;
        return info;
    }


    public int getIdentidad() {
        return Identidad;
    }

    public void setIdentidad(int Identidad) {
        this.Identidad = Identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
}
