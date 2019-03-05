/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.ArrayList;

/**
 *
 * @author Alejo
 */
public abstract class Empresa {

    private String nit;
    private String dir;
    private String telefono;

    public Empresa() {
    }

    public Empresa(String nit, String dir, String telefono) {
        this.nit = nit;
        this.dir = dir;
        this.telefono = telefono;
    }

   
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   
    public String getNit() {
        return nit;
    }

   
    public void setNit(String nit) {
        this.nit = nit;
    }

  
    public String getDir() {
        return dir;
    }

   
    public void setDir(String dir) {
        this.dir = dir;
    }

    public abstract double ventasTotales(ArrayList<EmpresaCine> arr);
    public abstract double promedio(ArrayList<EmpresaCine> arr,double ventasTotales);

    @Override
    public String toString() {
        return "Empresa{" + "nit=" + nit + ", dir=" + dir + ", telefono=" + telefono ;
    }
    
    
}
