/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCinexis;

import ProyectoCinexis.Reserva;
import ProyectoCinexis.Sala;

/**
 *
 * @author Master
 */
public interface Interface_ManejadorDeArchivos {
    
    public void escribirSala(Sala   salaNueva);

    public void escribirReserva(Reserva reservaNueva);
    
}
