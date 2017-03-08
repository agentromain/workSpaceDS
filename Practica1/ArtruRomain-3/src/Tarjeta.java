
public class Tarjeta extends Equipo {

	public Tarjeta(String nombre, double precio) {
		super(nombre,precio);
	}

	@Override
	public void aceptar(VisitanteEquipo ve) {
		ve.VisitarTarjeta(this);
	}

}
