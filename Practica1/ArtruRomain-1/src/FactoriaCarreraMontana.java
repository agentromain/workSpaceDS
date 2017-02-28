import java.util.ArrayList;

/**
 * @author romainartru
 *
 */
public class FactoriaCarreraMontana extends FactoriaCarrera{
	public static ArrayList<Bicicleta> crearCM(int n){
    	ArrayList<Bicicleta> participantes = new ArrayList<>();
    	for(int i = 0; i < n; ++i){
    		participantes.add(FactoriaBiciMont.crearBici());
    	}
		return participantes;
	}
}
