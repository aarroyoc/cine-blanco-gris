package main;

import modelo.Cartelera;

/**
 *
 * @author aarroyoc
 */
public class Main {
    public static void main(String[] args){
        Cartelera cartelera = Defecto.CarteleraDefecto();
        new StateMachine(cartelera);

    }
}
