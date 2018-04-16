package main;

import modelo.Cartelera;

/**
 * Punto de entrada de la aplicación CINE BLANCO Y GRIS
 * @author aarroyoc, sergalo
 */
public class Main {
    
    /**
     * Punto de entrada de la aplicación
     * La aplicación soporta diversos estados iniciales
     * Estados iniciales:
     * -defecto o sin argumentos (Defecto)
     * -chaplin (Solo películas de Chaplin)
     * @param args 
     */
    public static void main(String[] args){
        Cartelera cartelera = null;
        if(args.length > 0){
            switch(args[0]){
                case "-defecto" : cartelera = Defecto.CarteleraDefecto();break;
                case "-chaplin" : cartelera = Defecto.CarteleraChaplin();break;
            }
        }else{
            cartelera = Defecto.CarteleraDefecto();
        }
        new StateMachine(cartelera);

    }
}
