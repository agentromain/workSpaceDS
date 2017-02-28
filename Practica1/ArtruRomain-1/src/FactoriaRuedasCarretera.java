/**
 * 
 */

/**
 * @author romainartru
 *
 */
public class FactoriaRuedasCarretera implements FactoriaRuedas {
    public static Ruedas<TC> crearRuedas(){
        return new Ruedas<TC>(TC.CARRETERA);
    }
}
