
public class VisitantePrecio extends VisitanteEquipo {
		int precio;

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

	}

	@Override
	public void VisitarBus(Bus b) {
		// TODO Auto-generated method stub

	}

}
