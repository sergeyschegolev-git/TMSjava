package tms.collection.model;

import lombok.Getter;
import lombok.Setter;
import tms.collection.exception.ProductCantBeAddedException;
import tms.collection.exception.ProductNotFound;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Store {
    private Map<Integer, Product> productList = new HashMap<>();

    public void addProduct(Product product) throws ProductCantBeAddedException {
        if (!isProductPresented(product.getId())) {
            productList.put(product.getId(), product);
        } else {
            throw new ProductCantBeAddedException("Product is already added");
        }
    }

    public void removeProduct(int id) throws ProductNotFound {
        if (isProductPresented(id)) {
            productList.remove(id);
        } else {
            throw new ProductNotFound("Product is not presented in store");
        }
    }

    public void updateProduct(Product product) throws ProductNotFound {
        if (isProductPresented(product.getId())) {
            productList.put(product.getId(), product);
        } else {
            throw new ProductNotFound("Product is not presented in store");
        }
    }

    public List<Product> getAllProducts() {
        return productList.values().stream().toList();
    }

    private boolean isProductPresented(int productId) {
        return productList.containsKey(productId);
    }
}
