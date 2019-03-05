package proyectoluisavion;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int disponibilidad = 0;

        Avion avion = new Avion(new Pasajero[50]);
        int continuar = 0;
        boolean error = false;
        do {

            String nombre = "", apellido = "", ubicacion = "", clase = "", ciudadDestino = "";
            int cedula = 0, telefono = 0, numeroSilla = 0;

            do {

                nombre = JOptionPane.showInputDialog("Digite su nombre");
                if (nombre.contains("0") || nombre.contains("1") || nombre.contains("2") || nombre.contains("3") || nombre.contains("4") || nombre.contains("5") || nombre.contains("6") || nombre.contains("7") || nombre.contains("8") || nombre.contains("9")) {
                    JOptionPane.showMessageDialog(null, "Solo digite letras");
                }
            } while (nombre.contains("0") || nombre.contains("1") || nombre.contains("2") || nombre.contains("3") || nombre.contains("4") || nombre.contains("5") || nombre.contains("6") || nombre.contains("7") || nombre.contains("8") || nombre.contains("9"));

            do {
                apellido = JOptionPane.showInputDialog("Digite su apellido");
                if (apellido.contains("0") || apellido.contains("1") || apellido.contains("2") || apellido.contains("3") || apellido.contains("4") || apellido.contains("5") || apellido.contains("6") || apellido.contains("7") || apellido.contains("8") || apellido.contains("9")) {
                    JOptionPane.showMessageDialog(null, "Solo digite letras");
                }
            } while (apellido.contains("0") || apellido.contains("1") || apellido.contains("2") || apellido.contains("3") || apellido.contains("4") || apellido.contains("5") || apellido.contains("6") || apellido.contains("7") || apellido.contains("8") || apellido.contains("9"));

            do {
                try {

                    cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite su cedula"));
                    error = false;
                    if (cedula <= 0) {
                        JOptionPane.showMessageDialog(null, "Debe ser mayor a cero");
                    }

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Digite unicamente numeros");
                    error = true;
                }
            } while (cedula <= 0 || error);

            do {
                try {

                    telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite su telefono"));
                    error = false;
                    if (telefono <= 0) {
                        JOptionPane.showMessageDialog(null, "Debe ser mayor a cero");
                    }

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Digite unicamente numeros");
                    error = true;
                }
            } while (telefono <= 0 || error);

            do {
                ciudadDestino = JOptionPane.showInputDialog("Digite la ciudad de destino");
                if (ciudadDestino.contains("0") || ciudadDestino.contains("1") || ciudadDestino.contains("2") || ciudadDestino.contains("3") || ciudadDestino.contains("4") || ciudadDestino.contains("5") || ciudadDestino.contains("6") || ciudadDestino.contains("7") || ciudadDestino.contains("8") || ciudadDestino.contains("9")) {
                    JOptionPane.showMessageDialog(null, "Solo digite letras");
                }
            } while (ciudadDestino.contains("0") || ciudadDestino.contains("1") || ciudadDestino.contains("2") || ciudadDestino.contains("3") || ciudadDestino.contains("4") || ciudadDestino.contains("5") || ciudadDestino.contains("6") || ciudadDestino.contains("7") || ciudadDestino.contains("8") || ciudadDestino.contains("9"));

            do {
                do {
                    clase = JOptionPane.showInputDialog("Digite la clase que desea.\n1) Ejecutiva\n2) Economica");
                    if (!clase.equalsIgnoreCase("1") && !clase.equalsIgnoreCase("2")) {
                        JOptionPane.showMessageDialog(null, "Digite solamente alguna de las opciones presentadas");
                    }
                } while (!clase.equalsIgnoreCase("1") && !clase.equalsIgnoreCase("2"));

                if (clase.equalsIgnoreCase("1")) {
                    do {
                        ubicacion = JOptionPane.showInputDialog("Digite la ubicacion que desea.\n1) Ventana\n2) Pasillo");
                        if (!ubicacion.equalsIgnoreCase("1") && !ubicacion.equalsIgnoreCase("2")) {
                            JOptionPane.showMessageDialog(null, "Digite solamente alguna de las opciones presentadas");
                        }
                    } while (!ubicacion.equalsIgnoreCase("1") && !ubicacion.equalsIgnoreCase("2"));
                } else {
                    do {
                        ubicacion = JOptionPane.showInputDialog("Digite la ubicacion que desea.\n1) Ventana\n2)Centro\n3)Pasillo");
                        if (!ubicacion.equalsIgnoreCase("1") && !ubicacion.equalsIgnoreCase("2") && !ubicacion.equalsIgnoreCase("3")) {
                            JOptionPane.showMessageDialog(null, "Digite solamente alguna de las opciones presentadas");
                        }
                    } while (!ubicacion.equalsIgnoreCase("1") && !ubicacion.equalsIgnoreCase("2") && !ubicacion.equalsIgnoreCase("3"));
                }

                if (avion.revisarExistencia(clase, ubicacion)) {

                    numeroSilla = avion.numeroSilla(clase, ubicacion);
                    Silla s = new Silla(Integer.parseInt(ubicacion), Integer.parseInt(clase), numeroSilla);
                    Pasajero p = new Pasajero(ciudadDestino, s, nombre, apellido, cedula + "", telefono + "");
                    avion.agregarPasajero(p);
                    JOptionPane.showMessageDialog(null, avion.toString());
                    disponibilidad = 0;

                } else {
                    JOptionPane.showMessageDialog(null, "No existe disponibilidad en esta clase y/o ubicacion, seleccione otra");
                    disponibilidad = 1;
                }
            } while (disponibilidad == 1);

            continuar = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si hay otra persona, de lo contrario digite 2"));

        } while (continuar == 1);

        JOptionPane.showMessageDialog(null, "Gracias por viajar con nosotros");
    }

}
