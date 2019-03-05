/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCinexis;

import java.io.FileWriter;
import java.io.PrintWriter;
import ProyectoCinexis.Reserva;
import ProyectoCinexis.Sala;

/**
 *
 * @author Master
 */
public class Archivos implements Interface_ManejadorDeArchivos {

    public Archivos() {
    }

    @Override
    public void escribirSala(Sala salaNueva) {
        try {
            FileWriter fichero = new FileWriter("salas.txt", true);
            PrintWriter pw = new PrintWriter(fichero);
            pw.println("" + salaNueva.getPelicula());
            pw.println("" + salaNueva.getNumSala());
            pw.println("------------------------------");
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void escribirReserva(Reserva reservaNueva) {
        try {
            FileWriter fichero = new FileWriter("reservas.txt", true);
            PrintWriter pw = new PrintWriter(fichero);
            pw.println("" + reservaNueva.getTipoSilla());
            pw.println("" + reservaNueva.getNumeroReserva());
            pw.println("" + reservaNueva.getCedulaPersona());
            pw.println("" + reservaNueva.getNumeroSilla());
            pw.println("------------------------------");
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
