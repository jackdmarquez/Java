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
public class Ocasional extends Vehiculo {
    
    private String aseguradora;
    private int soat;

    public Ocasional() {
    }

    public Ocasional(String aseguradora, int soat, int modelo, String placa, Propietario propietario, Referencia referencia, ArrayList<Revision> revisiones) {
        super(modelo, placa, propietario, referencia, revisiones);
        this.aseguradora = aseguradora;
        this.soat = soat;
    }

    public Ocasional(String aseguradora, int soat) {
        this.aseguradora = aseguradora;
        this.soat = soat;
    }

 
    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public int getSoat() {
        return soat;
    }

    public void setSoat(int soat) {
        this.soat = soat;
    }

    @Override
    public String calcularCostoRevisiones() {
        double costo= super.calcularCosto();
        if(aseguradora.equalsIgnoreCase("Mafre")||aseguradora.equalsIgnoreCase("Sura"))
            costo=costo * 1.01;
        else
            costo=costo * 1.025;
        return "El costo a pagar es: " +costo;
    }

    @Override
    public String toString() {
        return super.toString()+"\nVehiculoOcasional{" + "aseguradora=" + aseguradora + ", soat=" + soat + '}';
    }

    public String reporteMinimo() {
        return "Reporte minimo\nPlaca " + getPlaca() +" Nombre del propietario " +getPropietario().getNombreP()+" Nombre de la referencia " + getReferencia().getNombre()+" Aseguradora: " + aseguradora + "Numero de SOAT:" + soat;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + " numero de SOAT: " + soat;
    }

  
    
    
    
}
