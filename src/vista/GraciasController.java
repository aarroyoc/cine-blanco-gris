/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import main.StateMachine;
/**
 * @author aarroyoc
 * @author sergalo
 */
public class GraciasController {
    
    private final Gracias v;
    private final StateMachine state;

    /**
     * Se crea el controlador de Gracias
     * @param v
     * @param state
     */
    public GraciasController(Gracias v,StateMachine state){
        this.v=v;
        this.state=state;
    }
    
    /**
     * Pasa a la ventana Cartelera
     */
    public void atras(){
        state.goCartelera();
    }
}
