import java.util.ArrayList;

public abstract class Observable {
	private ArrayList<Observador> obs;

	public Observable() {
		// TODO Auto-generated constructor stub
		obs = new ArrayList<>();
	}

	public void incluirObservador(Observador o){
		obs.add(o);
	}
	public void notificarObsrevadores(int temp){
		for (Observador observador : obs){
			observador.manejarEvento(temp);
		}
	}
}
