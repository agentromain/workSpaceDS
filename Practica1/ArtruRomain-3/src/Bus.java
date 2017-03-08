
public class Bus extends Equipo {

	public Bus(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public void aceptar(VisitanteEquipo ve) {
		ve.VisitarBus(this);
	}

}
