/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodanielllanos;

/**
 *
 * @author Julian Zemanate
 */
public class Referencia {

    private String nombre,gama;
    private int puertas;
    private double cilindraje, velocidad;

    public Referencia(String nombreC, int puertas, double motor, double velocidad) {
        this.nombre = nombreC;
        this.puertas = puertas;
        this.cilindraje = motor;
        this.velocidad = velocidad;
        gama="";
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {

        return "Nombre y referencia del carro:" + nombre
                + "\n" + "numero de puertas:" + puertas
                + "\n" + "motor en capacidad de (litros)" + cilindraje
                + "\n" + " velocidad max del carro: " + velocidad;

    }

    public String Gama() {
        String salida = "";
        cilindraje = cilindraje/1000;//para pasar a litros
        for (int i = 0; i < cilindraje; i++) {
            if (cilindraje <= 1.0) {

                salida = "Gama Baja";

            } else {
                if (cilindraje >= 1.0 && cilindraje <= 1.4 || velocidad < 160) {
                    salida = " Gama Media";

                } else {

                    salida = " Gama Alta";
                }
            }
        }
        setGama(salida);
        return salida;
    }
}
