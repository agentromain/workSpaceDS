import java.util.Observable;
import java.util.Observer;

public class BotonCambio implements Observer {

	public BotonCambio() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		int temp = (int)arg;
		
		System.out.println(temp);
	}

}