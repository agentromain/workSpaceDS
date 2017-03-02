public class ObservablePantalla extends Observable {
	public static Pantalla panta;
	
	public ObservablePantalla(Pantalla p) {
		// TODO Auto-generated constructor stub
		panta = p;
		this.incluirObservador(new BotonCambio());
		this.incluirObservador(new GraficaTemperatura());
	}

}
