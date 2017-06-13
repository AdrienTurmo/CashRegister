package CashRegister;

public class PriceQuery {

    private ItemReference[] itemReferences;

    PriceQuery(ItemReference... itemReferences) {
        this.itemReferences = itemReferences;
    }

    Result findPrice(String soughtItemCode) {
        for (ItemReference itemReference : itemReferences) {
            if (itemReference.matchSoughtItemCode(soughtItemCode)) {
                Price unitPrice = itemReference.getUnitPrice();
                return Result.found(unitPrice);
            }
        }
        return Result.notFound(soughtItemCode);
    }
}
