package CashRegister;

class ItemReference {

    private final Price unitPrice;
    private final String codeItem;

    ItemReference(Price unitPrice, String codeItem) {
        this.unitPrice = unitPrice;
        this.codeItem = codeItem;
    }

    boolean matchSoughtItemCode(String ItemCode) {
        return this.codeItem.equals(ItemCode);
    }

    Price getUnitPrice() {
        return unitPrice;
    }

    static Builder anItemReference() {
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

        Builder withUnitPrice(Double unitPrice) {
            this.unitPrice = Price.valueOf(unitPrice);
            return this;
        }

        Builder withCodeItem(String codeItem) {
            this.codeItem = codeItem;
            return this;
        }

        ItemReference build() {
            ItemReference itemReference = new ItemReference(unitPrice, codeItem);
            return itemReference;
        }
    }
}
