public abstract class Equipo{

  private String nombre;
  private double precio;

  public Equipo(String no, double pr){

    nombre= no; 
    precio = pr;

  }

  public String nombre(){

    return nombre+" "+precio;

  }

  public String toString(){
	  return nombre;
  }

  public abstract double getPrecio();

  public abstract void aceptar(VisitanteEquipo ve);

}

