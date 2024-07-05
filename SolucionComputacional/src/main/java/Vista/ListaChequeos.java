/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Controlador;
import Metodos.Carpintero;
import Metodos.Electricista;
import Metodos.OperadorDeMaquinaria;
import Metodos.Peon;
import Metodos.Soldador;
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
public class ListaChequeos extends javax.swing.JDialog {
    
       private Controlador controlListaChequeo;
       private String TituloPantalla = "                Chequeo ";
       private String TituloOperadorMaquinaria = "     Chequeo ";
       private ArrayList MedidasGenerales = new ArrayList();
       private ArrayList MedidasEspecificas = new ArrayList();
       private String MedidaGeneral1;
       private String MedidaGeneral2;
       private String MedidaGeneral3;
       private String MedidaGeneral4;
       private String MedidaGeneral5;
       private int ContadorChecks;
       private String MedidasEspecificas1;
       private String MedidasEspecificas2;
       private String MedidasEspecificas3;
       private String MedidasEspecificas4;
       private String MedidasEspecificas5;
       private String TrabajoTitulo; 
       private String NombreActual; 
       private int CedulaActual;
       
       
    /**
     * Creates new form ListaChequeos
     */
    public ListaChequeos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }

    public ListaChequeos(TrabajosElegir aThis, boolean modal, Controlador controlTrabajosElegir) {
        super(aThis,modal);
        initComponents();
        controlListaChequeo = controlTrabajosElegir;
        GenerandoListaChequeo();
    }
    
    public void GenerandoListaChequeo(){
        MedidasEspecificas.clear();
        MedidasGenerales.clear();
        TrabajoTitulo = controlListaChequeo.ObtenerTrabajoActual();
        NombreActual = controlListaChequeo.ObtenerNombreActual();
        CedulaActual = controlListaChequeo.ObternerCedulaActual();
        if(TrabajoTitulo == "Operador de Maquinaria"){
            TituloOperadorMaquinaria += TrabajoTitulo;
            Botonprueba.setText(TituloOperadorMaquinaria);
        } else {
            TituloPantalla += TrabajoTitulo;
            Botonprueba.setText(TituloPantalla);
        }
        MedidasGenerales = controlListaChequeo.ObteniendoMedidasGenerales();
        MedidaGeneral1 = (String) MedidasGenerales.get(0);
        MedidaGeneral2 = (String) MedidasGenerales.get(1);
        MedidaGeneral3 = (String) MedidasGenerales.get(2);
        MedidaGeneral4 = (String) MedidasGenerales.get(3);
        MedidaGeneral5 = (String) MedidasGenerales.get(4);
        
        CheckBox1.setText(MedidaGeneral1);
        CheckBox2.setText(MedidaGeneral2);
        CheckBox3.setText(MedidaGeneral3);
        CheckBox4.setText(MedidaGeneral4);
        CheckBox5.setText(MedidaGeneral5);
        
       if(TrabajoTitulo == "Carpintero"){
            Carpintero UnCarpintero = new Carpintero(NombreActual,CedulaActual, TrabajoTitulo);
            boolean RegistrandoCarpintero = controlListaChequeo.RegistrandoTrabajador(UnCarpintero);
            UnCarpintero.medidas_especificas();
            MedidasEspecificas = UnCarpintero.getMedidasEspecificasCarpintero();
            
            UnCarpintero.setHorallegada(controlListaChequeo.RegistrandoHora());
            MedidasEspecificas1 = (String) MedidasEspecificas.get(0);
            MedidasEspecificas2 = (String) MedidasEspecificas.get(1);
            MedidasEspecificas3 = (String) MedidasEspecificas.get(2);
            MedidasEspecificas4 = (String) MedidasEspecificas.get(3);
            MedidasEspecificas5 = (String) MedidasEspecificas.get(4);
            
            CheckBox6.setText(MedidasEspecificas1);
            CheckBox7.setText(MedidasEspecificas2);
            CheckBox8.setText(MedidasEspecificas3);
            CheckBox9.setText(MedidasEspecificas4);
            CheckBox10.setText(MedidasEspecificas5);
       }
       if(TrabajoTitulo == "Operador de Maquinaria"){
           
          
         
          OperadorDeMaquinaria UnOperadorDeMaquina = new OperadorDeMaquinaria(NombreActual,CedulaActual, TrabajoTitulo);
          boolean RegistrandoODeMaquinas = controlListaChequeo.RegistrandoTrabajador(UnOperadorDeMaquina);
          UnOperadorDeMaquina.medidas_especificas();
          MedidasEspecificas = UnOperadorDeMaquina.getMedidasEspecificasElectricista();
          UnOperadorDeMaquina.setHorallegada(controlListaChequeo.RegistrandoHora());
          MedidasEspecificas1 = (String) MedidasEspecificas.get(0);
          MedidasEspecificas2 = (String) MedidasEspecificas.get(1);
          MedidasEspecificas3 = (String) MedidasEspecificas.get(2);
          MedidasEspecificas4 = (String) MedidasEspecificas.get(3);
          MedidasEspecificas5 = (String) MedidasEspecificas.get(4);
            
          CheckBox6.setText(MedidasEspecificas1);
          CheckBox7.setText(MedidasEspecificas2);
          CheckBox8.setText(MedidasEspecificas3);
          CheckBox9.setText(MedidasEspecificas4);
          CheckBox10.setText(MedidasEspecificas5);
       }
       if(TrabajoTitulo == "Peon"){
           
            
            Peon UnPeon = new Peon(NombreActual,CedulaActual, "Peon");
            boolean RegistrandoPeon = controlListaChequeo.RegistrandoTrabajador(UnPeon);
            UnPeon.medidas_especificas();
            MedidasEspecificas = UnPeon.getMedidasEspecificasPeon();
            UnPeon.setHorallegada(controlListaChequeo.RegistrandoHora());
            MedidasEspecificas1 = (String) MedidasEspecificas.get(0);
            MedidasEspecificas2 = (String) MedidasEspecificas.get(1);
            MedidasEspecificas3 = (String) MedidasEspecificas.get(2);
            MedidasEspecificas4 = (String) MedidasEspecificas.get(3);
            MedidasEspecificas5 = (String) MedidasEspecificas.get(4);

            CheckBox6.setText(MedidasEspecificas1);
            CheckBox7.setText(MedidasEspecificas2);
            CheckBox8.setText(MedidasEspecificas3);
            CheckBox9.setText(MedidasEspecificas4);
            CheckBox10.setText(MedidasEspecificas5);
       }
       if(TrabajoTitulo == "Electricista") {
           
          
            Electricista UnElectricista = new Electricista(NombreActual,CedulaActual, TrabajoTitulo);
            boolean RegistrandoElectricista = controlListaChequeo.RegistrandoTrabajador(UnElectricista);
            UnElectricista.medidas_especificas();
            UnElectricista.setHorallegada(controlListaChequeo.RegistrandoHora());
            MedidasEspecificas = UnElectricista.getMedidasEspecificasElectricista();
            
            MedidasEspecificas1 = (String) MedidasEspecificas.get(0);
            MedidasEspecificas2 = (String) MedidasEspecificas.get(1);
            MedidasEspecificas3 = (String) MedidasEspecificas.get(2);
            MedidasEspecificas4 = (String) MedidasEspecificas.get(3);
            MedidasEspecificas5 = (String) MedidasEspecificas.get(4);

            CheckBox6.setText(MedidasEspecificas1);
            CheckBox7.setText(MedidasEspecificas2);
            CheckBox8.setText(MedidasEspecificas3);
            CheckBox9.setText(MedidasEspecificas4);
            CheckBox10.setText(MedidasEspecificas5);
        }
       if(TrabajoTitulo == "Soldador"){
        
    
        Soldador UnSoldador = new Soldador(NombreActual,CedulaActual, TrabajoTitulo);
        boolean RegistrandoSoldador = controlListaChequeo.RegistrandoTrabajador(UnSoldador);
        
        UnSoldador.setHorallegada(controlListaChequeo.RegistrandoHora());
        UnSoldador.medidas_especificas();
        MedidasEspecificas = UnSoldador.getMedidasEspecificasSoldador();
        
        MedidasEspecificas1 = (String) MedidasEspecificas.get(0);
        MedidasEspecificas2 = (String) MedidasEspecificas.get(1);
        MedidasEspecificas3 = (String) MedidasEspecificas.get(2);
        MedidasEspecificas4 = (String) MedidasEspecificas.get(3);
        MedidasEspecificas5 = (String) MedidasEspecificas.get(4);

        CheckBox6.setText(MedidasEspecificas1);
        CheckBox7.setText(MedidasEspecificas2);
        CheckBox8.setText(MedidasEspecificas3);
        CheckBox9.setText(MedidasEspecificas4);
        CheckBox10.setText(MedidasEspecificas5);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        Botonprueba = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        CheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        CheckBox2 = new javax.swing.JCheckBox();
        CheckBox3 = new javax.swing.JCheckBox();
        CheckBox4 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        CheckBox5 = new javax.swing.JCheckBox();
        CheckBox6 = new javax.swing.JCheckBox();
        CheckBox7 = new javax.swing.JCheckBox();
        CheckBox8 = new javax.swing.JCheckBox();
        CheckBox9 = new javax.swing.JCheckBox();
        CheckBox10 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        BotonCompletarChequeo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Botonprueba.setEditable(false);
        Botonprueba.setBackground(new java.awt.Color(255, 229, 153));
        Botonprueba.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Botonprueba.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(Botonprueba);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 16, 484, 54));

        jPanel1.setBackground(new java.awt.Color(255, 229, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CheckBox1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CheckBox1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Medidas Generales");

        CheckBox2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CheckBox2.setForeground(new java.awt.Color(0, 0, 0));

        CheckBox3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CheckBox3.setForeground(new java.awt.Color(0, 0, 0));

        CheckBox4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CheckBox4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Medidas Especificas");

        CheckBox5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        CheckBox5.setForeground(new java.awt.Color(0, 0, 0));

        CheckBox6.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        CheckBox6.setForeground(new java.awt.Color(0, 0, 0));

        CheckBox7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        CheckBox7.setForeground(new java.awt.Color(0, 0, 0));

        CheckBox8.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        CheckBox8.setForeground(new java.awt.Color(0, 0, 0));

        CheckBox9.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        CheckBox9.setForeground(new java.awt.Color(0, 0, 0));

        CheckBox10.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        CheckBox10.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CheckBox6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CheckBox9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CheckBox10, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(CheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox10)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 101, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Marque las medidas de seguridad que tomó en cuenta para iniciar su trabajo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 76, 551, -1));

        BotonCompletarChequeo.setBackground(new java.awt.Color(255, 217, 102));
        BotonCompletarChequeo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BotonCompletarChequeo.setForeground(new java.awt.Color(0, 0, 0));
        BotonCompletarChequeo.setText("Completar Chequeo");
        BotonCompletarChequeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCompletarChequeoActionPerformed(evt);
            }
        });
        getContentPane().add(BotonCompletarChequeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, 204, 55));

        jButton1.setBackground(new java.awt.Color(255, 217, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Ver Riegos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 126, 99));

        try {
            File pathToFile = new File("./imagenes/listachequeo.jpg");
            BufferedImage bufferImage = ImageIO.read(pathToFile);
            ImageIcon imageIcon = new ImageIcon(bufferImage);
            jLabel3.setIcon(imageIcon);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCompletarChequeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCompletarChequeoActionPerformed
        Trabajo UnTrabajador = controlListaChequeo.ConsultarTrabajo();
        ContadorChecks = 0;
        if(CheckBox1.isSelected()){
            ContadorChecks++;
         }
        if(CheckBox2.isSelected()){
            ContadorChecks++;
        }
        if(CheckBox3.isSelected()){
            ContadorChecks++;
        }
        if(CheckBox4.isSelected()){
            ContadorChecks++;
        }
        if(CheckBox5.isSelected()){
            ContadorChecks++;
        }
        
        if(CheckBox6.isSelected()){
            ContadorChecks++;
        }
        if(CheckBox7.isSelected()){
            ContadorChecks++;
        }
        if(CheckBox8.isSelected()){
            ContadorChecks++;
        }
        if(CheckBox9.isSelected()){
            ContadorChecks++;
        }
        if(CheckBox10.isSelected()){
            ContadorChecks++;
        }
        if(ContadorChecks == 10){
            UnTrabajador.setTipoSeguridad("Completa");
        } else {
            UnTrabajador.setTipoSeguridad("Incompleta");
            String Correo = controlListaChequeo.verCorreoAdmin();
            controlListaChequeo.EnviarCorreo(Correo,NombreActual,CedulaActual,TrabajoTitulo);
        }
        this.dispose();
    }//GEN-LAST:event_BotonCompletarChequeoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RiesgosTrabajador ventanaRiegosTrabajador = new RiesgosTrabajador(this,true,controlListaChequeo);
        ventanaRiegosTrabajador.setVisible(true);
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
            java.util.logging.Logger.getLogger(ListaChequeos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaChequeos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaChequeos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaChequeos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaChequeos dialog = new ListaChequeos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BotonCompletarChequeo;
    private javax.swing.JTextPane Botonprueba;
    private javax.swing.JCheckBox CheckBox1;
    private javax.swing.JCheckBox CheckBox10;
    private javax.swing.JCheckBox CheckBox2;
    private javax.swing.JCheckBox CheckBox3;
    private javax.swing.JCheckBox CheckBox4;
    private javax.swing.JCheckBox CheckBox5;
    private javax.swing.JCheckBox CheckBox6;
    private javax.swing.JCheckBox CheckBox7;
    private javax.swing.JCheckBox CheckBox8;
    private javax.swing.JCheckBox CheckBox9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
