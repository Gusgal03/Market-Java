
package aplicacionmercados7;

public class Opciones {
    
    public static void alerta(Producto[] productos){
        
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].solicitar()) {
                System.out.println("Alerta generada para el código: " + productos[i].getCodigo());
            } else {
                System.out.println("No se solicitará producto del código: " + productos[i].getCodigo());
            }
        }
    }
    
}
