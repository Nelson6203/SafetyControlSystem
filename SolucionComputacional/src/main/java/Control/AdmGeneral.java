/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Metodos.Trabajo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Omar Madrigal
 */
public class AdmGeneral {
    
    public ArrayList<Trabajo> ListaTrabajadores  =  new ArrayList();
    protected  ArrayList medidasGenerales = new ArrayList();
    protected  ArrayList Riesgos = new ArrayList();
    String NombreActual;
    int CedulaActual;
    String TipoTrabajo;
    
    public boolean GuardarNombreCedula(String Nombre,int Cedula){
        this.NombreActual = Nombre;
        this.CedulaActual = Cedula;
        return true;
    }

    public String getNombreActual() {
        return NombreActual;
    }

    public int getCedulaActual() {
        return CedulaActual;
    }
    
    public boolean GuardarTrabajoUltimo(String Trabajo){
        this.TipoTrabajo = Trabajo;
        return true;
    }

    public String getTipoTrabajo() {
        return TipoTrabajo;
    }

    public ArrayList getMedidasGenerales() {
        return medidasGenerales;
    }

    public ArrayList getRiesgos() {
        return Riesgos;
    }
    
     public Trabajo RetornandoTrabajador(){
            int Tam = ListaTrabajadores.size();
            Trabajo UnTrabajador = ListaTrabajadores.get(Tam-1);
            return UnTrabajador;
        }
 
    public void medidas_generales_cargar_archivo() {
        FileReader fr = null;
        BufferedReader br = null;
        medidasGenerales.clear();
        try{
            fr = new FileReader("src\\main\\java\\Metodos\\Medidas_generales.txt");
            br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine()) != null){
                if (linea.equals("-Riesgos carpintero")){
                    medidasGenerales.remove(0);
                    break;
                }
                medidasGenerales.add(linea);
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
            } 
            catch (IOException ex) {
                System.out.println("Error cerrando el archivo");
            }
        }
    }
    
    
  
    public boolean RegistrarTrabajador(Trabajo trabajador){
        return ListaTrabajadores.add(trabajador);
    }
   
    public ArrayList<Trabajo> getListaTrabajadores() {
        return ListaTrabajadores;
    }
    
    public boolean validarCedula(int cedula){
        for (int i=0; i < ListaTrabajadores.size(); i++){
            Trabajo trabajador = ListaTrabajadores.get(i);
            if (trabajador.getCedula() == cedula) {
                return true;
            }
        }
        return false;
    }
    
    public boolean Eliminar(int cedula){
        for (int i=0; i < ListaTrabajadores.size(); i++){
            Trabajo trabajador = ListaTrabajadores.get(i);
            if (trabajador.getCedula() == cedula) {
                ListaTrabajadores.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean Modificar(int cedula, String nombreNuevo, int cedulaNueva){
        for (int i=0; i < ListaTrabajadores.size(); i++){
            Trabajo trabajador = ListaTrabajadores.get(i);
            if (trabajador.getCedula() == cedula) {
                trabajador.setNombre(nombreNuevo);
                trabajador.setCedula(cedulaNueva);
                ListaTrabajadores.set(i, trabajador);
                return true;
            }
        }
        return false;
    }
    public Trabajo Consultar(int cedula){
        for (int i=0; i < ListaTrabajadores.size(); i++){
            Trabajo trabajador = ListaTrabajadores.get(i);
            if (trabajador.getCedula() == cedula) {
                return ListaTrabajadores.get(i);              
            }
        }
        return null;
    }
    public int totalTrabajadores(){
        return ListaTrabajadores.size();
    }
}
