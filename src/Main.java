import modelo.Carrito;
import modelo.Producto;
import Strategy.DiscountStrategy;
import Strategy.FixedAmountDiscountStrategy;
import Adapter.ExternalPayPalService;
import Adapter.PaymentProcessor;
import Adapter.PayPalAdapter;
import Observer.AdminNotificationObserver;
import Observer.EmailNotificationObserver;
import Observer.InventoryObserver;
import Service.OrderService;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Control DualSense", 339.00);
        Producto p2 = new Producto("Nintendo Switch OLED", 1589.00);

        Carrito carrito = new Carrito();
        carrito.agregarProductos(p1);
        carrito.agregarProductos(p2);

        double total = carrito.calcularTotal();

        DiscountStrategy strategy = new FixedAmountDiscountStrategy(20.00);
        double finalTotal = strategy.aplicarDescuento(total);

        ExternalPayPalService externalService = new ExternalPayPalService();
        PaymentProcessor paymentProcessor = new PayPalAdapter(externalService);
        paymentProcessor.pagar(finalTotal);

        OrderService orderService = new OrderService();
        orderService.agregarObserver(new EmailNotificationObserver());
        orderService.agregarObserver(new InventoryObserver());
        orderService.agregarObserver(new AdminNotificationObserver());

        orderService.confirmarOrden(finalTotal);
    }
}