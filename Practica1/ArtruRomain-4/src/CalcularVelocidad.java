/**
 * @author romainartru
 *
 */
public class CalcularVelocidad implements Filtro{

    /**
     * 
     */
    public CalcularVelocidad() {
        // TODO Auto-generated constructor stub
    }

    public double ejecutar(Object o) { 
        double rpm= (double) o;
        double velocidad= Math.PI*DemoInterceptor.diametreRoue*rpm*Math.pow(10, 5);
        DemoInterceptor.velocidad = velocidad;
        return velocidad; 
    }
    
    public String toString(){
        return "Nueva velocidad (m/s) : "+DemoInterceptor.velocidad;
    }
}