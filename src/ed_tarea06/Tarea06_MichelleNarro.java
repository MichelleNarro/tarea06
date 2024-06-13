
package ed_tarea06;

public class Tarea06_MichelleNarro {
    
    public void aplicarDescuento(double precioProducto, int numProductos){     
    double total;

    if(numProductos>3)
        precioProducto-=5;

        if (numProductos!=0){
            total = precioProducto*DESCUENTO_PRIME;
            mostrarTotal(total);                  
        }else {
            total = precioProducto*0.95;
            mostrarTotal(total);
        }   
    }
    private static final double DESCUENTO_PRIME = 0.8;

    private void mostrarTotal(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
    
}