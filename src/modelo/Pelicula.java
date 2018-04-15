/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author aarroyoc
 */
public class Pelicula {
    private final PeliculaInfo info;
    private Map<LocalDate,List<LocalTime>> sesiones;
    
    public Pelicula(PeliculaInfo info){
        this.info = info;
        this.sesiones = new TreeMap();
    }
    
    public void addSesion(LocalDateTime sesion){
        LocalDate date = sesion.toLocalDate();
        LocalTime time = sesion.toLocalTime();
        if(this.sesiones.containsKey(date)){
            this.sesiones.get(date).add(time);
        }else{
            LinkedList<LocalTime> list = new LinkedList();
            list.add(time);
            this.sesiones.put(date, list);
        }
    }
    
    public void removeSesion(LocalDateTime sesion){
        this.sesiones.remove(sesion.toLocalDate());
    }
    
    public Map<LocalDate,List<LocalTime>> getSesiones(){
        return this.sesiones;
    }
    
    public PeliculaInfo getInfo(){
        return this.info;
    }
    
}
