package Observer;

public class InventoryObserver implements OrderObserver {
    public void actualizar(String mensaje) {
        System.out.println("Actualizando inventario...");
    }
}
