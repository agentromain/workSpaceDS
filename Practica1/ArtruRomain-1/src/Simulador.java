import java.util.ArrayList;
import java.util.Random;

/**
 * @author romainartru
 *
 */
public class Simulador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tiempoA = randInt(0,60);
		int numPart = randInt(10,200);
		Runnable cCarr = empezarCarrera(Carrera.crearCarrera(TC.CARRETERA, numPart), tiempoA);
		Runnable cMont = empezarCarrera(Carrera.crearCarrera(TC.MONTANA, numPart), tiempoA);

		Thread t1 = new Thread(cCarr);
		Thread t2 = new Thread(cMont);

		t1.start();
		t2.start();
	}

	private static int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

	public static Runnable empezarCarrera(ArrayList<Bicicleta> participantes, int tiempoAcc){	
		int partPrin = participantes.size();

		Runnable r = new Runnable() {
			boolean running = true;
			int time = 0;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					int accidentes = 0;
					TC tipoC = participantes.get(0).getTipo();

					switch (tipoC){
					case CARRETERA:
						accidentes = Math.round((participantes.size() * 10)/100);
					case MONTANA:
						accidentes = Math.round((participantes.size() * 20)/100);
					}

					while(running) {
						++time;
						Thread.sleep(1000);
						if(time%5 == 0) System.out.println("Carrera "+tipoC+' '+time+"s.");
						if(time == tiempoAcc){
							System.out.println("Atención en el accidente !!!");
							for(int i = participantes.size()-accidentes; i < participantes.size(); ++i){
								participantes.set(i, null);
							}
						}

						if(time == 60) running = false;
					}
					System.out.println("Fin de la carrera de "+participantes.get(0).getTipo()+
							"despues 60s :\n\tParticipantes al principio de la carrera: "+partPrin+
							"\n\tParticipantes al fin de la carrera: "+(participantes.size()-accidentes)+
							"\n\t Total de "+accidentes+" accidentes despuès "+tiempoAcc+" segundos");
				}catch(Exception e){
					e.getStackTrace();
				}
			}
		};
		return r;
	}
}
