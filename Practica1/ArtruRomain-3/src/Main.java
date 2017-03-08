import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class Main {
	private static ArrayList<Cliente> cl;
	public static boolean extraDescuendoR, extraDescuendoV, extraDescuendoM;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tmp;
		extraDescuendoM = false;
		extraDescuendoR = false;
		extraDescuendoV = false;
		int r=0, v=0, m=0;
		cl = new ArrayList<>();
		for(int i = 0; i < 100; ++i){
			tmp = ThreadLocalRandom.current().nextInt(0, 2 + 1);
			switch(tmp){
			case 0: ++r; extraDescuendoR = (r > 25);
			case 1: ++v; extraDescuendoV = (v > 25);
			case 2: ++m; extraDescuendoM = (m > 25);
			}
			cl.add(new Cliente(TipoCliente.crearCliente(tmp)));
		}
	}

}
