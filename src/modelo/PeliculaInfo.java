/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author aarroyoc
 */
public class PeliculaInfo {
    private final String nombre;
    private final String descripcion;
    private final String director;
    
    private final int anno;
    
    private final Icon poster;
    
    public PeliculaInfo(String nombre, String descripcion, String director, int anno, String ruta){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.director = director;
        this.anno = anno;
        
        this.poster = new ImageIcon(getClass().getResource("/media/"+ruta));
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    public int getAnno(){
        return this.anno;
    }
    
    
    public Icon getPoster(){
        return this.poster;
    }
}
