package vista;

import main.StateMachine;
import modelo.Pelicula;
import java.time.LocalDateTime;


/**
 * @author aarroyoc
 * @author sergalo
 */
public class CompraController {
    private final Compra v;
    private final StateMachine state;
    private final Pelicula pelicula;
    private final LocalDateTime sesion;
    
    /**
     * Se crea el controlador de Compra
     * @param state
     * @param pelicula
     * @param sesion
     * @param v
     */
    public CompraController(StateMachine state, Pelicula pelicula, LocalDateTime sesion,Compra v){
        this.v=v;
        this.state = state;
        this.pelicula = pelicula;
        this.sesion = sesion;
    }
    
    /**
     * Cambia a la ventana detalle
     */
    public void atras(){
        state.goDetails(pelicula);
    }
    
    /**
     * pasa a la ventana pago
     */
    public void siguiente(){
        int precioNormales=v.getSEntradasNormalesValue()*7;
        int precioNinos=v.getSEntradasNinosValue()*5;
        state.goPago(precioNormales+precioNinos);
    }
    
    /**
     * actualiza el precio total de las entradas seleccionadas
     */
    public void updatePrice(){
        int precioNormales=v.getSEntradasNormalesValue()*7;
        int precioNinos=v.getSEntradasNinosValue()*5;
        v.setPrecioTotal((precioNinos+precioNormales)+"€");
        if(precioNormales > 0 || precioNinos > 0){
            v.setNextButton(true);
        }else{
            v.setNextButton(false);
        }
    }
}
