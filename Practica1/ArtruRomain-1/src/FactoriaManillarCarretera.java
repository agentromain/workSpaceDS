/**
 * 
 */

/**
 * @author romainartru
 *
 */
public class FactoriaManillarCarretera implements FactoriaManillar {
    public static Manillar<TC> crearManillar(){
        return new Manillar<TC>(TC.CARRETERA);
    }
}
