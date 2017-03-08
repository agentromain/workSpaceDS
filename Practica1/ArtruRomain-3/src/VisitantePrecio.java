
public class VisitantePrecio extends VisitanteEquipo {
	private	double precio;

	public VisitantePrecio() {
		// TODO Auto-generated constructor stub
		precio = 0;
	}
	
	@Override
	public void VisitarDisco(Disco d) {
		// TODO Auto-generated method stub
		precio += d.getPrecio();
	}

	@Override
	public void VisitarTarjeta(Tarjeta t) {
		// TODO Auto-generated method stub
		precio += t.getPrecio();
	}

	@Override
	public void VisitarBus(Bus b) {
		// TODO Auto-generated method stub
		precio += b.getPrecio();
	}

	public double getPrecio(){
		return precio;
	}
}
