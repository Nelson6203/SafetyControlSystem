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
public class Registro extends javax.swing.JDialog {
    
    private Controlador controlRegistro;
    /**
     * Creates new form Registro
     */
    public Registro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Registro(MenuInicio aThis, boolean modal, Controlador elControlador) {
        super(aThis,modal);
        initComponents();
        controlRegistro = elControlador;
    }
    
    private static boolean isInt(String cadena){
        try{
            Integer.parseInt(cadena);
            return true;
        }
        catch (NumberFormatException nfe){
            return false;
        }
       }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        BotonNombreRegistro = new javax.swing.JTextField();
        panel4 = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        BotonCedulaRegistro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(255, 229, 153));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Registro Trabajador");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        panel2.setBackground(new java.awt.Color(255, 229, 153));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre: ");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        BotonNombreRegistro.setBackground(new java.awt.Color(246, 178, 107));
        BotonNombreRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(BotonNombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 391, 45));

        panel4.setBackground(new java.awt.Color(255, 229, 153));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cédula:");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        BotonCedulaRegistro.setBackground(new java.awt.Color(246, 178, 107));
        BotonCedulaRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotonCedulaRegistro.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(BotonCedulaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 391, 45));

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 199, 94));

        try {
            File pathToFile = new File("./imagenes/registro.jpg");
            BufferedImage bufferImage = ImageIO.read(pathToFile);
            ImageIcon imageIcon = new ImageIcon(bufferImage);
            jLabel1.setIcon(imageIcon);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        boolean ValidandoNombre = false;
        boolean ValidandoCedula = false;
        
        // Validando Nombre
        String NombreTrabajadorRegistro = BotonNombreRegistro.getText();
                
        if(NombreTrabajadorRegistro.isEmpty()){
            JOptionPane.showMessageDialog(null,"Error: \nEl campo Nombre esta vacio.");  
         } else {
            ValidandoNombre = true;
        }
        
        // Valindando Cedula
        
        String CedulaTrabajoRegistro = BotonCedulaRegistro.getText();
        if(!CedulaTrabajoRegistro.isEmpty()){
         if (isInt(BotonCedulaRegistro.getText())){ //validar que lo que ingreso es un int
             ValidandoCedula = true;
            }
            else{
                JOptionPane.showMessageDialog(null,"Error en Cedula:\nCédula debe contener solo números.");
            }
            } else {
                JOptionPane.showMessageDialog(null,"Error:\nEl campo cédula esta vacio."); 
            }

        int CedulaTrabajoRegistro1 = Integer.parseInt(BotonCedulaRegistro.getText());
        
        if (ValidandoNombre && ValidandoCedula){
                    boolean GuardandoNombre = controlRegistro.GuardandoNombreCedula(NombreTrabajadorRegistro,CedulaTrabajoRegistro1);
                    JOptionPane.showMessageDialog(null,"Pasando a elegir el tipo de trabajo!");
                    
                    this.dispose();
                    TrabajosElegir ventanaTrabajosElegir = new TrabajosElegir(this,true,controlRegistro);
                    ventanaTrabajosElegir.setVisible(true);
                    } else {
                    JOptionPane.showMessageDialog(null,"Error al ingresar!" );
                    
                        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registro dialog = new Registro(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField BotonCedulaRegistro;
    private javax.swing.JTextField BotonNombreRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel4;
    // End of variables declaration//GEN-END:variables

    
}
