/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import main.StateMachine;
import modelo.Cartelera;
import modelo.Pelicula;
import modelo.PeliculaInfo;

import javax.swing.*;

/**
 * @author sergalo
 * @author aarroyoc
 */
public class Inicio extends javax.swing.JPanel {

    private final Cartelera cartelera;
    private final InicioController control;
    private JPanel films;
    private final JScrollPane scroll;
   
    /**
     * Creates new form Pago
     * @param ventana
     * @param cartelera
     */
    public Inicio(StateMachine ventana, Cartelera cartelera) {
        this.cartelera = cartelera;
        this.control = new InicioController(ventana,cartelera,this);
        initComponents();
        JPanel panel = this.mostrarCartelera();
        scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.add(scroll);
        
    }
    
    private JPanel mostrarCartelera(){
        int columnas = 3;
        int filas =(int)Math.ceil(cartelera.getPeliculas().size()/(float)columnas);
        films = new JPanel();
        films.setLayout(new java.awt.GridLayout(filas,columnas));
        for(Pelicula pelicula : cartelera.getPeliculas()){
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
            
            JPanel botonPanel = new JPanel();
            botonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER,0,0));
            JButton boton = new JButton();
            boton.setIcon(pelicula.getInfo().getPoster());
            boton.addActionListener((java.awt.event.ActionEvent evt) -> {
                control.goDetail(pelicula);
            });
            botonPanel.add(boton);
            panel.add(botonPanel);
            
            JPanel labelPanel = new JPanel();
            labelPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER,0,0));
            JLabel label = new JLabel();
            label.setText(pelicula.getInfo().getNombre());
            //label.setHorizontalAlignment(JLabel.CENTER);
            labelPanel.add(label);
            panel.add(labelPanel);
            
            films.add(panel);
        }
        return films;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/CineBlancoGris.png"))); // NOI18N
        jPanel1.add(jLabel2);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
