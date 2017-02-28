/**
 * 
 */

/**
 * @author romainartru
 *
 */
public class FactoriaManillarMontana implements FactoriaManillar {
    public static Manillar<TC> crearManillar(){
        return new Manillar<TC>(TC.MONTANA);
    }
}