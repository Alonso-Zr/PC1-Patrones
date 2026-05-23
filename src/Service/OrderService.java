package Service;
import Observer.OrderObserver;
import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<OrderObserver> observadores = new ArrayList<>();

    public void añadirObserver(OrderObserver observador) {
        observadores.add(observador);
    }

    public void confirmOrder(double total) {
        System.out.printf("Compra confirmada por S/ %.2f\n", total);
        notificarObservadores("Orden completada");
    }

    private void notificarObservadores(String mensaje) {
        for (OrderObserver observador : observadores) {
            observador.actualizar(mensaje);
        }
    }
}
