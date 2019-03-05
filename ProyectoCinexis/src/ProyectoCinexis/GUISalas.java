
package ProyectoCinexis;

import ProyectoCinexis.Sala;
import ProyectoCinexis.Archivos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class GUISalas extends javax.swing.JFrame {
 
    ArrayList<Sala> Salas;
    Sala sala;
    Archivos f= new Archivos();
    public GUISalas() {
        initComponents();
        Salas= new ArrayList();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Salas"));

        jButton1.setText("Crear Sala");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ver Salas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Reservas"));

        jButton3.setText("CrearReserva");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Consultar Reserva");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setText("Vender Tiquete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Consultas"));

        jButton5.setText("Ver sillas libres, reservadas, ocupadas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Ver sillas Reservadas");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel1.setText("CINEXIS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         CrearNuevaSala( );
    }//GEN-LAST:event_jButton1ActionPerformed

   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VerTtodasLasSalas( );
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CrearReservaSala( );
    }//GEN-LAST:event_jButton3ActionPerformed

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ConsultarReservasSala( );
    }//GEN-LAST:event_jButton4ActionPerformed

   
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ConsultarSillasSala( );
    }//GEN-LAST:event_jButton5ActionPerformed

  
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        venderBoletas( );
    }//GEN-LAST:event_jButton7ActionPerformed

  
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         VerSillasReservadas( );
    }//GEN-LAST:event_jButton6ActionPerformed

  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    //metodo para ver los estudiantes:
    public void VerEstudiantes( ){
        JOptionPane.showMessageDialog(null,"ESTUDIANTES:\n\n");
    }

    //metodo para crear un nuevo sala
    public void CrearNuevaSala( ){
        int sillasPrefe=0;
        int sillasGen=0;
        
        int numSala=0;
        String pelicula="";
        String destino="";
        
        int error=0;
       do{
            error=0;
            try{
                sillasPrefe=Integer.parseInt(JOptionPane.showInputDialog("Digite numero de sillas preferenciales"));
                sillasGen=Integer.parseInt(JOptionPane.showInputDialog("Digite numero de sillas generales"));
                numSala=Integer.parseInt(JOptionPane.showInputDialog("Digite numero de la sala"));
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Error-->"+nfe+"\nIntente de Nuevo");
                error=1;
            }//fin catch
       }while(error==1);
        
       //buscar que no exista una sala con ese numero:
       for(int i=0; i<Salas.size(); i++){
           if(Salas.get(i).getNumSala()==numSala){
               JOptionPane.showMessageDialog(null,"Ese numero de Sala ya existe");
               return;
           }//fin if
       }//fin for 
        
       pelicula=JOptionPane.showInputDialog("Digite la pelicula a proyectar");
       
        
       sala=new Sala(sillasPrefe, sillasGen, pelicula, numSala);
       Salas.add(sala);
       f.escribirSala(sala);
       JOptionPane.showMessageDialog(null,sala.toString());
    }

    //metodo para vertodos los sala creados:
    public void  VerTtodasLasSalas( ){
        String cadena="";
        for(int i=0; i<Salas.size(); i++){
            cadena=cadena+Salas.get(i).toString()+"\n";
        }//fin for
        JOptionPane.showMessageDialog(null,cadena);
    }
    //metodo para crear una nueva reserva en un sala:
    public void CrearReservaSala( ){
        int numSalas;
        try{
            numSalas=Integer.parseInt(JOptionPane.showInputDialog("Digite numero de la sala sobre el cual desea hacer la reserva"));
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Error-->"+nfe);
            return;
        }//fin catch
        
        //buscar el numero de ese sala
        for(int i=0; i<Salas.size(); i++){
            if(Salas.get(i).getNumSala()==numSalas){
                Salas.get(i).ReservarSillas( );
                return;
            }//fin if
        }//fin for
        JOptionPane.showMessageDialog(null,"No se encontro ningun sala con ese numero");
    }

    //metodo para consultar reservas de un sala
    public void ConsultarReservasSala( ){
        int numeroReserva=0;
        int numSala=0;
        int error=0;
        do{
            error=0;
            try{
                numeroReserva=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero asignado de la(s) reserva(s)"));
                numSala=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la sala sobre la cual se hizo la reserva"));
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Error-->"+nfe);
                error=1;
                return;
            }//fin catch
        }while(error==1);

        //buscar el numero de ese sala
        for(int i=0; i<Salas.size(); i++){
            if(Salas.get(i).getNumSala()==numSala){
                JOptionPane.showMessageDialog(null,Salas.get(i).ConsultarReservasSala(numeroReserva));
                return;
            }//fin if
        }//fin for
        JOptionPane.showMessageDialog(null,"No se encontro ninguna sala con ese numero");
    }//fin metodo
    //metodo para consultar las estadisticas de las sillas asociadas a un sala
    public void ConsultarSillasSala( ){
        int numSala;
        try{
            numSala=Integer.parseInt(JOptionPane.showInputDialog("Digite numero de la sala sobre la cual desea consultar las sillas"));
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Error-->"+nfe);
            return;
        }//fin catch

        //buscar el numero de ese sala
        for(int i=0; i<Salas.size(); i++){
            if(Salas.get(i).getNumSala()==numSala){
                JOptionPane.showMessageDialog(null,Salas.get(i).ConsultarSillas());
                return;
            }//fin if
        }//fin for
        JOptionPane.showMessageDialog(null,"No se encontro ninguna sala con ese numero");
    }
    public void VerSillasReservadas( ){
        int numSala;
        try{
            numSala=Integer.parseInt(JOptionPane.showInputDialog("Digite numero de la sala sobre la cual desea consultar las sillas reservadas"));
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Error-->"+nfe);
            return;
        }//fin catch

        //buscar el numero de ese sala
        for(int i=0; i<Salas.size(); i++){
            if(Salas.get(i).getNumSala()==numSala){
                JOptionPane.showMessageDialog(null,Salas.get(i).ConsultarSillas());
                return;
            }//fin if
        }//fin for
        JOptionPane.showMessageDialog(null,"No se encontro ninguna sala con ese numero");
    }

    //metodo para vender boletas:
    public void venderBoletas( ){
        int numeroReserva=0;
        int numSala=0;
        int error=0;
        do{
            error=0;
            try{
                numeroReserva=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero asignado de la(s) reserva(s)"));
                numSala=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la sala sobre la cual se hizo la reserva"));
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Error-->"+nfe);
                error=1;
                return;
            }//fin catch
        }while(error==1);

        //buscar el numero de ese sala
        for(int i=0; i<Salas.size(); i++){
            if(Salas.get(i).getNumSala()==numSala){
                JOptionPane.showMessageDialog(null,""+Salas.get(i).toString());
                Salas.get(i).VenderBoletaSala(numeroReserva);
                return;
            }//fin if
        }//fin for
        JOptionPane.showMessageDialog(null,"No se encontro ninguna sala con ese numero");
    }
}//FIN CLASE
