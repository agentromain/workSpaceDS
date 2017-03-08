import java.util.ArrayList;

public class Cliente implements Runnable{
	private ArrayList<Equipo> equipos;
	private TipoCliente tipo;

	public Cliente(TipoCliente t, ArrayList<Equipo> e) {
		equipos = e;
		tipo = t;
	}

	public void addEquipo(Equipo e){
		equipos.add(e);
	}

	@Override
	public void run() {
		VisitanteNombre visit = new VisitanteNombre();
		for(int i = 0; i < equipos.size(); ++i)
			equipos.get(i).aceptar(visit);
		VisitantePrecio visit2 = new VisitantePrecio();
		for(int i = 0; i < equipos.size(); ++i)
			equipos.get(i).aceptar(visit2);

		double tmp4;

		switch(tipo){
		case regular: 
			tmp4 = Main.extraDescuendoR ? 1.05 : 1;
			break;
		case VIP: 
			tmp4 = Main.extraDescuendoV ? 1.15 : 1.1;
			break;
		case mayorista: 
			tmp4 = Main.extraDescuendoM ? 1.2 : 1.15;
			break;
		default: tmp4 = 0;
		}

		System.out.println("Cliente "+ tipo + " con descuendo :" + Main.deci.format((tmp4-1)*100) + "%\n" + visit + 
				"Precio total: "+Main.deci.format(visit2.getPrecio()*tmp4)+"€\n");
	}
}
