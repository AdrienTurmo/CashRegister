import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CashRegisterTest {

    @Test
    public void name() throws Exception {

        CashRegister cashRegister = new CashRegister();
        double price = 1.20;
        double quantity = 1;

        double total = cashRegister.total(price,quantity);

        assertThat(total).isEqualTo(1.20);
    }

    private class CashRegister {
        public double total(double price, double quantity) {
            return price*quantity;
        }
    }
}
