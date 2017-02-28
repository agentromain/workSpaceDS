/**
 * 
 */

/**
 * @author romainartru
 *
 */

public class DemoInterceptor {

    public static int diametreRoue;
    public static double velocidad;
    public static double rpm;
    public static double distancia;
    public static Cliente cliente;
    
    /**
     * @param
     * @return
     */
    public static void main(String[] args) {
        GestorFiltros gestorFiltros = new GestorFiltros(new Interfaz());
        gestorFiltros.setFiltro(new CalcularDistancia()); 
        gestorFiltros.setFiltro(new CalcularVelocidad()); 
        cliente = new Cliente();
        cliente.setGestorFiltros(gestorFiltros); 
        cliente.enviarPeticion(0);//numero inicial de vueltas del eje (tour par seconde)
        }

}
