import java.util.ArrayList;

/**
 * 
 */

/**
 * @author romainartru
 *
 */
public class CadenaFiltros {

	private ArrayList<Filtro> filtros;
	private Interfaz objetivo;

	/**
	 * 
	 */
	public CadenaFiltros() {
		filtros = new ArrayList<Filtro>();
	}

	public void ejecutar(double peticion){ 
		System.out.println("Para un numero de vueltas iniciales del eje = "+peticion);

		for(Filtro filt : filtros){
			filt.ejecutar(peticion);
			System.out.println(filt);
		}
		objetivo.ejecutar(peticion);
	}

	public void setObjetivo(Interfaz obj){ 
		objetivo = obj;
	}

	public void addFiltro(Filtro f){
		filtros.add(f);
	}
}
