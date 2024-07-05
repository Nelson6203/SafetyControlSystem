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
public class Electricista extends Trabajo{
    
    private  ArrayList MedidasEspecificasElectricista = new ArrayList();
    private  ArrayList riesgos_electricista = new ArrayList();;

    public Electricista(String nombre, int cedula, String tipoTrabajo) {
        super(nombre, cedula, tipoTrabajo);
        
        //DARLE LAS MEDIDAS ESPECIFICAS DESDE EL ARCHIVO
    }

    public ArrayList getMedidasEspecificasElectricista() {
        return MedidasEspecificasElectricista;
    }

    public ArrayList getRiesgos_electricista() {
        return riesgos_electricista;
    }
    

    @Override
    public void medidas_especificas() {
        MedidasEspecificasElectricista.clear();
        riesgos_electricista.clear();
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("src\\main\\java\\Metodos\\Medidas_generales.txt");
            br = new BufferedReader(fr);
            String linea;
            boolean condicion = true;
            while((linea = br.readLine()) != null && condicion){
                if (linea.equals("-Riesgos electricista")){
                    while((linea = br.readLine()) != null && condicion){
                        if (linea.equals("-Medidas especificas electricista")){
                            while((linea = br.readLine()) != null){
                                if (linea.equals("-Riesgos peon")){
                                    condicion = false;
                                    break;
                                }
                                MedidasEspecificasElectricista.add(linea);
                            }
                        }
                        riesgos_electricista.add(linea);
                    }
                }
            }
            riesgos_electricista.remove(riesgos_electricista.size() - 1);
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
