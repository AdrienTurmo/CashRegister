import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CashRegisterTest {

    @Test
    public void name() throws Exception {

        CashRegister cashRegister = new CashRegister();
        Price price = Price.valueOf(1.20);
        double quantity = 1;

        Price total = cashRegister.total(price,quantity);

        assertThat(total).isEqualTo(Price.valueOf(1.20));
    }

}
