
package modelos;

import interfaces.Pagable;
import interfaces.Notificable;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private String estado;
    private Notificable notificable;
    
    public Pedido(Notificable notificable) {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.notificable = notificable;
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (notificable != null) {
            notificable.notificar("El pedido cambio al estado: " + nuevoEstado);
        }
    }
    
    @Override
    public double calcularTotal() {
        return productos.stream()
                       .mapToDouble(Producto::calcularTotal)
                       .sum();
    }
    
    public List<Producto> getProductos() { return productos; }
    public String getEstado() { return estado; }
}
