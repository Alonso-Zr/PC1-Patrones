package Strategy;

public class NoDiscountStrategy implements DiscountStrategy{

    @Override
    public double aplicarDescuento(double total) {
        return total;
    }

}
