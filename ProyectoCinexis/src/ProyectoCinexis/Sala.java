
package ProyectoCinexis;

import ProyectoCinexis.Archivos;
import ProyectoCinexis.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Sala {

    //vectores
    private Cliente[] sillasPreferencial;
    private Cliente[] sillasGeneral;
    
    ArrayList<Reserva> reservas;

    //Variables:
    private String pelicula="";    
    private int numSala=0;

    //otras variables:
    private int preferencialesReservadas=0, preferencialesOcupadas=0, preferencialesDisponibles=0;
    private int generalesReservadas=0, generalesOcupadas=0, generalesDisponibles=0;
    
    //Objetos:
    Reserva reser;
    Cliente cliente;
    Archivos f= new Archivos();



    //constructor
    public Sala(int sillasPrefer, int sillasGen, String pelicula, int numSala){
         sillasPreferencial= new Cliente [sillasPrefer];
         sillasGeneral= new Cliente [sillasGen];        
         reservas=new ArrayList();
         this.pelicula=pelicula;         
         this.numSala=numSala;
         //asignaciones:
         preferencialesDisponibles=sillasPrefer;
         generalesDisponibles=sillasGen;
         
    }//cierra constructor

    public void ReservarSillas( ){
         int numeroSillas=0;
         int tipoSillas=0;
         int cedula=0;
         int numReserva=0;
         int error=1;
         do{
             try{
                 error=0;
                 numeroSillas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de sillas a reservar"));
                 tipoSillas=Integer.parseInt(JOptionPane.showInputDialog("Digite 1-reservar preferenciales\n2-Reservar generales"));
                 cedula=Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula de la persona que reserva"));
                 numReserva=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero para esta reserva"));
                 if(tipoSillas<1 || tipoSillas>2){
                     JOptionPane.showMessageDialog(null,"Error, debe digitar un numero entre 1 y 3");
                     error=1;
                 }//fin if
             }catch(NumberFormatException nfe){
                 JOptionPane.showMessageDialog(null,"Error-->"+nfe+"\nIntente de Nuevo");
                 error=1;
             }//end catch
         }while(error==1);
         
         if(tipoSillas==1) reservaSillasPreferenciales(numeroSillas, tipoSillas, cedula, numReserva);
         if(tipoSillas==2) reservaSillasGenerales(numeroSillas, tipoSillas, cedula, numReserva);
         
    }




    
    public void reservaSillasPreferenciales(int numeroSillas, int tipoSilla, int cedula, int numReserva){
        int contador=0;
        String silla="Preferencial";

        if(numeroSillas>preferencialesDisponibles){
            JOptionPane.showMessageDialog(null,"el numero de silas a reservar, exede el numero de sillas disponibles");
            return;
        }else{
            contador=preferencialesReservadas;
            for(int i=preferencialesReservadas; i<(preferencialesReservadas+numeroSillas); i++){
                reser=new Reserva(silla, numReserva, cedula, contador);
                reservas.add(reser);//agregar la reserva a la lista de reservas para esta sala
                f.escribirReserva(reser);
                cliente=new Cliente();//crear una eprsona ficticia
                sillasPreferencial[i]=cliente; //asignar un objeto pasajero vacio a esa pos del vector
                JOptionPane.showMessageDialog(null,"Reserva: "+reser.toString());
                contador++;
            }//fin for
            preferencialesDisponibles=preferencialesDisponibles-numeroSillas;
            preferencialesReservadas=preferencialesReservadas+numeroSillas;
            JOptionPane.showMessageDialog(null,"Reservas Asignadas Exitosamente");
       }//fin else
    }
    
    public void reservaSillasGenerales(int numeroSillas, int tipoSilla, int cedula, int numReserva){
        int contador=0;
        String silla="General";
        
        if(numeroSillas>generalesDisponibles){
            JOptionPane.showMessageDialog(null,"el numero de silas a reservar, exede el numero de sillas disponibles");
            return;
        }else{
            contador=generalesReservadas;
            for(int i=generalesReservadas; i<(generalesReservadas+numeroSillas); i++){
                reser=new Reserva(silla, numReserva, cedula, contador);
                reservas.add(reser);//agregar la reserva a la lista de reservas para esta sala
                cliente=new Cliente();//crear un pasajero ficticio
                sillasPreferencial[i]=cliente; //asignar un objeto pasajero vacio a esa pos del vector
                JOptionPane.showMessageDialog(null,"Reserva: "+reser.toString());
                contador++;
            }//fin for
            generalesDisponibles=generalesDisponibles-numeroSillas;
            generalesReservadas=generalesReservadas+numeroSillas;
            JOptionPane.showMessageDialog(null,"Reservas asignadas exitosamente");
        }//FIN ELSE
    }
       
    public int getNumSala( ){
        return numSala;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }




   //Metodo para consultar las reservas que se hicieron sobre un determinado sala:
    public String ConsultarReservasSala(int numReserva){
        String cadena="";
        for(int i=0; i<reservas.size(); i++){
            System.out.println("Numero reserva: "+reservas.get(i).getNumeroReserva());
            if(reservas.get(i).getNumeroReserva()==numReserva){
                cadena=cadena+""+reservas.get(i).toString( )+"\n\n";
                System.out.println(cadena);
            }//fin if
        }//fin for
        if(cadena.equals("")) cadena="No se encontro ninguna reserva para ese numero";
        return cadena;
    }



    //metodo para vender boleta, segun una reseva hecha
    public void VenderBoletaSala(int numReserva){
        int numeroSilla;
        String tipoSilla="";

        for(int i=0; i<reservas.size(); i++){
            if(reservas.get(i).getNumeroReserva()==numReserva){
                numeroSilla=reservas.get(i).getNumeroSilla();
                tipoSilla=reservas.get(i).getTipoSilla();

                if(tipoSilla.equals("Preferencial")) OcuparPreferencial(numeroSilla, tipoSilla);
                if(tipoSilla.equals("General")) OcuparGeneral(numeroSilla, tipoSilla);               
            }
        }//fin for
        JOptionPane.showMessageDialog(null,"Las boletas se vendieron Exitosamente");
    }

    public void OcuparGeneral(int numeroSilla, String tipoSilla){
        int numeroCedul=0;
        String nombre="";
        int error=0;
        do{
           error=0;
           try{
               numeroCedul=Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del ocupante"));
               nombre=JOptionPane.showInputDialog("Digite nombre del ocupante");
            }catch(NumberFormatException nf){
               JOptionPane.showMessageDialog(null,"Error-->"+nf);
               error=1;
            }//fin catch
        }while(error==1);
        cliente=new Cliente(nombre, numeroCedul);
        sillasGeneral[numeroSilla]=cliente;
        JOptionPane.showMessageDialog(null,"La ocupacio se hizo exitosa:\n\n"+cliente.ObtenerInformacionPasajero()+"\n\nNuero Silla: "+numeroSilla+"\nTipo Silla: "+tipoSilla);

        generalesOcupadas++;
        generalesReservadas--;
    }



    public void OcuparPreferencial(int numeroSilla, String tipoSilla){
        int numeroCedul=0;
        String nombre="";
        int error=0;
        do{
           error=0;
           try{
               numeroCedul=Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del ocupante"));
               nombre=JOptionPane.showInputDialog("Digite nombre del ocupante");
            }catch(NumberFormatException nf){
               JOptionPane.showMessageDialog(null,"Error-->"+nf);
               error=1;
            }//fin catch
        }while(error==1);
        cliente=new Cliente(nombre, numeroCedul);
        sillasPreferencial[numeroSilla]=cliente;
        JOptionPane.showMessageDialog(null,"La ocupacio se hizo exitosa:\n\n"+cliente.ObtenerInformacionPasajero()+"\n\nNuero Silla: "+numeroSilla+"\nTipo Silla: "+tipoSilla);

        preferencialesOcupadas++;
        preferencialesReservadas--;
        
    }





    //metodo que rerotnas las estadisticas de las sillas, segun la sala:
    public String ConsultarSillas( ){
        String sillas="";
        sillas="sillas Preferenciales disponibles: "+preferencialesDisponibles+" Ocupadas: "+preferencialesOcupadas+" Reservadas: "+preferencialesReservadas+"\n" +
               "sillas Generales disponibles: "+generalesDisponibles+" Ocupadas: "+generalesOcupadas+" Reservadas: "+generalesReservadas+"\n" +               
               "\nNumero del sala: "+numSala;
        return sillas;
    }



    //metodo para retornar las estadisticas de las sillas reservadas de ese sala:
    public String ConsultarSillasReservadas( ){
        String Sillas="";
        Sillas="Preferenciales Reservadas: "+preferencialesReservadas+"\n"+
                "Generales Reservadas: "+generalesReservadas+"\n";
                
        return Sillas;
    }
    
    
    
    @Override
    public String toString( ){       
       return  "Numero de la sala: "+numSala+"\nPelicula: "+pelicula;        
    }



}//finclase
