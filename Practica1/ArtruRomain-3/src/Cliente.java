import java.util.ArrayList;

public class Cliente implements Runnable{
	private ArrayList<Equipo> equipos;
	private TipoCliente tipo;
	
	public Cliente(TipoCliente t, ArrayList<Equipo> e) {
		// TODO Auto-generated method stub
		equipos = e;
		tipo = t;
	}
	
	public void addEquipo(Equipo e){
		equipos.add(e);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*while(true){
			  try {
				  Thread.sleep(3000);
			  } catch (InterruptedException e) {
				  e.printStackTrace();
			  }*/
		
			  VisitanteNombre visit = new VisitanteNombre();
			  for(int i = 0; i < equipos.size(); ++i)
				  equipos.get(i).aceptar(visit);
			  VisitantePrecio visit2 = new VisitantePrecio();
			  for(int i = 0; i < equipos.size(); ++i)
				  equipos.get(i).aceptar(visit2);

			  double tmp4;
			  
			  switch(tipo){
			  case regular: 
				  tmp4 = Main.extraDescuendoR ? 1 : 1.05;
				  break;
			  case VIP: 
				  tmp4 = Main.extraDescuendoR ? 1.1 : 1.15;
				  break;
			  case mayorista: 
				  tmp4 = Main.extraDescuendoR ? 1.15 : 1.2;
				  break;
			  default: tmp4 = 0;
			  }
			  
			  System.out.println("Cliente "+ tipo + " con descuendo :" + Main.deci.format(tmp4*100) + "%\n" + visit + 
					  "Precio total: "+Main.deci.format(visit2.getPrecio()*tmp4)+"€\n");
		}
	//}
}
