/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author seralpa
 */
public class PagoController {
    
    private final Pago v;
    public PagoController(Pago v){
        this.v=v;
    }
    
    public void validarNum(){
        v.setTarjetaFidelizacionON();
    }
    
    public void pasarelaPago(){
        
    }
}
