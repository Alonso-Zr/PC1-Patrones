package Observer;

public class EmailNotificationObserver implements OrderObserver{
    public void actualizar(String mensaje) {
        System.out.println("Enviando correo al cliente...");
    }
}
