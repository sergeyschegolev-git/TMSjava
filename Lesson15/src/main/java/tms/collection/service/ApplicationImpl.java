package tms.collection.service;

import tms.collection.exception.ProductCantBeAddedException;
import tms.collection.exception.ProductNotFound;
import tms.collection.model.Product;
import tms.collection.model.Store;
import tms.collection.strategies.SortByEarliestDate;
import tms.collection.strategies.SortByHigherPrice;
import tms.collection.strategies.SortByLowerPrice;
import tms.collection.strategies.SortStrategy;

import java.util.List;
import java.util.Scanner;

public class ApplicationImpl implements Application {
    private Store store;

    public ApplicationImpl() {
        store = new Store();
    }

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        showMenu();
        int userChoice;

        while ((userChoice = scanner.nextInt()) != 0) {
            runOperation(userChoice);
            showMenu();
        }
    }

    private void showMenu() {
        System.out.println("Enter an operation number: ");
        System.out.println("1 - show all products");
        System.out.println("2 - add product");
        System.out.println("3 - remove product");
        System.out.println("4 - update product");
        System.out.println("0 - exit program");
    }

    private void runOperation(int userChoice) {
        if (userChoice == 1) {
            showAllProducts();
        } else if (userChoice == 2) {
            addProduct();
        } else if (userChoice == 3) {
            removeProduct();
        } else if (userChoice == 4) {
            updateProduct();
        }
    }

    private void showAllProducts() {
        List<Product> products = getSortedProducts();
        System.out.println(products);
    }

    private List<Product> getSortedProducts() {
        System.out.println("Sort by: ");
        System.out.println("1 - low price");
        System.out.println("2 - high price");
        System.out.println("3 - date");
        Scanner scanner = new Scanner(System.in);
        int sortBy = scanner.nextInt();
        SortStrategy strategy = null;

        if (sortBy == 1) {
            strategy = new SortByLowerPrice();
        } else if (sortBy == 2) {
            strategy = new SortByHigherPrice();
        } else if (sortBy == 3) {
            strategy = new SortByEarliestDate();
        } else {
            System.out.println("You have entered wrong number, try again");
            getSortedProducts();
        }

        if (strategy != null) {
            return strategy.sort(store.getAllProducts());
        }

        return null;
    }

    private void addProduct() {
        Product product = createProductOnUserFeedback();

        try {
            store.addProduct(product);
        } catch (ProductCantBeAddedException e) {
            System.out.println(e);
        }
    }

    private void removeProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id: ");
        int id = scanner.nextInt();

        try {
            store.removeProduct(id);
        } catch (ProductNotFound e) {
            System.out.println(e);
        }
    }

    private void updateProduct() {
        Product product = createProductOnUserFeedback();

        try {
            store.updateProduct(product);
        } catch (ProductNotFound e) {
            System.out.println(e);
        }
    }

    private Product createProductOnUserFeedback() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id: ");
        int id = scanner.nextInt();
        System.out.println("Enter product name: ");
        String name = scanner.next();
        System.out.println("Enter product price: ");
        int price = scanner.nextInt();

        return createProduct(id, name, price);
    }

    private Product createProduct(int id, String name, int price) {
        return Product
                .builder()
                .id(id)
                .name(name)
                .price(price)
                .build();
    }
}
