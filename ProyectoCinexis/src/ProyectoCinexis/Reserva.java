
package ProyectoCinexis;


public class Reserva {

    private String TipoSilla="";
    private int NumeroReserva=0;
    private int CedulaPersona=0;
    private int NumeroSilla=0;
    
    //Constructor
    public Reserva(String TipoSilla, int NumeroReserva, int CedulaPersona, int NumeroSilla){
        this.TipoSilla=TipoSilla;
        this.NumeroReserva=NumeroReserva;
        this.CedulaPersona=CedulaPersona;
        this.NumeroSilla=NumeroSilla;
    }
//SETTERS Y GETTERS:
    public int getNumeroSilla() {
        return NumeroSilla;
    }

    public void setNumeroSilla(int NumeroSilla) {
        this.NumeroSilla = NumeroSilla;
    }

    
    public int getCedulaPersona() {
        return CedulaPersona;
    }

    public void setCedulaPersona(int CedulaPersona) {
        this.CedulaPersona = CedulaPersona;
    }

    public int getNumeroReserva() {
        return NumeroReserva;
    }

    public void setNumeroReserva(int NumeroReserva) {
        this.NumeroReserva = NumeroReserva;
    }

    public String getTipoSilla() {
        return TipoSilla;
    }

    public void setTipoSilla(String TipoSilla) {
        this.TipoSilla = TipoSilla;
    }


 @Override//sobreEscritura
    public String toString( ){
        String info="";
        info="Tipo Silla: "+TipoSilla+"\nNumero Reserva: "+NumeroReserva+"\nCedula Reservador "+CedulaPersona+"\nNumero Silla: "+NumeroSilla;
        return info;
    }


}
