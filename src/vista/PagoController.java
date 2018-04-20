/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.time.LocalDateTime;
import main.StateMachine;

/**
 *
 * @author seralpa
 */
public class PagoController {
    
    private final Pago v;
    private final StateMachine state;
    
    public PagoController(StateMachine state,Pago v){
        this.v=v;
        this.state = state;
    }
    
    public void validarNum(){
        v.setTarjetaFidelizacionON();
    }
    
    public void pasarelaPago(){
        
    }
    
    public void atras(){
        state.goTicketsBack();
    }
}
