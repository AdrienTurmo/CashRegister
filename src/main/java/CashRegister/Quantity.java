package CashRegister;
import java.util.Objects;

public class Quantity {
    private final double value;

    public Quantity(double value) {

        this.value = value;
    }

    public static Quantity valueOf(double value) {
        return new Quantity(value);
    }

    public double multiplyBy(double value) {
        return this.value*value;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                '}';
    }
}
