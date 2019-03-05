/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productividadcana;


public class Corte {
    private double horasTrabajadas;
    private double hectareasCortadas;
    private double productividad;   
    private String dia;
    private String tipoCorte;

    public Corte(double horasTrabajadas, double hectareasCortadas, String dia, String tipoCorte) {
        this.horasTrabajadas = horasTrabajadas;
        this.hectareasCortadas = hectareasCortadas;
        this.tipoCorte = tipoCorte;
        this.productividad = calcularProductividad();        
        this.dia = dia;
        
    }

     
    public String getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(String tipoCorte) {
        this.tipoCorte = tipoCorte;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getHectareasCortadas() {
        return hectareasCortadas;
    }

    public void setHectareasCortadas(double hectareasCortadas) {
        this.hectareasCortadas = hectareasCortadas;
    }

    public double getProductividad() {
        return productividad;
    }

    public void setProductividad(double productividad) {
        this.productividad = productividad;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Corte->\n\tHoras Trabajadas:" + horasTrabajadas + "\n\tthectareas Cortadas= " + hectareasCortadas + "\n\tproductividad= " + productividad + "\n\tdia= " + dia;
    }
    
    public String toARchivo() {
        return  horasTrabajadas + "&" + hectareasCortadas + "&" + productividad + "&" + dia + "&" +tipoCorte + "&";
    }
    
    

    private double calcularProductividad() {
        double productividad=0;
        if(tipoCorte.equals("Quema")){
             productividad = (hectareasCortadas / horasTrabajadas) / 2.16;
        }
        else{
            productividad = (hectareasCortadas / horasTrabajadas) / 1.42;
        }
       return productividad;
    }
    
    
    
    
}
