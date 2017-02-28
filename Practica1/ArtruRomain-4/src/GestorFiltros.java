/**
 * 
 */

/**
 * @author romainartru
 *
 */
public class GestorFiltros {
    
    private CadenaFiltros cf;
    /**
     * 
     */
    public GestorFiltros(Interfaz o) {
        cf = new CadenaFiltros();
        cf.setObjetivo(o);
    }
    
    public void setFiltro(Filtro f){
        cf.addFiltro(f);
    }

    public void peticionFiltro(double p){
        cf.ejecutar(p);
    }
}
