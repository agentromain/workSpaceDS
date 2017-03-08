public abstract class Equipo{

	private String nombre;
	private double precio;

	public Equipo(String no, double pr){

		nombre= no; 
		precio = pr;

	}

	public String toString(){
		return nombre;
	}

	public double getPrecio(){
		return precio;
	}

	public abstract void aceptar(VisitanteEquipo ve);

}

