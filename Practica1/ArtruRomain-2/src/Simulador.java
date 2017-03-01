import java.util.Observable;
import java.util.Random;

public class Simulador extends Observable implements Runnable {
	ObservablePantalla oP;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random r= new Random(System.currentTimeMillis());
		int temperatura;

		while (true){

		  temperatura= r.nextInt();

		  try {Thread.sleep(60);}
		  catch(java.lang.InterruptedException e){
		    e.printStackTrace();
		  }

		  oP.notifyObservers(temperatura);

		}
	}
}
