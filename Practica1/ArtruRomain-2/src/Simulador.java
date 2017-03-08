//import java.util.ArrayList;
import java.util.Random;

public class Simulador extends Observable implements Runnable {
	private int tempActual;
	//private ArrayList<Integer> temperaturas;
	private int refrTime;
	
	public Simulador() {
		// TODO Auto-generated constructor stub
		super();
		//temperaturas = new ArrayList<>();
		refrTime = 500;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random r= new Random(System.currentTimeMillis());
		int milesimas = 0;
		while (true){
			try {
				Thread.sleep(5);
			    milesimas += 5;
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(milesimas%refrTime == 0){
	    		//actualizaTemperaturaMinMax();
	    		notificarObsrevadores(tempActual);
	    	}
		  tempActual= r.nextInt();

		  try {Thread.sleep(60);}
		  catch(java.lang.InterruptedException e){
		    e.printStackTrace();
		  }
		}
	}
	
	public int getTemperaturaActual(){
		return tempActual;
	}
}