import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Pantalla extends JFrame implements Observador {
	private JLabel textTemp;
	private JLabel temp;

	public Pantalla() {
		// TODO Auto-generated constructor stub
		setTitle("Practica-1.4"); 
        setLocationRelativeTo(null);
        
        this.setResizable(false);
        this.setBounds(100, 100, 450, 150);
        
        
        textTemp = new JLabel("Temperatura : ");
        
        this.getContentPane().add(textTemp);
        this.getContentPane().add(temp);
        
        this.addWindowListener (new WindowAdapter(){ 
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
	}
	
	public static void refrescarPantalla(){
		
	}

	public static void manejarEvento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(int tempAct) {
		// TODO Auto-generated method stub
		
	}
	
	public void ejecutar(double peticion){
        this.pack();
        this.setVisible(true); 
    }
}
