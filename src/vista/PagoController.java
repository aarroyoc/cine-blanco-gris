/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.time.LocalDateTime;
import main.StateMachine;

/**
 * @author aarroyoc
 * @author sergalo
 */
public class PagoController {
    
    private final Pago v;
    private final StateMachine state;
    
    /**
     * Se crea el controlador de Pago
     * @param state
     * @param v
     */
    public PagoController(StateMachine state,Pago v){
        this.v=v;
        this.state = state;
    }
    
    /**
     * Valida el numero de la tarjeta de fidelizacion y si es correcto activa la
     * opcion de pagar con tarjeta de fidelizacion
     */
    public void validarNum(){
        v.setTarjetaFidelizacionButton(true);
    }
    
    /**
     * Va a la ventana Gracias
     */
    public void pasarelaPago(){
        state.goThanks();
    }
    
    /**
     * Va a la ventana Compra
     */
    public void atras(){
        state.goTicketsBack();
    }
}
