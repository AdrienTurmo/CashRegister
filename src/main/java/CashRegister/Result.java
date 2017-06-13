package CashRegister;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

abstract class Result {

    static Result found(Price price) {
        return new Found(price);
    }

    static Result notFound(String invalideItemCode) {
        return new NotFound(invalideItemCode);
    }

    abstract Result map(Function<Price,Price> function);

    abstract void ifFound(Consumer<Price> consumer);
    abstract void ifNotFound(Consumer<String> consumer);

    private static class Found extends Result {
        private Price price;

        Found(Price price) {
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

        @Override
        Result map(Function<Price, Price> function) {
            return found(function.apply(price));
        }

        @Override
        void ifFound(Consumer<Price> consumer) {
            consumer.accept(price);
        }

        @Override
        void ifNotFound(Consumer<String> consumer) {

        }
    }

    private static class NotFound extends Result {
        private String invalideItemCode;

        NotFound(String invalideItemCode) {
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

        @Override
        Result map(Function<Price, Price> function) {
            return this;
        }

        @Override
        void ifFound(Consumer<Price> consumer) {

        }

        @Override
        void ifNotFound(Consumer<String> consumer) {
            consumer.accept(invalideItemCode);
        }
    }
}
