/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Metodos.Trabajo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Dares
 */
public class Controlador {
    
    public Controlador() {
    }
    
    private AdmGeneral admgeneral = new AdmGeneral();

    public boolean GuardandoNombreCedula(String Nombre,int cedula){
        return admgeneral.GuardarNombreCedula(Nombre, cedula);
    }
    
    public Trabajo ConsultarTrabajo(){
        return admgeneral.RetornandoTrabajador();
    }
    
    public String ObtenerNombreActual(){
        return admgeneral.getNombreActual();
    }
    public int ObternerCedulaActual(){
        return admgeneral.getCedulaActual();
    }
    public boolean GuardarTrabajo(String Trabajo){
        return admgeneral.GuardarTrabajoUltimo(Trabajo);
    }
    
    public String ObtenerTrabajoActual(){
        return admgeneral.getTipoTrabajo();
    }
    
    public boolean RegistrandoTrabajador(Trabajo UnTrabajador){
        return admgeneral.RegistrarTrabajador(UnTrabajador);
    }
    
    public ArrayList ObteniendoMedidasGenerales(){
        admgeneral.medidas_generales_cargar_archivo();
        return admgeneral.getMedidasGenerales();
    }
    
    
    public boolean isInt(String cadena){
        try{
            Integer.parseInt(cadena);
            return true;
        }
        catch (NumberFormatException nfe){
            return false;
        }
    }
    public boolean IniciarSeccionAdmin(String usuario, String contra){
        FileReader fr = null;
        BufferedReader br = null;
        String usuarioVerdadero = "";
        String contraVerdadero = "";

        try {
            fr = new FileReader ("src\\main\\java\\Vista\\informacionAdministrador.txt");
            br = new BufferedReader(fr);

            String linea;
            String[] lineaSplit = null;
            while((linea=br.readLine())!=null){
                lineaSplit = linea.split(":");
                if (lineaSplit[0].equals("usuario")){
                    usuarioVerdadero = lineaSplit[1];
                }
                if (lineaSplit[0].equals("contrasena")){
                    contraVerdadero = lineaSplit[1];
                }
            }
            
        } 
        catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo");
        }
        catch (IOException ex) {
            System.out.println("Problemas leyendo el archivo");
        }
        finally {
            try {
                fr.close();
                br.close();
            } catch (IOException ex) {
                System.out.println("Error cerrando el archivo");;
            }
        }
        if(usuarioVerdadero.equals(usuario) && contraVerdadero.equals(contra)){
            return true;
        }else{
            return false;
        }
    }
    
    public void EnviarCorreo(String Correo,String Nombre,int Cedula,String TipoTrabajo){
        try {
        Properties propiedades = new Properties();
        propiedades.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedades.setProperty("mail.smtp.starttls.enable", "true");
        propiedades.setProperty("mail.smtp.port", "587");
        propiedades.setProperty("mail.smtp.auth", "true");
        
        
        Session sesion = Session.getDefaultInstance(propiedades);
        String correo_emisor = "proyecto1Casilleros@gmail.com";
        String contraseña_emisor = "trabalenguas";
        
        String correo_receptor = Correo;
        String asunto = "El trabajador "+  Nombre + "de cédula: " +  Cedula + " se ha registrado y reportó una seguridad incompleta";
        String mensaje = "El trabajador: " + Nombre + " cédula: " + Cedula + " se ha registrado como tipo de trabajo: " + TipoTrabajo + "\nSe ha registrado y su resultado al completar el chequeo de seguridad dio INCOMPLETO";
        
        
        MimeMessage message = new MimeMessage(sesion);
        message.setFrom(new InternetAddress(correo_emisor));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(correo_receptor));
        message.setSubject(asunto);
        message.setText(mensaje);
        
        Transport transporte = sesion.getTransport("smtp");
        transporte.connect(correo_emisor,contraseña_emisor);
        transporte.sendMessage(message , message.getRecipients(Message.RecipientType.TO));
        transporte.close();
        
        JOptionPane.showMessageDialog(null,"Correo enviado.");
        
        } catch (AddressException ex) {
           JOptionPane.showMessageDialog(null,"Error : " +ex);
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null,"Error : " +ex);
        }
    } 
    
    public String verCorreoAdmin(){
        FileReader fr = null;
        BufferedReader br = null;
        String correo = "";

        try {
            fr = new FileReader ("src\\main\\java\\Vista\\informacionAdministrador.txt");
            br = new BufferedReader(fr);

            String linea;
            String[] lineaSplit = null;
            
            while((linea=br.readLine())!=null){
                
                lineaSplit = linea.split(":");
                if (lineaSplit[0].equals("correo")){
                    System.out.println("buenas");
                    correo = lineaSplit[1];
                }
            }             
        } 
        catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo");
        }
        catch (IOException ex) {
            System.out.println("Problemas leyendo el archivo");
        }
        finally {
            try {
                fr.close();
                br.close();
            } catch (IOException ex) {
                System.out.println("Error cerrando el archivo");;
            }
        }
        return correo;
    }
    
   public void correoAdmin(String correoAdmin){
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fichero = null;
        String usuarioVerdadero = "";
        String contraVerdadero = "";
        try {
            fr = new FileReader ("src\\main\\java\\Vista\\informacionAdministrador.txt");
            br = new BufferedReader(fr);

            String linea;
            String[] lineaSplit = null;
            while((linea=br.readLine())!=null){
                lineaSplit = linea.split(":");
                if (lineaSplit[0].equals("usuario")){
                    usuarioVerdadero = lineaSplit[1];
                }
                if (lineaSplit[0].equals("contrasena")){
                    contraVerdadero = lineaSplit[1];
                }
            }
            fr.close();
            br.close();
            File archivo = new File("src\\main\\java\\Vista\\informacionAdministrador.txt");
            archivo.delete();
            File archivo1 = new File("src\\main\\java\\Vista\\informacionAdministrador.txt");
            fichero = new FileWriter(archivo1,true);
            fichero.write("usuario:" + usuarioVerdadero + "\r\n");
            fichero.write("contrasena:" + contraVerdadero + "\r\n");
            fichero.write("correo:" + correoAdmin);
        } 
        catch (FileNotFoundException ex) {
            System.out.println("No se encontro el archivo");
        }
        catch (IOException ex) {
            System.out.println("Problemas leyendo el archivo");
        }
        finally {
            try {
                fr.close();
                br.close();
                fichero.close();
            } catch (IOException ex) {
                System.out.println("Error cerrando el archivo");;
            }
        }
    }
    public boolean eliminarTrabajoControlador(int cedula){
        return admgeneral.Eliminar(cedula);
    }
    public boolean validarCedulaControlador(int cedula){
        return admgeneral.validarCedula(cedula);
    }
    public boolean ModificarTrabajadorControlador(int cedula, String nombreNuevo, int cedulaNueva){
        return admgeneral.Modificar(cedula, nombreNuevo, cedulaNueva);
    }
    public Trabajo ConsultarTrabajoControlador(int cedula){
        return admgeneral.Consultar(cedula);
    }
    public int totalTrabajadores(){
        return admgeneral.totalTrabajadores();
    }
    
    public LocalTime RegistrandoHora(){
        LocalTime HoraActual = LocalTime.now();
        return HoraActual;
    }
}
