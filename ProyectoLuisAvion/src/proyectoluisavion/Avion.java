package proyectoluisavion;

public class Avion {

    Pasajero[] pasajeros;

    int[] sillasEjecutivasVentana = {1, 4, 5, 8};
    int[] sillasEjecutivasPasillo = {2, 3, 6, 7};    
    int[] sillasEconomicasVentana = {9, 14, 15, 20, 21, 26, 27, 32, 33, 38, 39, 44, 45, 50};
    int[] sillasEconomicasCentro = {10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49};
    int[] sillasEconomicasPasillo = {11, 12, 17, 18, 23, 24, 29, 30, 35, 36, 41, 42, 47, 48};
    int ctdadEjecutivasVentana = 0;
    int ctdadEjecutivasPasillo = 0;
    int ctdadEconomicasVentana = 0;
    int ctdadEconomicasCentro = 0;
    int ctdadEconomicasPasillo = 0;

    public Avion(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void agregarPasajero(Pasajero p) {
        for (int i = 0; i < pasajeros.length; i++) {
            if (pasajeros[i] != null) {
            }
            else{
                pasajeros[i]=p;
                break;
            }
        }
    }
    
    public int numeroSilla(String clase, String ubicacion){
        int numeroSilla=0;
        if(clase.equalsIgnoreCase("1") && ubicacion.equalsIgnoreCase("1")){
            numeroSilla=sillasEjecutivasVentana[ctdadEjecutivasVentana];
            ctdadEjecutivasVentana++;            
        }
        if(clase.equalsIgnoreCase("1") && ubicacion.equalsIgnoreCase("2")){
            numeroSilla=sillasEjecutivasPasillo[ctdadEjecutivasPasillo];
            ctdadEjecutivasPasillo++;            
        }
        if(clase.equalsIgnoreCase("2") && ubicacion.equalsIgnoreCase("1")){
            numeroSilla=sillasEconomicasVentana[ctdadEconomicasVentana];
            ctdadEconomicasVentana++;            
        }
        if(clase.equalsIgnoreCase("2") && ubicacion.equalsIgnoreCase("2")){
            numeroSilla=sillasEconomicasCentro[ctdadEconomicasCentro];
            ctdadEconomicasCentro++;            
        }
        if(clase.equalsIgnoreCase("2") && ubicacion.equalsIgnoreCase("3")){
            numeroSilla=sillasEconomicasPasillo[ctdadEconomicasPasillo];
            ctdadEconomicasPasillo++;            
        }
        return numeroSilla;
    }

    @Override
    public String toString() {
        String infoPasajeros = "";
        for (int i = 0; i < pasajeros.length; i++) {
            if (pasajeros[i] != null) {
                Pasajero pasajero = pasajeros[i];
                infoPasajeros += pasajero.toString() + "\n\n";
            }

        }
        return infoPasajeros;
    }

    boolean revisarExistencia(String clase, String ubicacion) {
       if(clase.equalsIgnoreCase("1") && ubicacion.equalsIgnoreCase("1")){
            if(ctdadEjecutivasVentana<4){
                return true;
            }
            else{
                return false;
            }                        
        }
        if(clase.equalsIgnoreCase("1") && ubicacion.equalsIgnoreCase("2")){
            if(ctdadEjecutivasPasillo<4){
                return true;
            }
            else{
                return false;
            }
                        
        }
        if(clase.equalsIgnoreCase("2") && ubicacion.equalsIgnoreCase("1")){
            if(ctdadEconomicasVentana<14){
                return true;
            }
            else{
                return false;
            }
                       
        }
        if(clase.equalsIgnoreCase("2") && ubicacion.equalsIgnoreCase("2")){
            if(ctdadEconomicasCentro<14){
                return true;
            }
            else{
                return false;
            }
                       
        }
        if(clase.equalsIgnoreCase("2") && ubicacion.equalsIgnoreCase("3")){
            if(ctdadEconomicasPasillo<14){
                return true;
            }
            else{
                return false;
            }
                     
        }
        return false;
    }

}
