/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Controlador;
import Metodos.Trabajo;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Dares
 */
public class ConsultarTrabajador extends javax.swing.JDialog {

    private Controlador controlConsutarTrabajador;
    
    public ConsultarTrabajador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    ConsultarTrabajador(ConfiguracionAdminitrador aThis, boolean modal, Controlador controlConfi) {
        super(aThis, modal);
        initComponents();
        controlConsutarTrabajador =controlConfi;
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
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textCedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaConsultar = new javax.swing.JTextArea();
        buttonConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonAtras.setBackground(new java.awt.Color(255, 255, 0));
        buttonAtras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonAtras.setForeground(new java.awt.Color(0, 0, 0));
        buttonAtras.setText("Atras");
        buttonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 40, 95, 33));

        jPanel1.setBackground(new java.awt.Color(255, 229, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Consultar Trabajador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 40, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 229, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cedula:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 193, -1, -1));

        textCedula.setBackground(new java.awt.Color(241, 194, 50));
        textCedula.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textCedula.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(textCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 198, 336, 46));

        jScrollPane1.setEnabled(false);

        textAreaConsultar.setBackground(new java.awt.Color(255, 229, 153));
        textAreaConsultar.setColumns(20);
        textAreaConsultar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textAreaConsultar.setForeground(new java.awt.Color(0, 0, 0));
        textAreaConsultar.setRows(5);
        jScrollPane1.setViewportView(textAreaConsultar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 284, 547, 248));

        buttonConsultar.setBackground(new java.awt.Color(255, 255, 0));
        buttonConsultar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        buttonConsultar.setForeground(new java.awt.Color(0, 0, 0));
        buttonConsultar.setText("Consultar");
        buttonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 191, 171, 51));

        try {
            File pathToFile = new File("./imagenes/admin.png");
            BufferedImage bufferImage = ImageIO.read(pathToFile);
            ImageIcon imageIcon = new ImageIcon(bufferImage);
            jLabel1.setIcon(imageIcon);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonAtrasActionPerformed

    private void buttonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarActionPerformed
        // TODO add your handling code here:
         if(controlConsutarTrabajador.isInt(textCedula.getText())){
            Trabajo trabajadorArray = controlConsutarTrabajador.ConsultarTrabajoControlador(Integer.parseInt(textCedula.getText()));
            if (trabajadorArray != null){
                textAreaConsultar.setText("Trabajador:\n\n" + "Nombre: " + trabajadorArray.getNombre() +
                    "\nCedula: " + Integer.toString(trabajadorArray.getCedula()) + "\nTipo de trabajo: " + trabajadorArray.getTipoTrabajo() + "\nSeguridad: " + trabajadorArray.getTipoSeguridad() + "\nHora de Llegada: " + trabajadorArray.getHorallegada());
            }else{
                textAreaConsultar.setText("No se encontro la cedula");
            } 
        }else{
            textAreaConsultar.setText("ERROR\nDebe ingresar numeros");
        }
    }//GEN-LAST:event_buttonConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultarTrabajador dialog = new ConsultarTrabajador(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonAtras;
    private javax.swing.JButton buttonConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaConsultar;
    private javax.swing.JTextField textCedula;
    // End of variables declaration//GEN-END:variables
}
