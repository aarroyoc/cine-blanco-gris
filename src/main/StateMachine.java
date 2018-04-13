package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

import modelo.Cartelera;
import modelo.Pelicula;

import vista.Inicio;
import vista.Detalle;

/**
 * Ventana y máquina de estados
 * @author aarroyoc
 */
public class StateMachine extends JFrame {
    private JPanel currentState;
    private final Cartelera cartelera;
    
    
    public StateMachine(Cartelera cartelera){
        this.cartelera = cartelera;
        this.currentState = new Inicio(this,cartelera);
        this.setContentPane(this.currentState);
        this.setSize(700,500);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("CINE BLANCO Y GRIS");
        
        this.addWindowListener(new WindowAdapter(){
          @Override
          public void windowClosing(WindowEvent e)
          {
            dispose();
            System.exit(0); //calling the method is a must
          }
        });
    }
    
    public void verDetalles(Pelicula pelicula){
        this.currentState = new Detalle(pelicula);
        this.update();
    }
    
    private void update(){
        this.setContentPane(this.currentState);
        this.validate();
    }
}
