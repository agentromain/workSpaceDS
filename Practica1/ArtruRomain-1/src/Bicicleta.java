/**
 * 
 * @author romainartru
 *
 */
public abstract class Bicicleta {
	TC tipo;
	Cuadro<?> cuad;
	Manillar<?> man;
	Ruedas<?> rued1;
	Ruedas<?> rued2;

	/**
	 * Constructor form abstract class
	 * @param t type of bike
	 */
	public Bicicleta(TC t){
		tipo = t;
	}

	TC getTipo(){
		return tipo;
	}

	void setTipo(TC t){
		tipo = t;
	}

	public String toString(){
		return "bicicleta-"+tipo;
	}
}