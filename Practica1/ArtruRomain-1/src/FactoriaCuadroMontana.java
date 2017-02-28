/**
 * 
 */

/**
 * @author romainartru
 *
 */
public class FactoriaCuadroMontana implements FactoriaCuadro {
    public static Cuadro<TC> crearCuadro(){
        return new Cuadro<TC>(TC.MONTANA);
    }
}