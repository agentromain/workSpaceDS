public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simulador sim = new Simulador();
		GraficaTemperatura gra = new GraficaTemperatura();
		BotonCambio bot = new BotonCambio(sim);
		sim.incluirObservador(gra);
		sim.incluirObservador(bot);
		Pantalla p = new Pantalla(bot, sim);
		sim.incluirObservador(p);
		
		Thread t = new Thread(sim);
		t.start();
	}

}
