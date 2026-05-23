package Adapter;

public class PayPalAdapter implements PaymentProcessor {
    private ExternalPayPalService payPalService;

    public PayPalAdapter(ExternalPayPalService payPalService) {
        this.payPalService = payPalService;
    }

    public void pagar(double amount) {
        payPalService.realizarPago("PEN", amount);
    }
}
