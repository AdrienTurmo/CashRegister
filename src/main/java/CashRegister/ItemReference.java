package CashRegister;

public class ItemReference {

    private final Price unitPrice;
    private final String codeItem;

    private ItemReference(Price unitPrice, String codeItem) {
        this.unitPrice = unitPrice;
        this.codeItem = codeItem;
    }

    public boolean matchSoughtItemCode(String ItemCode) {
        return this.codeItem.equals(ItemCode);
    }

    public Price getUnitPrice() {
        return unitPrice;
    }

    public static Builder anItemReference() {
        return new Builder();
    }

    public static final class Builder {
        private Price unitPrice;
        private String codeItem;

        private Builder() {
        }


        public Builder withUnitPrice(Price unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public Builder withUnitPrice(Double unitPrice) {
            this.unitPrice = Price.valueOf(unitPrice);
            return this;
        }

        public Builder withCodeItem(String codeItem) {
            this.codeItem = codeItem;
            return this;
        }

        public ItemReference build() {
            ItemReference itemReference = new ItemReference(unitPrice, codeItem);
            return itemReference;
        }
    }
}
