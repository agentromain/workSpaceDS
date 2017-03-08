import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
	public static DecimalFormat deci;
	private static ArrayList<Thread> t;
	private static ArrayList<Cliente> cl;
	private static ArrayList<ArrayList<Equipo>> listas;
	public static boolean extraDescuendoR, extraDescuendoV, extraDescuendoM;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deci = new DecimalFormat("#0.00#");

		int tmp1, tmp2;
		extraDescuendoM = false;
		extraDescuendoR = false;
		extraDescuendoV = false;
		int r = 0, v = 0, m = 0;

		init();

		t = new ArrayList<>();
		cl = new ArrayList<>();
		for(int i = 0; i < 100; ++i){
			tmp1 = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			tmp2 = ThreadLocalRandom.current().nextInt(0, 3 + 1);
			switch(tmp1){
			case 0: ++r; extraDescuendoR = (r > 25); break;
			case 1: ++v; extraDescuendoV = (v > 25); break;
			case 2: ++m; extraDescuendoM = (m > 25); break;
			}
			cl.add(new Cliente(TipoCliente.crearCliente(tmp1), listas.get(tmp2)));
			t.add(new Thread(cl.get(i)));
		}

		for(Thread thread : t){
			thread.start(); 
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Numero de clientes regular : " + r + " descuendo -> " + extraDescuendoR);
		System.out.println("Numero de clientes VIP : " + v + " descuendo -> " + extraDescuendoV);
		System.out.println("Numero de clientes mayorista : " + m + " descuendo -> " + extraDescuendoM);
	}

	private static void init(){
		ArrayList<Equipo> l1 = new ArrayList<>(), l2 = new ArrayList<>(), 
				l3 = new ArrayList<>(), l4 = new ArrayList<>();

		Equipo e1 = new Bus("USB 3.0", 15); 
		Equipo e2 = new Tarjeta("AMD RX 480", 350); Equipo e3 = new Tarjeta("Nvidia GTX 1080", 285);
		Equipo e4 = new Disco("Seagate Barracuda", 100); Equipo e5 = new Disco("TOSHIBA N300", 85);
		l1.add(e1); l1.add(e2); l1.add(e4);
		l2.add(e3); l2.add(e5);
		l3.add(e1); l3.add(e3); l3.add(e4);
		l4.add(e2); l4.add(e4); 

		listas = new ArrayList<>();
		listas.add(l1);listas.add(l2);listas.add(l3);listas.add(l4);
	}
}
