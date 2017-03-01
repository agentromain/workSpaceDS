import java.util.Observable;

public class ObservablePantalla extends Observable {
	public ObservablePantalla() {
		// TODO Auto-generated constructor stub
		this.addObserver(new BotonCambio());
		this.addObserver(new GraficaTemperatura());
		this.addObserver(new TiempoSatelital());
	}
}
