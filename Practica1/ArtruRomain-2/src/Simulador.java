import java.util.ArrayList;
import java.util.Random;

public class Simulador extends Observable implements Runnable {
	private ObservablePantalla oP;
	private int tempActual;
	private ArrayList<Integer> temperaturas;
	
	public Simulador(Pantalla p) {
		// TODO Auto-generated constructor stub
		super();
		oP = new ObservablePantalla(p);
		temperaturas = new ArrayList<>();
		
		this.incluirObservador(new BotonCambio());
		this.incluirObservador(new GraficaTemperatura());
		this.incluirObservador(new Pantalla());
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random r= new Random(System.currentTimeMillis());
		
		while (true){

		  tempActual= r.nextInt();

		  try {Thread.sleep(60);}
		  catch(java.lang.InterruptedException e){
		    e.printStackTrace();
		  }

		  oP.notificarObsrevadores(tempActual);
		}
	}
}
