import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class BotonCambio extends JPanel implements ObservadorConEvento {
	private JLabel lab;
	private JTextArea textEntry;

	public BotonCambio() {
		// TODO Auto-generated constructor stub
		lab = new JLabel("Nueva temperatura :");
		textEntry = new JTextArea(); 
	}

	public void manejarEvento() {
		// TODO Auto-generated method stub
		//refrecarPantalla();
	}

	@Override
	public void actualizar(int tempAct) {
		// TODO Auto-generated method stub
		
	}

}
