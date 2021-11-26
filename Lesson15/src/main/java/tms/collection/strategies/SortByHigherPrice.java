package tms.collection.strategies;

import tms.collection.model.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByHigherPrice implements SortStrategy {
    @Override
    public List<Product> sort(List<Product> products) {
        List<Product> sortedProducts = products
                .stream()
                .sorted(Comparator.comparingInt(Product::getPrice))
                .collect(Collectors.toList());

        Collections.reverse(sortedProducts);

        return sortedProducts;
    }
}
