/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Pelicula;
import main.StateMachine;

/**
 *
 * @author aarroyoc
 */
public class Detalle extends javax.swing.JPanel {

    private final Pelicula pelicula;
    private final DetalleController control;
    
    public Detalle(StateMachine state, Pelicula pelicula) {
        this.pelicula = pelicula;
        this.control = new DetalleController(state,pelicula,this);
        initComponents();
        update();
        sinopsis.setCaretPosition(0);
    }
    
    public void update(){
        peliculaNombre.setText(pelicula.getInfo().getNombre());
        sinopsis.setText(pelicula.getInfo().getDescripcion());
        director.setText(pelicula.getInfo().getDirector());
        year.setText(pelicula.getInfo().getAnno()+"");
        img.setText("");
        img.setIcon(pelicula.getInfo().getPoster());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        peliculaNombre = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        director = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sesiones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sinopsis = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 500));

        peliculaNombre.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        peliculaNombre.setText("NOMBRE PELICULA");

        img.setText("IMAGEN");

        jLabel3.setFont(new java.awt.Font("Cantarell", 3, 15)); // NOI18N
        jLabel3.setText("sinopsis");

        jLabel5.setFont(new java.awt.Font("Cantarell", 3, 15)); // NOI18N
        jLabel5.setText("dirección");

        director.setFont(new java.awt.Font("Caladea", 0, 15)); // NOI18N
        director.setText("DIRECTOR");

        jLabel7.setFont(new java.awt.Font("Cantarell", 3, 15)); // NOI18N
        jLabel7.setText("año");

        year.setFont(new java.awt.Font("Caladea", 0, 15)); // NOI18N
        year.setText("AÑO");

        jLabel9.setFont(new java.awt.Font("Cantarell", 3, 15)); // NOI18N
        jLabel9.setText("sesiones");

        sesiones.setLayout(new javax.swing.BoxLayout(sesiones, javax.swing.BoxLayout.Y_AXIS));

        sinopsis.setEditable(false);
        sinopsis.setColumns(20);
        sinopsis.setFont(new java.awt.Font("Caladea", 0, 15)); // NOI18N
        sinopsis.setLineWrap(true);
        sinopsis.setRows(5);
        sinopsis.setWrapStyleWord(true);
        jScrollPane1.setViewportView(sinopsis);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Flecha.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(peliculaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(director)
                            .addComponent(jLabel7)
                            .addComponent(year)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sesiones, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31))))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(peliculaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(director)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(year))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)))
                .addComponent(sesiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        control.goBack();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel director;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel peliculaNombre;
    private javax.swing.JPanel sesiones;
    private javax.swing.JTextArea sinopsis;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
