/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import main.StateMachine;
/**
 *
 * @author seralpa
 */
public class GraciasController {
    
    private final Gracias v;
    private final StateMachine state;
    public GraciasController(Gracias v,StateMachine state){
        this.v=v;
        this.state=state;
    }
    
    public void atras(){
        state.goCartelera();
    }
}
