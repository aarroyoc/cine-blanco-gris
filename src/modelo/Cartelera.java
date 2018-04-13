/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author aarroyoc
 */
public class Cartelera {
    private final List<Pelicula> peliculas;
    
    public Cartelera(){
        this.peliculas = new LinkedList();
    }
    
    public void addPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }
    
    public void removePelicula(Pelicula pelicula){
        this.peliculas.remove(pelicula);
    }
    
    public List<Pelicula> getPeliculas(){
        return this.peliculas;
    }
}
