import java.util.ArrayList;

/**
 * @author romainartru
 *
 */
public interface Carrera {
	public static ArrayList<Bicicleta> crearCarrera(TC tipo, int n){
		switch(tipo){
		case CARRETERA:
			return FactoriaCarreraCarretera.crearCC(n);
		case MONTANA:
			return FactoriaCarreraMontana.crearCM(n);
		}
	    return null;
	}
}
