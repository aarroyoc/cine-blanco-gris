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
 * Las diferentes fases de la aplicación son diferentes JPanel
 * @author aarroyoc
 */
public class StateMachine extends JFrame {
    private JPanel currentState;
    private final Cartelera cartelera;
    
    
    /**
     * Crea la ventana y máquina de estados con una cartelera
     * Entra al estado CARTELERA
     * @param cartelera Cartelera que usará el sistema
     */
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
    
    /**
     * Pasar al estado DETALLE con una película
     * @param pelicula Película seleccionada 
     */
    public void goDetails(Pelicula pelicula){
        this.currentState = new Detalle(this,pelicula);
        this.update();
    }
    
    /**
     * Pasar al estado CARTELERA
     */
    public void goCartelera(){
        this.currentState = new Inicio(this,this.cartelera);
        this.update();
    }
    
    /**
     * Actualizar panel según el nuevo estado
     */
    private void update(){
        this.setContentPane(this.currentState);
        this.validate();
    }
}
