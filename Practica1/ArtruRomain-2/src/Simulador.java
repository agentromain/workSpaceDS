import java.util.Random;

public class Simulador extends Observable implements Runnable {
	private int tempActual, lastTemp;
	private int refrTime;

	public Simulador() {
		// TODO Auto-generated constructor stub
		super();
		refrTime = 100;
		lastTemp = 0;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random r= new Random(System.currentTimeMillis());
		int milesimas = 0;
		int m, M;
		while (true){
			try {
				Thread.sleep(5);
				milesimas += 5;
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(milesimas%refrTime == 0){
				notificarObsrevadores(tempActual);
			}
			m = Math.max(lastTemp + r.nextInt(20) - 10, -10);
			M = Math.min(m, 50);
			lastTemp = tempActual;
			tempActual= M;

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