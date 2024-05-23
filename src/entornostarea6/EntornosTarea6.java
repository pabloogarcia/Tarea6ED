
package entornostarea6;

/**
 *
 * @author USER
 */
public class EntornosTarea6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tarea6EDClase miCarrito = instanciar();
        
        /**
         * asignacion de valores al objeto miCarrito
         */
        miCarrito.aplicarDescuento(100, 5);
    }
    
    /**
     * Método para instanciar un objeto de Tarea6EDClase.
     *
     * @return objeto de Tarea6EDClase.
     */
    
    public static Tarea6EDClase instanciar() {
        Tarea6EDClase miCarrito = new Tarea6EDClase();
        return miCarrito;
    }
    
}
