
public enum TipoCliente {
	regular, VIP, mayorista;

	public static TipoCliente crearCliente(int t) {
		// TODO Auto-generated method stub
		switch(t){
		case 0: return regular;
		case 1: return VIP;
		case 2: return mayorista;
		default : return regular;
		}
	}
}

