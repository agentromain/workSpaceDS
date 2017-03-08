import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class BotonCambio extends JButton implements Observador {

	public BotonCambio(Simulador sim) {
		// TODO Auto-generated constructor stub
		super("Nueva temperatura");
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//sim.actualizaTemperaturaMinMax();
				sim.notificarObsrevadores(sim.getTemperaturaActual());
			}
		});
	}

	@Override
	public void actualizar(int tempAct) {
		// TODO Auto-generated method stub	
	}

}
