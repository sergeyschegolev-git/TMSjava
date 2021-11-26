package tms.collection.strategies;

import tms.collection.model.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLowerPrice implements SortStrategy {
    @Override
    public List<Product> sort(List<Product> products) {
        return products
                .stream()
                .sorted(Comparator.comparingInt(Product::getPrice))
                .collect(Collectors.toList());
    }
}
