package tms.collection.strategies;

import tms.collection.model.Product;

import java.util.List;

public interface SortStrategy {
    public List<Product> sort(List<Product> product);
}
