
public class Tarjeta extends Equipo {

	public Tarjeta(String nombre, double precio) {
		super(nombre,precio);
		// TODO Auto-generated constructor stub
	}

	/*
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}
	*/

	@Override
	public void aceptar(VisitanteEquipo ve) {
		// TODO Auto-generated method stub
		ve.VisitarTarjeta(this);
	}

}
