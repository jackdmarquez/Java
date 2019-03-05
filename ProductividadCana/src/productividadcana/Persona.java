/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productividadcana;


public class Persona {
    private String nombre;
    private String id;

    public Persona() {
    }

    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + ", Identificacion: " + id;
    }

    public String toArchivo(){
        return    nombre + "&" + id;
    }
    
    
    
}
