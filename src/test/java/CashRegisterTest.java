import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CashRegisterTest {

    @Test
    public void name() throws Exception {

        CashRegister cashRegister = new CashRegister();
        Price price = new Price(1.20);
        double quantity = 1;

        Price total = cashRegister.total(price,quantity);

        assertThat(total.getPrice()).isEqualTo(1.20);
    }

}
