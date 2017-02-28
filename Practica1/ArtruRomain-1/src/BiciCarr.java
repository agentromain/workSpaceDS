
/**
 * @author romainartru
 *
 */
public class BiciCarr extends Bicicleta{
	public BiciCarr(){
		super(TC.CARRETERA);
		cuad = FactoriaCuadroCarretera.crearCuadro();
        man = FactoriaManillarCarretera.crearManillar();
        rued1 = FactoriaRuedasCarretera.crearRuedas();
        rued2 = FactoriaRuedasCarretera.crearRuedas();
	}
}