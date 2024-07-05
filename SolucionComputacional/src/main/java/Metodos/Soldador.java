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
public class Soldador extends Trabajo{
    
    private  ArrayList MedidasEspecificasSoldador  = new ArrayList();;
    private  ArrayList riesgos_soldador  = new ArrayList();
    
    public Soldador(String nombre, int cedula, String tipoTrabajo) {
        super(nombre, cedula, tipoTrabajo);
        
        //DARLE LAS MEDIDAS ESPECIFICAS DESDE EL ARCHIVO
    }

    public ArrayList getMedidasEspecificasSoldador() {
        return MedidasEspecificasSoldador;
    }

    public ArrayList getRiesgos_soldador() {
        return riesgos_soldador;
    }
 
    @Override
    public void medidas_especificas() {
        MedidasEspecificasSoldador.clear();
        riesgos_soldador.clear();
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("src\\main\\java\\Metodos\\Medidas_generales.txt");
            br = new BufferedReader(fr);
            String linea;
            boolean condicion = true;
            while((linea = br.readLine()) != null && condicion){
                if (linea.equals("-Riesgos soldador")){
                    while((linea = br.readLine()) != null && condicion){
                        if (linea.equals("-Medidas especificas soldador")){
                            while((linea = br.readLine()) != null){
                                MedidasEspecificasSoldador.add(linea);
                            }
                        }
                        riesgos_soldador.add(linea);
                    }
                }
            }
            riesgos_soldador.remove(riesgos_soldador.size() - 1);
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
