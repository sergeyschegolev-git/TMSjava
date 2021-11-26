package tms.collection.exception;

public class ProductNotFound extends Exception {
    public ProductNotFound(String errorMessage) {
        super(errorMessage);
    }
}
