/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalTime;
import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author aarroyoc
 */
public class Pelicula {
    private final PeliculaInfo info;
    private List<LocalTime> sesiones;
    
    public Pelicula(PeliculaInfo info){
        this.info = info;
        this.sesiones = new LinkedList();
    }
    
    public void addSesion(LocalTime sesion){
        this.sesiones.add(sesion);
    }
    
    public void removeSesion(LocalTime sesion){
        this.sesiones.remove(sesion);
    }
    
    public List<LocalTime> getSesiones(){
        return this.sesiones;
    }
    
    public PeliculaInfo getInfo(){
        return this.info;
    }
    
}
