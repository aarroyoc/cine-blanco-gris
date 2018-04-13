/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Cartelera;
import main.StateMachine;

/**
 *
 * @author aarroyoc
 */
public class InicioController {
    private final Cartelera cartelera;
    private final Inicio vista;
    private final StateMachine state;
    
    public InicioController(StateMachine state,Cartelera cartelera,Inicio inicio){
        this.vista = inicio;
        this.cartelera = cartelera;
        this.state = state;
    }
    
    public void goDetail(){
        state.verDetalles(null);
    }
}