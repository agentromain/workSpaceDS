/**
 * 
 */

/**
 * @author romainartru
 *
 */
public class FactoriaCuadroCarretera implements FactoriaCuadro {
    public static Cuadro<TC> crearCuadro(){
        return new Cuadro<TC>(TC.CARRETERA);
    }
}
