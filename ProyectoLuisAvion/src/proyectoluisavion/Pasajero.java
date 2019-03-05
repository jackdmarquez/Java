package proyectoluisavion;

public class Pasajero extends Persona {
    
    private String ciudadDestino;
    private Silla silla;

    public Pasajero(String ciudadDestino, Silla silla) {
        this.ciudadDestino = ciudadDestino;
        this.silla = silla;
    }

    public Pasajero(String ciudadDestino, Silla silla, String nombre, String apellido, String cedula, String numTelefono) {
        super(nombre, apellido, cedula, numTelefono);
        this.ciudadDestino = ciudadDestino;
        this.silla = silla;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public Silla getSilla() {
        return silla;
    }

    public void setSilla(Silla silla) {
        this.silla = silla;
    }

    @Override
    public String toString() {
        return super.toString()+ " Ciudad Destino= " + ciudadDestino + ", silla=" + silla.toString();
    }
    

    

    

    
}
