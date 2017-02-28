import java.util.ArrayList;

public abstract class FactoriaCarrera implements Carrera{
	public ArrayList<Bicicleta> crearCarrera(TC tipo, int n){
		switch(tipo){
		case CARRETERA:
			return FactoriaCarreraCarretera.crearCC(n);
		case MONTANA:
			return FactoriaCarreraMontana.crearCM(n);
		}
	    return null;
	}
}
