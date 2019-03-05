/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productividadcana;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivos {

    public Archivos() {
    }

    public void escribirSala(Trabajador[] trabajadoresQuema, Trabajador[] TrabajadoresSinQuema) {
        try {
            FileWriter fichero = new FileWriter("trabajadoresQuema.txt");
            PrintWriter pw = new PrintWriter(fichero);
            String cortes = "";
            for (int i = 0; i < trabajadoresQuema.length; i++) {
                pw.println(trabajadoresQuema[i].toArchivo());
                for (int j = 0; j < trabajadoresQuema[i].getCortes().length; j++) {
                    if (trabajadoresQuema[i].getCortes()[j] != null) {
                        cortes += trabajadoresQuema[i].getCortes()[j].toARchivo();
                    }
                }
                pw.println(cortes);
                cortes = "";
            }
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileWriter fichero = new FileWriter("trabajadoresSinQuema.txt");
            PrintWriter pw = new PrintWriter(fichero);
            String cortes = "";
            for (int i = 0; i < TrabajadoresSinQuema.length; i++) {
                pw.println(TrabajadoresSinQuema[i].toArchivo());
                for (int j = 0; j < TrabajadoresSinQuema[i].getCortes().length; j++) {
                    if (TrabajadoresSinQuema[i].getCortes()[j] != null) {
                        cortes += TrabajadoresSinQuema[i].getCortes()[j].toARchivo();
                    }
                }
                pw.println(cortes);
                cortes = "";
            }
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Trabajador[] leerQuema() throws FileNotFoundException, IOException {
        String cadena;
        int contadorQuema = 0;

        Trabajador[] trabajadoresQuema = new Trabajador[6];

        FileReader f = new FileReader("trabajadoresQuema.txt");
        BufferedReader b = new BufferedReader(f);
        int contadorLinea = 1;
        Trabajador t = new Trabajador();
        while ((cadena = b.readLine()) != null) {
            //System.out.println("" + cadena);
            if (contadorLinea % 2 == 0) {
                //System.out.println("entro cortes");
                if (!cadena.equals("")) {
                    //System.out.println("entro diferente vacia");
                    String[] datos = cadena.split("&");
                    for (int i = 0; i < datos.length; i += 5) {
                        double horas = Double.parseDouble(datos[i]);
                        double hectareas = Double.parseDouble(datos[i + 1]);
                        String dia = datos[i + 3];
                        String tipo = datos[i + 4];
                        Corte c = new Corte(horas, hectareas, dia, tipo);
                        t.agregarCorte(c, Integer.parseInt(dia));
                        //System.out.println("agrego corte");
                    }
                }
                trabajadoresQuema[contadorQuema] = t;
                contadorQuema++;
            } else {
                //System.out.println("encotro trabajador");
                String[] datos = cadena.split("&");
                t = new Trabajador(new Corte[30], datos[0], datos[1], "Quema");
            }
            contadorLinea++;
        }
        b.close();
        return trabajadoresQuema;
    }

    Trabajador[] leerSinQuema() throws FileNotFoundException, IOException {
         String cadena;
        int contadorSinQuema = 0;

        Trabajador[] trabajadoresSinQuema = new Trabajador[6];

        FileReader f = new FileReader("trabajadoresSinQuema.txt");
        BufferedReader b = new BufferedReader(f);
        int contadorLinea = 1;
        Trabajador t = new Trabajador();
        while ((cadena = b.readLine()) != null) {
            //System.out.println("" + cadena);
            if (contadorLinea % 2 == 0) {
                //System.out.println("entro cortes");
                if (!cadena.equals("")) {
                    //System.out.println("entro diferente vacia");
                    String[] datos = cadena.split("&");
                    for (int i = 0; i < datos.length; i += 5) {
                        double horas = Double.parseDouble(datos[i]);
                        double hectareas = Double.parseDouble(datos[i + 1]);
                        String dia = datos[i + 3];
                        String tipo = datos[i + 4];
                        Corte c = new Corte(horas, hectareas, dia, tipo);
                        t.agregarCorte(c, Integer.parseInt(dia));
                        //System.out.println("agrego corte");
                    }
                }
                trabajadoresSinQuema[contadorSinQuema] = t;
                contadorSinQuema++;
            } else {
               // System.out.println("encotro trabajador");
                String[] datos = cadena.split("&");
                t = new Trabajador(new Corte[30], datos[0], datos[1], "Sin Quema");
            }
            contadorLinea++;
        }
        b.close();
        return trabajadoresSinQuema;
    }

}
