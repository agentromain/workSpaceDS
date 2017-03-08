/**
 * @author romainartru
 *
 */
public class CalcularVelocidad implements Filtro{

	/**
	 * 
	 */
	public CalcularVelocidad() {
	}

	public double ejecutar(Object o) { 
		double rpm = (double) o;
		double angulVelo = (2*Math.PI*(double)rpm/60);
		double velocidad = angulVelo*DemoInterceptor.diametreRoue/100;
		DemoInterceptor.velocidad = velocidad;
		return velocidad; 
	}

	public String toString(){
		return "Nueva velocidad (m/s) : "+String.format("%.2f", DemoInterceptor.velocidad);
	}
}