import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Interfaz extends JFrame{
    public Interfaz(){
        PanelBotones panel = new PanelBotones(); 
        setTitle("Practica-1.4"); 
        setLocationRelativeTo(null);
        
        this.setResizable(false);
        this.setBounds(100, 100, 450, 150);
        
        getContentPane().add(panel);
        
        //terminar bien el programa
        this.addWindowListener (new WindowAdapter(){ 
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public void ejecutar(double peticion){
        //this.pack();
        this.setVisible(true); 
        System.out.println("Para un numero de vueltas iniciales del eje = "+peticion);
    }
}