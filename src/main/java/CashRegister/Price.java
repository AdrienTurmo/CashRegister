package CashRegister;

import java.util.Objects;

public class Price {
    private final double value;

    public static Price valueOf(double value) {
        return new Price(value);
    }

    Price(double value) {
        this.value = value;
    }

    public Price multiplyBy(Quantity quantity) {
        return valueOf(
                quantity.multiplyBy(value));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Price price1 = (Price) o;

        return Double.compare(price1.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "CashRegister.Price{" +
                "value=" + value +
                '}';
    }
}
