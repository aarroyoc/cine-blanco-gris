/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.*;
import main.StateMachine;

/**
 * @author sergalo
 * @author aarroyoc
 */
public class InicioController {
    private final Cartelera cartelera;
    private final Inicio vista;
    private final StateMachine state;
    
    /**
     * Se crea el controlador de Inicio
     * @param state
     * @param cartelera
     * @param inicio
     */
    public InicioController(StateMachine state,Cartelera cartelera,Inicio inicio){
        this.vista = inicio;
        this.cartelera = cartelera;
        this.state = state;
    }
    
    /**
     * Va a la ventana Detalle
     * @param pelicula
     */
    public void goDetail(Pelicula pelicula){
        state.goDetails(pelicula);
    }
}