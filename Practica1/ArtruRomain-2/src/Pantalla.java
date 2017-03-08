import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Pantalla extends JFrame implements Observador {
	private JPanel panel1, panel2;
	private JButton nuevaTemp;
	private JLabel temp;
	
	private GraficaTemperatura graf;

	public Pantalla(BotonCambio bot, Simulador sim) {
		// TODO Auto-generated constructor stub
		setTitle("Practica-1.4"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 650);
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        panel1 = new JPanel();
        panel1.setBounds(5, 5, 800, 200);
        getContentPane().add(panel1);
        
        temp = new JLabel("0°C");
        temp.setFont(new Font("Helvetica Neue", Font.PLAIN, 44));
		temp.setBounds(132, 86, 126, 53);
		panel1.add(temp);
		
        getContentPane().add(temp);
        
        nuevaTemp = bot;
        nuevaTemp.setBounds(110, 146, 117, 29);		
        panel1.add(nuevaTemp);
        
        graf = new GraficaTemperatura();
		panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(5, 205, 800, 440);
		panel2.add(graf.getPanelChart());

		getContentPane().add(panel2);		

		setVisible(true);
	}
	
	public static void refrescarPantalla(){
		
	}

	@Override
	public void actualizar(int tempAct) {
		// TODO Auto-generated method stub
		temp.setText(tempAct+"ºC");
		graf.actualizar(tempAct);
	}
}
