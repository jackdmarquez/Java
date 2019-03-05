package buscaminas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class BuscaMinas extends JFrame implements ActionListener{

	principiante nivelPrincipiante = new principiante();
	intermedio nivelIntermedio = new intermedio();
	demente nivelDemente = new demente();
	
    private JMenuBar barra;
    private JMenu juego, ayuda;
    private JMenuItem principiante, intermedio, demente;    
    private boolean prin=true, inter=false, demen=false;  
    
    private String[] archi = {"/buscaminas/gano.png", "/buscaminas/perdio.png", "/buscaminas/nueva.png"};
	  
    private ImageIcon[] ima = new ImageIcon[3]; 
    
    public BuscaMinas(){    	
    	for(int i=0;i<3;i++){
            ima[i] = new ImageIcon(getClass().getResource(archi[i]));
        }
    	this.add(nivelPrincipiante);
    	this.setLayout(null);
    	this.setTitle("Deyvis xD BM!!!");        
        barra = new JMenuBar();

        juego = new JMenu("Juego");
        ayuda = new JMenu("Ayuda");

        principiante = new JMenuItem("Principiante");
        intermedio = new JMenuItem("Intermedio");
        demente = new JMenuItem("Demente");
        //agregamos los items de menu
        juego.add(principiante);
        juego.add(intermedio);
        juego.add(demente);
        //agregado los menu ala barra
        barra.add(juego);
        barra.add(ayuda);
        //bara agregada al frame
        this.setJMenuBar(barra);
        this.principiante.addActionListener(this);
        this.intermedio.addActionListener(this);
        this.demente.addActionListener(this);

        //propiedades del frame
        setSize(206, 294);        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        setIconImage(new ImageIcon(getClass().getResource("icono.png")).getImage());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {        
        if(e.getSource()==demente){
        	nivelDemente.botonD.setIcon(ima[2]);
        	nivelDemente.quitarBotonesDemente();
        	nivelDemente.setVisible(false);            
        	nivelDemente.labelD.setText("");
        	nivelDemente.nuevaPartidaDemente();
        	nivelDemente.setVisible(true);
        	if(prin){        		
        		this.remove(nivelPrincipiante);
        		this.add(nivelDemente);
        		prin=false;        		
        		demen=true;
        	}else if(inter){  
        		this.remove(nivelIntermedio);
        		this.add(nivelDemente);
        		inter=false;
        		demen=true;  
        	}
            setSize(606, 695);            
            setLocationRelativeTo(null);      
        }else if(e.getSource()==intermedio){ 
        	nivelIntermedio.botonI.setIcon(ima[2]);
        	nivelIntermedio.quitarBotonesIntermedio();
        	nivelIntermedio.setVisible(false);            
        	nivelIntermedio.labelI.setText("");
        	nivelIntermedio.nuevaPartidaIntermedio();
        	nivelIntermedio.setVisible(true);
        	if(prin){
        		this.remove(nivelPrincipiante);
        		this.add(nivelIntermedio);
        		prin=false;
        		inter=true; 
        	}else if(demen){
        		this.remove(nivelDemente);
        		this.add(nivelIntermedio);
        		inter=true;
        		demen=false;  
        	}
            setSize(406, 495);
            setLocationRelativeTo(null);  
        }else if(e.getSource()==principiante){        	
        	nivelPrincipiante.botonP.setIcon(ima[2]);
        	nivelPrincipiante.quitarBotonesPrincipiante();
        	nivelPrincipiante.setVisible(false);            
            nivelPrincipiante.labelP.setText("");
            nivelPrincipiante.nuevaPartidaPrincipiante();
            nivelPrincipiante.setVisible(true);
        	if(inter){
        		this.remove(nivelIntermedio);
        		this.add(nivelPrincipiante);
        		inter=false;
        		prin=true; 
        	}else if(demen){ 
        		this.remove(nivelDemente);
        		this.add(nivelPrincipiante);
        		prin=true;
        		demen=false;  
        	}	               
            setSize(206, 294);
            setLocationRelativeTo(null);   
        }
    }    

    public static void main(String[] args) {               
    	BuscaMinas i = new BuscaMinas();        
    }
}
