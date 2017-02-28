/**
 * 
 */

/**
 * @author romainartru
 *
 */
public class FactoriaRuedasMontana implements FactoriaRuedas {
    public static Ruedas<TC> crearRuedas(){
        return new Ruedas<TC>(TC.MONTANA);
    }
}