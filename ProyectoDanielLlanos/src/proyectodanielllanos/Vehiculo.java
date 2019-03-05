/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodanielllanos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian Zemanate
 */
public class Vehiculo {

    private int modelo;
    private String placa;
    private Propietario propietario;
    private Referencia referencia;
    private ArrayList<Revision> revisiones;

    public Vehiculo() {
    }

    public Vehiculo(int modelo, String placa, proyectodanielllanos.Propietario propietario, Referencia referencia, ArrayList<Revision> revisiones) {
        this.modelo = modelo;
        this.placa = placa;
        this.propietario = propietario;
        this.referencia = referencia;
        this.revisiones = revisiones;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public proyectodanielllanos.Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(proyectodanielllanos.Propietario propietario) {
        this.propietario = propietario;
    }

    public Referencia getReferencia() {
        return referencia;
    }

    public void setReferencia(Referencia referencia) {
        this.referencia = referencia;
    }

    public ArrayList<Revision> getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(ArrayList<Revision> revisiones) {
        this.revisiones = revisiones;
    }

    public String toString() {

        return " La placa:" + placa
                + "\n Modelo:" + modelo
                + "\n Propietario" + propietario.toString()
                + "\n Referencias" + referencia.toString();

    }

    public void agregarRevision(Revision r) {
        revisiones.add(r);
    }

    public String calcularCostoRevisiones() {
        double costoTotal = calcularCosto();
        return "El vehiculo con placa " + placa + " Tiene un total a pagar de $" + costoTotal + " Por revisiones";
    }

    public double calcularCosto() {
        double costoTotal = 0;
        for (int i = 0; i < revisiones.size(); i++) {
            costoTotal += revisiones.get(i).getCosto();
        }
        return costoTotal;
    }

    public String revisionesEnEstado() {
        Object[] o = {"Cumplido", "No Cumplido", "Pendiente"};
        String estado = JOptionPane.showInputDialog(null, "Seleccione el estado", "Revisiones en un estado dado", 0, null, o, o[0]) + "";
        String rev = "";
        for (int i = 0; i < revisiones.size(); i++) {
            if (revisiones.get(i).getEstado().equalsIgnoreCase(estado)) {
                rev += revisiones.get(i).toString()+"\n";;
            }
        }
        if (rev.length() == 0) {
            return "Sin revisiones en el estado " + estado;
        }
        return "las revisiones en ese estado son:\n" + rev;

    }



    public String getInfo(){
       return "Placa "+placa + " Nombre de referencia: " + referencia.getNombre();
    }


}
