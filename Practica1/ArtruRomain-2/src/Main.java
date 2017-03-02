
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pantalla p = new Pantalla();
		Simulador s = new Simulador(p);
		
		Thread t = new Thread(s);
		t.start();
	}

}
