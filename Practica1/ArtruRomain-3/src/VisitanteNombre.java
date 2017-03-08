
public class VisitanteNombre extends VisitanteEquipo {
	private String nombre;
	
	public VisitanteNombre() {
		// TODO Auto-generated constructor stub
		nombre = "";
	}
	
	@Override
	public void VisitarDisco(Disco d) {
		// TODO Auto-generated method stub
		nombre += "Disco : "+d + '\n';
	}

	@Override
	public void VisitarTarjeta(Tarjeta t) {
		// TODO Auto-generated method stub
		nombre += "Tarjeta : "+t + '\n';
	}

	@Override
	public void VisitarBus(Bus b) {
		// TODO Auto-generated method stub
		nombre += "Bus : "+b + '\n';
	}

	public String toString(){
		return nombre;
	}
}
