/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.*;
import main.StateMachine;
import java.time.LocalDateTime;

/**
 *
 * @author aarroyoc
 */
public class DetalleController {
    
    private final StateMachine state;
    private final Pelicula pelicula;
    private final Detalle detalle;
    
    public DetalleController(StateMachine state, Pelicula pelicula, Detalle detalle){
        this.state = state;
        this.pelicula = pelicula;
        this.detalle = detalle;
    }
    
    public void goBack(){
        state.goCartelera();
    }
    
    public void goTickets(LocalDateTime sesion){
        state.goTickets(sesion);
    }
}
