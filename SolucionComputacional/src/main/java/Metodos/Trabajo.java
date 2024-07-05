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
import java.time.LocalTime;
import java.util.ArrayList;


/**
 *
 * @author Omar Madrigal
 */
public abstract class Trabajo {
    protected String nombre;
    protected int cedula;
    protected String tipoTrabajo;
    protected String TipoSeguridad;
    protected ArrayList MedidasGeneralesTrabajos = new ArrayList();
    protected LocalTime Horallegada;
    
    
    public Trabajo(String nombre, int cedula, String tipoTrabajo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.tipoTrabajo = tipoTrabajo;
        //LEER ARCHIVO PARA MANDARLE LAS MEDIDAS GENERALES DEL ARCHIVO DESDE EL CONSTRUCTOR
        //this.medidasGenerales = medidasGenerales;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoSeguridad() {
        return TipoSeguridad;
    }

    public void setTipoSeguridad(String TipoSeguridad) {
        this.TipoSeguridad = TipoSeguridad;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public ArrayList getMedidasGeneralesTrabajos() {
        return MedidasGeneralesTrabajos;
    }

    public void setMedidasGeneralesTrabajos(ArrayList MedidasGeneralesTrabajos) {
        this.MedidasGeneralesTrabajos = MedidasGeneralesTrabajos;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public LocalTime getHorallegada() {
        return Horallegada;
    }

    public void setHorallegada(LocalTime Horallegada) {
        this.Horallegada = Horallegada;
    }

 
    public abstract void medidas_especificas();
    
}
