package CashRegister;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CashRegisterTest {

    @Test
    public void i_get_total_price_from_price_and_quantity() throws Exception {

        CashRegister cashRegister = new CashRegister();
        Price price = Price.valueOf(1.20);
        Quantity quantity = Quantity.valueOf(1);

        Price total = cashRegister.total(price,quantity);

        assertThat(total).isEqualTo(Price.valueOf(1.20));
    }

}
