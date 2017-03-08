import java.util.ArrayList;

public class Cliente implements Runnable{
	private VisitanteEquipo visit;
	private ArrayList<Equipo> equipos;
	private TipoCliente tipo;
	
	public Cliente(TipoCliente t) {
		// TODO Auto-generated method stub
		equipos = new ArrayList<>();
		tipo = t;
	}
	
	public void addEquipo(Equipo e){
		equipos.add(e);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		visit = new VisitanteNombre();
		visit = new VisitantePrecio();
	}
}
