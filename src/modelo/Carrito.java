package modelo;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProductos(Producto producto){
        productos.add(producto);
    }
    public List<Producto> obtenerProductos() {
        return productos;
    }
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}
