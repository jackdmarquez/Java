package proyectoluisavion;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String numTelefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String cedula, String numTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.numTelefono = numTelefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre + ", Apellido= " + apellido + ", Cedula= " + cedula + ", Numero de Telefono= " + numTelefono;
    }
    
    

}
