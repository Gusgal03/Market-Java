
package aplicacionmercados7;

import java.util.Scanner;

public class App {

    static Scanner leer = new Scanner(System.in); //Objeto Scanner de tipo static para todos los métodos de la clase
    
    public static void main(String[] args) {
        //llenar el vector
        Producto[] productos = llenarVector();
        mostrarMenu(); //Procedimiento, no hace nada solo muestra el Menu
        System.out.println("Digite la opción deseada: ");
        int op = leer.nextInt(); //Es la opción del menu que la persona elige
        switch (op) {
            case 1:
                //Llamado a un método
                Opciones.alerta(productos);
                break;
        }
    }
    
    //Creamos un método estático que devuelve un vector de objetos productos
    public static Producto[] llenarVector(){
         
        Producto [] productos = new Producto[100]; //Producto[] es la clase y productos es el vector
        System.out.println("Digite la cantidad de productos: ");
        int n = leer.nextInt();
        for (int i = 0; i < n; i++) { //Recorremos el vector
            System.out.println("Digite el código del producto: ");
            int cod = leer.nextInt();
            
            System.out.println("Digite el precio de compra del producto: ");
            int valor = leer.nextInt();
            
            System.out.println("Digite lel precio de venta del producto: ");
            int precioV = leer.nextInt();
            
            System.out.println("Digite la cantidad en bodega: ");
            int cantB = leer.nextInt();
            
            System.out.println("Digite la cantidad máxima de inventario del producto: ");
            int cantM = leer.nextInt();
            
            System.out.println("Digite la cantidad minima de inventario del producto: ");
            int cMin = leer.nextInt();
            
            productos[i] = new Producto(cod, valor, precioV, cantB, cantM, cMin); //el objeto que esta en el vector en la posición i
    }
    
        return productos;
    }
    
    public static void imprimirVector(Producto[] productos){
        
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }
    }
    
    private static void mostrarMenu(){
        System.out.println("Menu de Opciones");
        System.out.println("Opción 1: Verificar productos a pedir ");
        System.out.println("Opción 2: Producto con mayor cantidad de unidades ");
        System.out.println("Opción 3: Total a pagar por pedido a realizar ");
        System.out.println("Opción 4: Modificar cantidad mínima requeridad en bodega ");
        System.out.println("Opción 5: Vender producto ");
    }
}
