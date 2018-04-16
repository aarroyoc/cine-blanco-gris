
package modelo;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Modelo de la información de la Película
 * @author aarroyoc
 */
public class PeliculaInfo {
    private final String nombre;
    private final String sinopsis;
    private final String director;
    
    private final int anno;
    
    private final Icon poster;
    
    /**
     * Constructor del modelo
     * @param nombre Nombre de la película
     * @param sinopsis Sinopsis de la película
     * @param director Director de la película
     * @param anno Año de salida de la película
     * @param ruta Ruta al archivo del poster
     */
    public PeliculaInfo(String nombre, String sinopsis, String director, int anno, String ruta){
        this.nombre = nombre;
        this.sinopsis = sinopsis;
        this.director = director;
        this.anno = anno;
        
        this.poster = new ImageIcon(getClass().getResource("/media/"+ruta));
    }
    
    /**
     * 
     * @return El nombre de la película
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * 
     * @return La sinopsis de la película
     */
    public String getSinopsis(){
        return this.sinopsis;
    }
    
    /**
     * 
     * @return el director de la película
     */
    public String getDirector(){
        return this.director;
    }
    
    /**
     * 
     * @return el año de la película
     */
    public int getAnno(){
        return this.anno;
    }
    
    /**
     * 
     * @return el poster de la película
     */
    public Icon getPoster(){
        return this.poster;
    }
}
