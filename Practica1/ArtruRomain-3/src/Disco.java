
public class Disco extends Equipo {

	public Disco(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public void aceptar(VisitanteEquipo ve) {
		ve.VisitarDisco(this);
	}

}
