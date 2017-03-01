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
        double angulVelo = (2*Math.PI*(double)rpm/60);
        double velocidad = angulVelo*DemoInterceptor.diametreRoue/100;
        DemoInterceptor.velocidad = velocidad;
        double dist = DemoInterceptor.velocidad*((System.currentTimeMillis()/1000)-DemoInterceptor.initTime);
        DemoInterceptor.distancia = dist;
        return dist;
    }

    public String toString(){
        return "Nueva distancia (m) : "+String.format("%.2f", DemoInterceptor.distancia);
    }
}
