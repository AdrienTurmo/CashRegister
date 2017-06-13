package CashRegister;

import java.util.Objects;

abstract class Result {

    public static Result found(Price price) {
        return new Found(price);
    }

    public static Result notFound(String invalideItemCode) {
        return new NotFound(invalideItemCode);
    }


    private static class Found extends Result {
        private Price price;

        public Found(Price price) {
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Found found = (Found) o;
            return Objects.equals(price, found.price);
        }

        @Override
        public int hashCode() {
            return Objects.hash(price);
        }
    }

    private static class NotFound extends Result {
        private String invalideItemCode;

        public NotFound(String invalideItemCode) {
            this.invalideItemCode = invalideItemCode;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            NotFound notFound = (NotFound) o;
            return Objects.equals(invalideItemCode, notFound.invalideItemCode);
        }

        @Override
        public int hashCode() {
            return Objects.hash(invalideItemCode);
        }
    }
}
