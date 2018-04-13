package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import modelo.Cartelera;
import modelo.PeliculaInfo;
import modelo.Pelicula;

import java.time.LocalTime;

/**
 * Valores por defecto del modelo
 * @author aarroyoc
 */
public class Defecto {
    public static Cartelera CarteleraDefecto(){
        Cartelera cartelera = new Cartelera();
        
        Pelicula pelicula;
        PeliculaInfo info;
        
        /* Bienvenido Mr. Marshall */
        info = new PeliculaInfo(
                "Bienvenido Mr. Marshall",
                "Años 50. Villar del Río es un pequeño y tranquilo pueblo en el que nunca pasa nada. Sin embargo, el mismo día en que llegan la cantante folclórica Carmen Vargas y su representante, el alcalde (Pepe Isbert) recibe la noticia de la inminente visita de un comité del Plan Marshall (proyecto económico americano para la reconstrucción de Europa). La novedad provoca un gran revuelo entre la gente, que se dispone a ofrecer a los americanos un recibimiento muy especial.",
                "Luis García Berlanga",
                1953,
                "BienvenidoMrMarshall.jpg");
        pelicula = new Pelicula(info);
        pelicula.addSesion(LocalTime.of(19,30));
        pelicula.addSesion(LocalTime.of(22,30));
        cartelera.addPelicula(pelicula);
        
        /* Casablanca */
        
        info = new PeliculaInfo(
                "Casablanca",
                "Años 40. A consecuencia de la Segunda Guerra Mundial, Casablanca era una ciudad a la que llegaban huyendo del nazismo gente de todas partes: llegar era fácil, pero salir era casi imposible, especialmente si el nombre del fugitivo figuraba en las listas de la Gestapo, que presionaba a la autoridades francesas al mando del corrupto inspector Renault. En este caso, el objetivo de la policía secreta alemana es el líder checo y héroe de la resistencia Victor Laszlo, cuya única esperanza es Rick Blaine, propietario del 'Rick’s Café' y antiguo amante de su mujer, Ilsa Lund. Rick e Ilsa se habían conocido en París, pero la entrada de las tropas alemanas en la capital francesa les separó.",
                "Michael Curtiz",
                1942,
                "Casablanca.jpg");
        pelicula = new Pelicula(info);
        pelicula.addSesion(LocalTime.of(19,30));
        pelicula.addSesion(LocalTime.of(22,30));
        cartelera.addPelicula(pelicula);
        
        /* Ciudadano Kane */
        
        info = new PeliculaInfo(
                "Ciudadano Kane",
                "Un importante magnate estadounidense, Charles Foster Kane, dueño de una importante cadena de periódicos, de una red de emisoras, de dos sindicatos y de una inimaginable colección de obras de arte, muere en Xanadú, su fabuloso castillo de estilo oriental. La última palabra que pronuncia antes de expirar, ”Rosebud”, cuyo significado es un enigma, despierta una enorme curiosidad tanto en la prensa como entre la población. Así, un grupo de periodistas emprende una investigación para desentrañar el misterio.",
                "Orson Welles",
                1941,
                "CiudadanoKane.jpg");
        pelicula = new Pelicula(info);
        pelicula.addSesion(LocalTime.of(19,30));
        pelicula.addSesion(LocalTime.of(22,30));
        cartelera.addPelicula(pelicula);
        
        /* Dr Strange */
        
        info = new PeliculaInfo(
                "¿Teléfono rojo?",
                "Convencido de que los comunistas están contaminando los Estados Unidos, un general ordena, en un acceso de locura, un ataque aéreo nuclear sorpresa contra la Unión Soviética. Su ayudante, el capitán Mandrake, trata de encontrar la fórmula para impedir el bombardeo. Por su parte, el Presidente de los EE.UU. se pone en contacto con Moscú para convencer al gobierno soviético de que el ataque no es más que un estúpido error. Mientras tanto, el asesor del Presidente, un antiguo científico nazi, el doctor Strangelove, confirma la existencia de la “Máquina del Juicio Final”, un dispositivo de represalia soviético capaz de acabar con la humanidad para siempre.",
                "Stanley Kubrick",
                1964,
                "DrStrange.jpg");
        pelicula = new Pelicula(info);
        pelicula.addSesion(LocalTime.of(20,30));
        cartelera.addPelicula(pelicula);
        
        /* El Gran Dictador */
        
        info = new PeliculaInfo(
                "El Gran Dictador",
                "Un humilde barbero judío que combatió con el ejército de Tomania en la primera guerra mundial vuelve a su casa años después del fin del conflicto. Amnèsico a causa de un accidente de avión, no recuerda prácticamente nada de su vida pasada, y no conoce la situación política actual del país: Adenoid Hynkel, un dictador fascista y racista, ha llegado al poder y ha iniciado la persecución del pueblo judío, a quien considera responsable de la situación de crisis que vive el país. Paralelamente, Hynkel y sus colaboradores han empezado a preparar una ofensiva militar destinada a la conquista de todo el mundo.",
                "Charles Chaplin",
                1940,
                "ElGranDictador.jpg");
        pelicula = new Pelicula(info);
        pelicula.addSesion(LocalTime.of(22,30));
        cartelera.addPelicula(pelicula);
        
        /* Que Bello es Vivir */
        
        info = new PeliculaInfo(
                "Qué bello es vivir",
                "George Bailey (James Stewart) es un honrado y modesto ciudadano que dirige y mantiene a flote un pequeño banco familiar, a pesar de los intentos de un poderoso banquero por arruinarlo. El dia de Nochebuena de 1945, abrumado por la repentina desaparición de una importante suma de dinero, que supondría no solo la quiebra de su banco, sino también un gran escándalo, decide suicidarse, pero cuando está a punto de hacerlo ocurre algo extraordinario.",
                "Frank Capra",
                1940,
                "QueBelloEsVivir.jpg");
        pelicula = new Pelicula(info);
        pelicula.addSesion(LocalTime.of(18,30));
        pelicula.addSesion(LocalTime.of(21,30));
        cartelera.addPelicula(pelicula);
        
        /* Sopa de ganso */
        
        info = new PeliculaInfo(
                "Sopa de Ganso",
                "La República Democrática de Freedonia, un pequeño país centroeuropeo, a cuyo frente se encuentra el muy liberal señor Rufus T. Firefly, se ve amenazada por la dictadura de Sylvania, país de vieja y reconocida solvencia como agresor. Dos espías de prestigio, Chicolini y Pinky, sirven a Sylvania, lo que no impide que acaben siendo ministros del ahora ya excelentísimo Firefly.",
                "Leo McCarey",
                1933,
                "SopaDeGanso.jpg");
        pelicula = new Pelicula(info);
        pelicula.addSesion(LocalTime.of(18,00));
        pelicula.addSesion(LocalTime.of(22,00));
        cartelera.addPelicula(pelicula);
        
        /* La Dolce Vita */
        
        info = new PeliculaInfo(
                "La Dolce Vita",
                "La República Democrática de Freedonia, un pequeño país centroeuropeo, a cuyo frente se encuentra el muy liberal señor Rufus T. Firefly, se ve amenazada por la dictadura de Sylvania, país de vieja y reconocida solvencia como agresor. Dos espías de prestigio, Chicolini y Pinky, sirven a Sylvania, lo que no impide que acaben siendo ministros del ahora ya excelentísimo Firefly.",
                "Federico Fellini",
                1960,
                "LaDolceVita.jpg");
        pelicula = new Pelicula(info);
        pelicula.addSesion(LocalTime.of(20,00));
        cartelera.addPelicula(pelicula);
        
        /* Matar a un ruiseñor */
        
        info = new PeliculaInfo(
                "Matar a un ruiseñor",
                "Adaptación de la novela homónima de Harper Lee. En la época de la Gran Depresión, en una población sureña, Atticus Finch (Gregory Peck) es un abogado que defiende a un hombre negro acusado de haber violado a una mujer blanca. Aunque la inocencia del hombre resulta evidente, el veredicto del jurado es tan previsible que ningún abogado aceptaría el caso, excepto Atticus Finch, el ciudadano más respetable de la ciudad. Su compasiva y valiente defensa de un inocente le granjea enemistades, pero le otorga el respeto y la admiración de sus dos hijos, huérfanos de madre.",
                "Robert Mulligan",
                1962,
                "MatarAUnRuiseñor.jpg");
        pelicula = new Pelicula(info);
        pelicula.addSesion(LocalTime.of(18,45));
        pelicula.addSesion(LocalTime.of(21,30));
        cartelera.addPelicula(pelicula);
        
        /* Psycho */
        
        info = new PeliculaInfo(
                "Psicosis",
                "Marion Crane, una joven secretaria, tras cometer el robo de un dinero en su empresa, huye de la ciudad y, después de conducir durante horas, decide descansar en un pequeño y apartado motel de carretera regentado por un tímido joven llamado Norman Bates, que vive en la casa de al lado con su madre. ",
                "Alfred Hitchcock",
                1960,
                "Psycho.jpg");
        pelicula = new Pelicula(info);
        pelicula.addSesion(LocalTime.of(18,45));
        pelicula.addSesion(LocalTime.of(21,30));
        cartelera.addPelicula(pelicula);

        
        return cartelera;
    }
}
