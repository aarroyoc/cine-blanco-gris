package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;
import java.time.LocalDateTime;

import modelo.Cartelera;
import modelo.Pelicula;

import vista.Inicio;
import vista.Detalle;
import vista.Compra;
import vista.Pago;

/**
 * Ventana y máquina de estados
 * Las diferentes fases de la aplicación son diferentes JPanel
 * @author aarroyoc
 */
public class StateMachine extends JFrame {
    private JPanel currentState;
    private final Cartelera cartelera;
    private Pelicula pelicula;
    private LocalDateTime sesion;
    
    
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
     * Pasar al estado CARTELERA
     */
    public void goCartelera(){
        this.currentState = new Inicio(this,this.cartelera);
        this.update();
    }
    
    /**
     * Pasar al estado DETALLE con una película
     * @param pelicula Película seleccionada 
     */
    public void goDetails(Pelicula pelicula){
        this.currentState = new Detalle(this,pelicula);
        this.pelicula = pelicula;
        this.update();
    }
    
    /**
     * Pasar al estado Compra
     * @param sesion Sesión seleccionada
     */
    public void goTickets(LocalDateTime sesion){
        this.currentState = new Compra(this,pelicula,sesion);
        this.sesion = sesion;
        this.update();
    }
    
    public void goTicketsBack(){
        this.currentState = new Compra(this,pelicula,sesion);
        this.update();
    }
    
    public void goPago(float price){
        this.currentState = new Pago(this,price);
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
