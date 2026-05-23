package Observer;

public class AdminNotificationObserver implements OrderObserver {
    public void actualizar(String mensaje) {
        System.out.println("Notificando al administrador...");
    }
}
