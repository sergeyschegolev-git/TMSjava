package tms.collection.strategies;

import tms.collection.model.Product;

import java.util.List;

public class SortByEarliestDate implements SortStrategy {
    @Override
    public List<Product> sort(List<Product> products) {
        return products;
    }
}
