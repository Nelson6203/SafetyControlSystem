/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Controlador;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dares
 */
public class ConfiguracionAdminitrador extends javax.swing.JDialog {

    private Controlador controlConfi;
    
    public ConfiguracionAdminitrador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    ConfiguracionAdminitrador(IngresoAdministrador aThis, boolean modal, Controlador controlIngresoAdministrador) {
        super(aThis, modal);
        initComponents();
        controlConfi = controlIngresoAdministrador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAtras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ButonEliminarTrabajador = new javax.swing.JButton();
        ButonModificarTrabajador = new javax.swing.JButton();
        ButonConsultarTrabajador = new javax.swing.JButton();
        ButonTotalTrabajadores = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textCorreo = new javax.swing.JTextField();
        GuardarCambios = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonAtras.setBackground(new java.awt.Color(255, 255, 0));
        buttonAtras.setText("Atras");
        buttonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 17, 95, 33));

        jPanel1.setBackground(new java.awt.Color(255, 229, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(255, 217, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Personal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 106, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 229, 153));

        jLabel4.setBackground(new java.awt.Color(255, 217, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Trabajadores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 106, -1, -1));

        ButonEliminarTrabajador.setBackground(new java.awt.Color(255, 255, 0));
        ButonEliminarTrabajador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButonEliminarTrabajador.setForeground(new java.awt.Color(0, 0, 0));
        ButonEliminarTrabajador.setText("Eliminar Trabajador");
        ButonEliminarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonEliminarTrabajadorActionPerformed(evt);
            }
        });
        getContentPane().add(ButonEliminarTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 239, 190, 47));

        ButonModificarTrabajador.setBackground(new java.awt.Color(255, 255, 0));
        ButonModificarTrabajador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButonModificarTrabajador.setForeground(new java.awt.Color(0, 0, 0));
        ButonModificarTrabajador.setText("Modificar Trabajador");
        ButonModificarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonModificarTrabajadorActionPerformed(evt);
            }
        });
        getContentPane().add(ButonModificarTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 298, 190, 47));

        ButonConsultarTrabajador.setBackground(new java.awt.Color(255, 255, 0));
        ButonConsultarTrabajador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButonConsultarTrabajador.setForeground(new java.awt.Color(0, 0, 0));
        ButonConsultarTrabajador.setText("Consultar Trabajador");
        ButonConsultarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonConsultarTrabajadorActionPerformed(evt);
            }
        });
        getContentPane().add(ButonConsultarTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 363, 190, 47));

        ButonTotalTrabajadores.setBackground(new java.awt.Color(255, 255, 0));
        ButonTotalTrabajadores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButonTotalTrabajadores.setForeground(new java.awt.Color(0, 0, 0));
        ButonTotalTrabajadores.setText("Total de trabajadores");
        ButonTotalTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonTotalTrabajadoresActionPerformed(evt);
            }
        });
        getContentPane().add(ButonTotalTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 422, 190, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Correo personal:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 246, 130, 33));

        jPanel3.setBackground(new java.awt.Color(255, 229, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("correo:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 298, -1, -1));

        textCorreo.setBackground(new java.awt.Color(255, 229, 153));
        textCorreo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textCorreo.setForeground(new java.awt.Color(0, 0, 0));
        textCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(textCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 303, 290, 38));

        GuardarCambios.setBackground(new java.awt.Color(255, 255, 0));
        GuardarCambios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GuardarCambios.setForeground(new java.awt.Color(0, 0, 0));
        GuardarCambios.setText("Guardar Cambios");
        GuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCambiosActionPerformed(evt);
            }
        });
        getContentPane().add(GuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 170, 60));

        try {
            File pathToFile = new File("./imagenes/admin.png");
            BufferedImage bufferImage = ImageIO.read(pathToFile);
            ImageIcon imageIcon = new ImageIcon(bufferImage);
            jLabel5.setIcon(imageIcon);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1130, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonAtrasActionPerformed

    private void ButonConsultarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonConsultarTrabajadorActionPerformed
        // TODO add your handling code here:
        ConsultarTrabajador consultarTrabajador = new ConsultarTrabajador(this,true,controlConfi);
        consultarTrabajador.setVisible(true);
        
    }//GEN-LAST:event_ButonConsultarTrabajadorActionPerformed

    private void ButonTotalTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonTotalTrabajadoresActionPerformed
        // TODO add your handling code here:
        TotalTrabajadores totalTrabajadores = new TotalTrabajadores(this,true,controlConfi);
        totalTrabajadores.setVisible(true);
        
    }//GEN-LAST:event_ButonTotalTrabajadoresActionPerformed

    private void textCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCorreoActionPerformed

    private void ButonEliminarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonEliminarTrabajadorActionPerformed
        // TODO add your handling code here:
        EliminarTrabajo elimarTrabajo = new EliminarTrabajo(this,true,controlConfi);
        elimarTrabajo.setVisible(true);
        
    }//GEN-LAST:event_ButonEliminarTrabajadorActionPerformed

    private void ButonModificarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonModificarTrabajadorActionPerformed
        // TODO add your handling code here:
        ModificarTrabajador modificarTrabajador = new ModificarTrabajador(this,true,controlConfi);
        modificarTrabajador.setVisible(true);
        
    }//GEN-LAST:event_ButonModificarTrabajadorActionPerformed

    private void GuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCambiosActionPerformed
        // TODO add your handling code here:
        controlConfi.correoAdmin(textCorreo.getText());
        JOptionPane.showMessageDialog(null,"Se cambio el correo exitosamente.");
    }//GEN-LAST:event_GuardarCambiosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionAdminitrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionAdminitrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionAdminitrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguracionAdminitrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConfiguracionAdminitrador dialog = new ConfiguracionAdminitrador(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButonConsultarTrabajador;
    private javax.swing.JButton ButonEliminarTrabajador;
    private javax.swing.JButton ButonModificarTrabajador;
    private javax.swing.JButton ButonTotalTrabajadores;
    private javax.swing.JButton GuardarCambios;
    private javax.swing.JButton buttonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField textCorreo;
    // End of variables declaration//GEN-END:variables
}
