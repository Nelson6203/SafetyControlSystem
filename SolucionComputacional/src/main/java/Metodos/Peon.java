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
public class Peon extends Trabajo{
    
   private  ArrayList MedidasEspecificasPeon = new ArrayList();;
   private  ArrayList riesgos_peon = new ArrayList();
    
    public Peon(String nombre, int cedula, String tipoTrabajo) {
        super(nombre, cedula, tipoTrabajo);
        
        //DARLE LAS MEDIDAS ESPECIFICAS DESDE EL ARCHIVO
    }

    public ArrayList getMedidasEspecificasPeon() {
        return MedidasEspecificasPeon;
    }

    public ArrayList getRiesgos_peon() {
        return riesgos_peon;
    }
    

    @Override
    public void medidas_especificas() {
        MedidasEspecificasPeon.clear();
        riesgos_peon.clear();
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("src\\main\\java\\Metodos\\Medidas_generales.txt");
            br = new BufferedReader(fr);
            String linea;
            boolean condicion = true;
            while((linea = br.readLine()) != null && condicion){
                if (linea.equals("-Riesgos peon")){
                    while((linea = br.readLine()) != null && condicion){
                        if (linea.equals("-Medidas especificas peon")){
                            while((linea = br.readLine()) != null){
                                if (linea.equals("-Riesgos operador maquinaria")){
                                    condicion = false;
                                    break;
                                }
                                MedidasEspecificasPeon.add(linea);
                            }
                        }
                        riesgos_peon.add(linea);
                    }
                }
            }
            riesgos_peon.remove(riesgos_peon.size() - 1);
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
