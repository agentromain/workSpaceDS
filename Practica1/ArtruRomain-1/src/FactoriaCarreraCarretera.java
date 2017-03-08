import java.util.ArrayList;

/**
 * @author romainartru
 *
 */
public class FactoriaCarreraCarretera implements Carrera{

	public static ArrayList<Bicicleta> crearCC(int n){
		ArrayList<Bicicleta> participantes = new ArrayList<>();
		for(int i = 0; i < n; ++i){
			participantes.add(FactoriaBiciCarr.crearBici());
		}
		return participantes;
	}
}