
package aplicacionmercados7;

public class Producto {
    //Aqui van los atributos
    private int codigo; //solo se puede trabajar dentro de la clase
    private int precioCompra;
    private int precioVenta;
    private int cantidadBodega; 
    private int cMinRequerida;
    private int cMaxPermitida;
    public static double pDescuento = 0.01;
    
    //ahora el método constructor

    public Producto(int codigo, int precioCompra, int precioVenta, int cantidadBodega, int cMinRequerida, int cMaxPermitida) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidadBodega = cantidadBodega;
        this.cMinRequerida = cMinRequerida;
        this.cMaxPermitida = cMaxPermitida;
    }
    
    
    public boolean solicitar(){
        if (cantidadBodega < cMinRequerida) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public int totalAPagar(int unidades){
        return unidades * precioCompra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getcMinRequerida() {
        return cMinRequerida;
    }

    public void setcMinRequerida(int cMinRequerida) {
        if (cMinRequerida < 0) {
            this.cMinRequerida = 0; //la hago igual a cero
        } else {
            this.cMinRequerida = cMinRequerida; //sino el valor que me pasen
        }
    }

    public int getcMaxPermitida() {
        return cMaxPermitida;
    }

    public void setcMaxPermitida(int cMaxPermitida) {
        this.cMaxPermitida = cMaxPermitida;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", cantidadBodega=" + cantidadBodega + ", cMinRequerida=" + cMinRequerida + ", cMaxPermitida=" + cMaxPermitida + '}';
    }  
    
}
