/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Omar Madrigal
 */
public class Carpintero extends Trabajo{
    
    private  ArrayList MedidasEspecificasCarpintero = new ArrayList();
    private  ArrayList riesgos_carpintero = new ArrayList();
    
    public Carpintero(String nombre, int cedula, String tipoTrabajo) {
        super(nombre, cedula, tipoTrabajo);
        
        //DARLE LAS MEDIDAS ESPECIFICAS DESDE EL ARCHIVO
    }

    public ArrayList getMedidasEspecificasCarpintero() {
        return MedidasEspecificasCarpintero;
    }

    public void setMedidasEspecificasCarpintero(ArrayList MedidasEspecificasCarpintero) {
        this.MedidasEspecificasCarpintero = MedidasEspecificasCarpintero;
    }

    public ArrayList getRiesgos_carpintero() {
        return riesgos_carpintero;
    }
    

    @Override
    public void medidas_especificas() {
        MedidasEspecificasCarpintero.clear();
        riesgos_carpintero.clear();
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("src\\main\\java\\Metodos\\Medidas_generales.txt");
            br = new BufferedReader(fr);
            String linea;
            boolean condicion = true;
            while((linea = br.readLine()) != null && condicion){
                if (linea.equals("-Riesgos carpintero")){
                    while((linea = br.readLine()) != null && condicion){
                        if (linea.equals("-Medidas especificas carpintero")){
                            while((linea = br.readLine()) != null){
                                if (linea.equals("-Riesgos electricista")){
                                    condicion = false;
                                    break;
                                }
                                MedidasEspecificasCarpintero.add(linea);
                                
                            }
                        }
                        riesgos_carpintero.add(linea);
                    }
                }
            }
            riesgos_carpintero.remove(riesgos_carpintero.size() - 1);
            
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
   }
    
    
    

