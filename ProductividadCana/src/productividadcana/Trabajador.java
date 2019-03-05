/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productividadcana;

public class Trabajador extends Persona {

    private Corte[] cortes;
    private String tipo;

    public Trabajador() {
    }
    
    public Trabajador(Corte[] cortes, String nombre, String id, String tipo) {
        super(nombre, id);
        this.cortes = cortes;
        this.tipo = tipo;
    }

    public Corte[] getCortes() {
        return cortes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCortes(Corte[] cortes) {
        this.cortes = cortes;
    }

    @Override
    public String toString() {
        String cortesInfo = "";
        for (int i = 0; i < cortes.length; i++) {
            if (cortes[i] != null) {
                cortesInfo += cortes[i].toString() + "\n";
            }
        }
       return "\n------------------------------------------\n"+super.toString() + " Rendimiento: \n" + cortesInfo;
    }

    public boolean agregarCorte(Corte c, int dia) {
        if (cortes[dia] != null) {
            return false;
        } else {
            cortes[dia] = c;
            return true;
        }
    }
    
    
   
    
}
