/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodanielllanos;

/**
 *
 * @author Master
 */
public class Revision {

    private String fecha, descripcion, estado;
    double costo;

    public Revision() {
    }

    public Revision(String fecha, String descripcion, String estado) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
        if (estado.equals("Cumplido")) {
            costo = 120000;
        } else {
            costo = 80000;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Revision{" + "fecha=" + fecha + "descripcion=" + descripcion + "estado=" + estado + "costo=" + costo + '}';
    }


    
}
