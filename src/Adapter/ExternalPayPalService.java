package Adapter;

public class ExternalPayPalService {
    public void realizarPago(String moneda, double monto) {
        System.out.println("Pago realizado con PayPal:" + moneda + " " + monto);
    }
}
