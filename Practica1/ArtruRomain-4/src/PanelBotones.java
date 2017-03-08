import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelBotones extends JPanel{
	private JButton BotonAcelerar; 
	private JToggleButton BotonEncender; 
	private JLabel EtiqMostrarEstado; 
	public static final Date d = new Date(0); 
	public static long startTime;
	private Cliente c;
	public PanelBotones(Cliente cli){
		c = cli;
		BotonAcelerar = new JButton("Acelerar");
		BotonEncender = new JToggleButton("Encender");
		EtiqMostrarEstado = new JLabel("APAGADO", SwingConstants.CENTER);

		setBackground(new Color(240,240,240));
		this.setBorder(BorderFactory.createEtchedBorder(Color.LIGHT_GRAY, Color.WHITE));
		SpringLayout spLayout = new SpringLayout();
		this.setLayout(spLayout);

		EtiqMostrarEstado.setVerticalAlignment(SwingConstants.TOP);
		EtiqMostrarEstado.setHorizontalAlignment(SwingConstants.CENTER);
		EtiqMostrarEstado.setForeground(Color.RED);
		EtiqMostrarEstado.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.LIGHT_GRAY));

		spLayout.putConstraint(SpringLayout.SOUTH, EtiqMostrarEstado, 54, SpringLayout.NORTH, this);
		spLayout.putConstraint(SpringLayout.WEST, EtiqMostrarEstado, 0, SpringLayout.WEST, this);
		spLayout.putConstraint(SpringLayout.EAST, EtiqMostrarEstado, 0, SpringLayout.EAST, this);
		spLayout.putConstraint(SpringLayout.NORTH, EtiqMostrarEstado, 10, SpringLayout.NORTH, this);

		this.add(EtiqMostrarEstado);

		spLayout.putConstraint(SpringLayout.SOUTH, BotonEncender, -29, SpringLayout.SOUTH, this);
		spLayout.putConstraint(SpringLayout.EAST, BotonEncender, -233, SpringLayout.EAST, this);

		this.add(BotonEncender);

		spLayout.putConstraint(SpringLayout.NORTH, BotonAcelerar, 0, SpringLayout.NORTH, BotonEncender);
		spLayout.putConstraint(SpringLayout.WEST, BotonAcelerar, 22, SpringLayout.EAST, BotonEncender);

		this.add(BotonAcelerar);

		BotonAcelerar.setEnabled(false);

		BotonAcelerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { BotonAcelerarActionPerformed(e);}
		});

		BotonEncender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { BotonEncenderActionPerformed(e);}
		});
	}
	synchronized private void BotonEncenderActionPerformed(ActionEvent evt){
		if (BotonEncender.isSelected()){
			BotonEncender.setForeground(Color.BLUE);
			EtiqMostrarEstado.setText("Acelerando");
			BotonEncender.setText("Apagar");
			BotonAcelerar.setEnabled(true);
			DemoInterceptor.initTime = System.currentTimeMillis()/1000;
			DemoInterceptor.distancia = 0;
			DemoInterceptor.rpm = 100;
		} else{
			BotonEncender.setForeground(Color.RED);
			EtiqMostrarEstado.setText("Apagado");
			BotonEncender.setText("Encender");  
			BotonAcelerar.setEnabled(false);
		}
	}

	synchronized private void BotonAcelerarActionPerformed(ActionEvent evt){
		DemoInterceptor.rpm += 10;
		c.enviarPeticion(DemoInterceptor.rpm);

	}
}