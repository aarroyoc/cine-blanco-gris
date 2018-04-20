/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import main.StateMachine;
import modelo.Pelicula;
import java.time.LocalDateTime;

/**
 * @author aarroyoc
 * @author seralpa
 */
public class Compra extends javax.swing.JPanel {

    private final CompraController c;
    private Pelicula pelicula;
    private LocalDateTime sesion;
    /**
     * Creates new form Compra
     */
    public Compra(StateMachine state, Pelicula pelicula, LocalDateTime sesion) {
        initComponents();
        c=new CompraController(state,pelicula,sesion,this);
        this.pelicula=pelicula;
        this.sesion=sesion;
        update();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        entradaNormal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sEntradasNormales = new javax.swing.JSpinner();
        entradaNinos = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        sEntradasNinos = new javax.swing.JSpinner();
        TOTAL = new javax.swing.JLabel();
        jpanel5 = new javax.swing.JPanel();
        precioTotal = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        poster = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        tituloPeli = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        next = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecciona tus entradas");

        jPanel1.setPreferredSize(new java.awt.Dimension(318, 130));
        jPanel1.setLayout(new java.awt.GridLayout(3, 2, 60, 30));

        entradaNormal.setText("Entradas normales    7.00€");
        jPanel1.add(entradaNormal);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        sEntradasNormales.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        sEntradasNormales.setPreferredSize(new java.awt.Dimension(50, 30));
        sEntradasNormales.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sEntradasNormalesStateChanged(evt);
            }
        });
        jPanel3.add(sEntradasNormales, new java.awt.GridBagConstraints());

        jPanel1.add(jPanel3);

        entradaNinos.setText("Entradas niños    5.00€");
        jPanel1.add(entradaNinos);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        sEntradasNinos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        sEntradasNinos.setPreferredSize(new java.awt.Dimension(50, 30));
        sEntradasNinos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sEntradasNinosStateChanged(evt);
            }
        });
        jPanel4.add(sEntradasNinos, new java.awt.GridBagConstraints());

        jPanel1.add(jPanel4);

        TOTAL.setText("Total");
        jPanel1.add(TOTAL);

        jpanel5.setLayout(new java.awt.GridBagLayout());

        precioTotal.setText("0");
        jpanel5.add(precioTotal, new java.awt.GridBagConstraints());

        jPanel1.add(jpanel5);

        jPanel5.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel5.setLayout(new java.awt.GridLayout(2, 1, 0, 10));
        jPanel5.add(poster);

        tituloPeli.setText("jLabel5");

        fecha.setText("jLabel6");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloPeli)
                    .addComponent(fecha))
                .addGap(42, 42, 42))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPeli)
                .addGap(18, 18, 18)
                .addComponent(fecha)
                .addContainerGap())
        );

        jPanel5.add(jPanel6);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Flecha.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Adelante.png"))); // NOI18N
        next.setEnabled(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(next)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(next))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("jLabel1");
    }// </editor-fold>//GEN-END:initComponents

    private void sEntradasNormalesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sEntradasNormalesStateChanged
        c.updatePrice();
    }//GEN-LAST:event_sEntradasNormalesStateChanged

    private void sEntradasNinosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sEntradasNinosStateChanged
        c.updatePrice();
    }//GEN-LAST:event_sEntradasNinosStateChanged

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        c.siguiente();
    }//GEN-LAST:event_nextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        c.atras();
    }//GEN-LAST:event_jButton1ActionPerformed

    public int getSEntradasNormalesValue(){
        return (int)sEntradasNormales.getValue();
    }

    public int getSEntradasNinosValue(){
        return (int)sEntradasNinos.getValue();
    }
    
    public void setPrecioTotal(String text){
        precioTotal.setText(text);
    }
    
    public void setNextButton(boolean state){
        next.setEnabled(state);
    }
    
    public void update(){
        poster.setIcon(pelicula.getInfo().getPoster());
        tituloPeli.setText(pelicula.getInfo().getNombre());
        fecha.setText(sesion.getDayOfWeek()+"  "+sesion.getMonth()+"/"+sesion.getDayOfMonth()+"  "+sesion.getHour()+":"+sesion.getMinute());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TOTAL;
    private javax.swing.JLabel entradaNinos;
    private javax.swing.JLabel entradaNormal;
    private javax.swing.JLabel fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jpanel5;
    private javax.swing.JButton next;
    private javax.swing.JLabel poster;
    private javax.swing.JLabel precioTotal;
    private javax.swing.JSpinner sEntradasNinos;
    private javax.swing.JSpinner sEntradasNormales;
    private javax.swing.JLabel tituloPeli;
    // End of variables declaration//GEN-END:variables
}
