package CashRegister;

public class PriceQuery {

    private ItemReference[] itemReferences;

    public PriceQuery(ItemReference ... itemReferences) {this.itemReferences = itemReferences; }

    Price findPrice(String soughtItemCode) {
        for (ItemReference itemReference : itemReferences) {
            if (itemReference.matchSoughtItemCode(soughtItemCode)) {
                return itemReference.getUnitPrice();
            }
        }
        return null;
    }
}
