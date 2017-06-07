public class CashRegister {

    public Price total(Price price, double quantity) {
        return new Price(price.getPrice()*quantity);
    }

}
