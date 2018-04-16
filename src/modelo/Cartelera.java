package modelo;

import java.util.LinkedList;
import java.util.List;

/**
 * Modelo de Cartelera. Películas que se pueden ir a ver al cine
 * @author aarroyoc, sergalo
 */
public class Cartelera {
    private final List<Pelicula> peliculas;
    
    /**
     * Constructor del modelo
     */
    public Cartelera(){
        this.peliculas = new LinkedList();
    }
    
    /**
     * Añade una película nueva a la cartelera
     * @param pelicula 
     */
    public void addPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }
    
    /**
     * Quita una película de la cartelera
     * @param pelicula 
     */
    public void removePelicula(Pelicula pelicula){
        this.peliculas.remove(pelicula);
    }
    
    /**
     * Obtiene un listado con todas las películas en cartelea
     * @return lista de películas actualmente en cartelera
     */
    public List<Pelicula> getPeliculas(){
        return this.peliculas;
    }
}
