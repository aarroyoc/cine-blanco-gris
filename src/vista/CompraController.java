package vista;

import main.StateMachine;
import modelo.Pelicula;
import java.time.LocalDateTime;


/**
 *
 * @author seralpa
 */
public class CompraController {
    private final Compra v;
    private final StateMachine state;
    private final Pelicula pelicula;
    private final LocalDateTime sesion;
    
    public CompraController(StateMachine state, Pelicula pelicula, LocalDateTime sesion,Compra v){
        this.v=v;
        this.state = state;
        this.pelicula = pelicula;
        this.sesion = sesion;
    }
    
    public void atras(){
        state.goDetails(pelicula);
    }
    
    public void siguiente(){
        int precioNormales=v.getSEntradasNormalesValue()*7;
        int precioNinos=v.getSEntradasNinosValue()*5;
        state.goPago(precioNormales+precioNinos);
    }
    
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
