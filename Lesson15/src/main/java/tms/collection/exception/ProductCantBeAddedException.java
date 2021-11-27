package tms.collection.exception;

public class ProductCantBeAddedException extends Exception {
    public ProductCantBeAddedException(String errorMessage) {
        super(errorMessage);
    }
}
