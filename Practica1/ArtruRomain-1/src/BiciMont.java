
/**
 * @author romainartru
 *
 */
public class BiciMont extends Bicicleta{
	public BiciMont(){
		super(TC.MONTANA);
		cuad = FactoriaCuadroMontana.crearCuadro();
		man = FactoriaManillarMontana.crearManillar();
		rued1 = FactoriaRuedasMontana.crearRuedas();
		rued2 = FactoriaRuedasMontana.crearRuedas();
	}
}