/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodanielllanos;

import java.util.ArrayList;

/**
 *
 * @author Master
 */
public class Afiliado extends Vehiculo {

    private int nroAfiliacion;

    public Afiliado() {
    }

    public Afiliado(int nroAfiliacion, int modelo, String placa, proyectodanielllanos.Propietario propietario, Referencia referencia, ArrayList<Revision> revisiones) {
        super(modelo, placa, propietario, referencia, revisiones);
        this.nroAfiliacion = nroAfiliacion;
    }

    public Afiliado(int nroAfiliacion) {
        this.nroAfiliacion = nroAfiliacion;
    }

    public int getNroAfiliacion() {
        return nroAfiliacion;
    }

    public void setNroAfiliacion(int nroAfiliacion) {
        this.nroAfiliacion = nroAfiliacion;
    }

    @Override
    public String calcularCostoRevisiones() {
        double costo = super.calcularCosto();
        if (getRevisiones().size() < 3) {
            costo = costo * 0.95;
        } else {
            costo = costo * 0.925;
        }
        return "El costo a pagar por las revisiones es de: " + costo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nVehiculoAfiliado{" + "nroAfiliacion=" + nroAfiliacion + '}';
    }

    public String revisionesBajoRiesgo() {
        boolean bajoRiesgo=esBajoRiesgo();
        if (bajoRiesgo) {
            return "Es CIERTO que es un vehiculo de bajo riesgo";
        } else {
            return "Es FALSO que es un vehiculo de bajo riesgo";
        }
    }

    public boolean esBajoRiesgo() {
        if (getRevisiones().size() < 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getInfo(){
        return super.getInfo() + " numero de afiliacion: " + nroAfiliacion;
    }

    public String listado(){
        return "Placa: "+getPlaca()+" Nombre del propietario: "+getPropietario().getNombreP()+ " Numero de afiliacion: "+nroAfiliacion;
    }


}
