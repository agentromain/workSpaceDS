/**
 * 
 */

/**
 * @author romainartru
 *
 */
public class Cliente {

	private GestorFiltros gF;
	/**
	 * 
	 */
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public void setGestorFiltros(GestorFiltros g){
		gF = g;
	}

	public void enviarPeticion(double p){
		gF.peticionFiltro(p);
	}
}
