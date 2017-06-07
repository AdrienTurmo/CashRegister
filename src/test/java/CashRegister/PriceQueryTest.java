package CashRegister;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static CashRegister.ItemReference.anItemReference;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class PriceQueryTest {

    PriceQuery priceQuery = new PriceQuery(
            anItemReference().withCodeItem("APPLE").withUnitPrice(1.20).build(),
            anItemReference().withCodeItem("BANANA").withUnitPrice(1.90).build()
    );

@Parameters({"APPLE , 1.20", "BANANA , 1.90"})
    @Test
    public void find_the_price_given_an_item_code(String itemCode, double unitPrice) throws Exception {

        assertThat(priceQuery.findPrice(itemCode))
                .isEqualTo(Price.valueOf(unitPrice));
    }

}
