package Strategy;

public class FixedAmountDiscountStrategy implements DiscountStrategy{
    private double monto;
    public FixedAmountDiscountStrategy(double monto) {
        this.monto = monto;
    }
    @Override
    public double aplicarDescuento(double total) {
        return total - monto;
    }
}
