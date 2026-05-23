package Strategy;

public class PercentageDiscountStrategy implements DiscountStrategy{

    private double porcentaje;

    public PercentageDiscountStrategy(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double total) {
        return total - (total * porcentaje / 100);
    }
}
