/**
 * 
 */

/**
 * @author romainartru
 *
 */
public class CalcularDistancia implements Filtro{

    /**
     * 
     */
    public CalcularDistancia() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public double ejecutar(Object o) {
        double rpm = (double) o;
        double velocidad = Math.PI*DemoInterceptor.diametreRoue*rpm*Math.pow(10, 5);
        DemoInterceptor.velocidad = velocidad;
        double dist = DemoInterceptor.velocidad*(PanelBotones.d.getTime()-PanelBotones.startTime);
        DemoInterceptor.distancia = dist;
        return dist;
    }

    public String toString(){
        return "Nueva distancia (m) : "+DemoInterceptor.distancia;
    }
}
