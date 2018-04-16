package modelo;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Modelo de Película. Contiene información sobre la película y un listado de sesiones donde
 * se va a proyectar
 * @author aarroyoc, sergalo
 */
public class Pelicula {
    private final PeliculaInfo info;
    private Map<LocalDate,List<LocalTime>> sesiones;
    
    /**
     * Constructor de Película
     * @param info 
     */
    public Pelicula(PeliculaInfo info){
        this.info = info;
        this.sesiones = new TreeMap();
    }
    
    /**
     * Añade una sesión de proyección a la fecha y hora especificadas
     * @param sesion 
     */
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
    
    /**
     * Elimina una sesión de proyección
     * @param sesion 
     */
    public void removeSesion(LocalDateTime sesion){
        this.sesiones.remove(sesion.toLocalDate());
    }
    
    /**
     * Obtiene un listado de proyecciones, agrupadas por fecha
     * @return un mapa para acceder a una lista de sesiones en cada fecha
     */
    public Map<LocalDate,List<LocalTime>> getSesiones(){
        return this.sesiones;
    }
    
    /**
     * Obtiene los datos técnicos de la película
     * @return la informacion de la pelicula
     */
    public PeliculaInfo getInfo(){
        return this.info;
    }
    
}
