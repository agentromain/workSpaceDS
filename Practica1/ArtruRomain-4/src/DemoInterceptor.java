/**
 * 
 */

/**
 * @author romainartru
 *
 */

public class DemoInterceptor {

	public static int diametreRoue;
	public static double initTime;
	public static double velocidad;
	public static double rpm;
	public static double distancia;
	public static Cliente cliente;

	/**
	 * @param
	 * @return
	 */
	public static void main(String[] args) {
		diametreRoue = 60;
		initTime = System.currentTimeMillis()/1000;
		cliente = new Cliente();
		GestorFiltros gestorFiltros = new GestorFiltros(new Interfaz(cliente));
		gestorFiltros.setFiltro(new CalcularVelocidad()); 
		gestorFiltros.setFiltro(new CalcularDistancia()); 
		cliente.setGestorFiltros(gestorFiltros); 

		cliente.enviarPeticion(100);//numero inicial de vueltas del eje (tour par seconde)
	}

}
