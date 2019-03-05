/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;


public final class  Articulo extends Producto implements Transaccion {
    private double factor;
    private float costo;
    public Articulo(int referencia, String descripcion, double factor, float costo) {
        super(referencia, descripcion);
        this.factor = factor;
        this.costo = costo;
    }
    public double getFactor() {
        return factor;
    }
    public float getCosto() {
        return costo;
    }
    public void setCosto(float costo) {
        this.costo = costo;
    }
    public double factorCorregido(){
        double factorCorregido=0;
        if(factor<= 0.3){
            factorCorregido=1.3;
        }
        else if(factor> 0.3 && factor<=0.6){
            factorCorregido=1.6;
        }
        else{
            factorCorregido=1.8;
        }
        return factorCorregido;
    }    
    public double precio(){
        double precio=costo*factorCorregido();
        return precio;
    }    
    public String toString() {
        return super.toString() + "factor=" + factor + ", costo=" + costo ;
    }  
}
