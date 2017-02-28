import java.util.ArrayList;

/**
 * 
 */

/**
 * @author romainartru
 *
 */
public class CadenaFiltros {

    private ArrayList<Filtro> filtros;
    private Interfaz objetivo;
  
    /**
     * 
     */
    public CadenaFiltros() {
        filtros = new ArrayList<Filtro>();
    }

    public void ejecutar(double peticion){ 
        for(Filtro filtro : filtros){
            filtro.ejecutar(peticion);
            System.out.println(filtro);
        }
        objetivo.ejecutar(peticion);
    }
    
    public void setObjetivo(Interfaz objetivo){ 
        this.objetivo = objetivo;
    }
    
    public void addFiltro(Filtro f){
        filtros.add(f);
    }
}
