package entities;

import interfaces.Product;
import interfaces.Prototype;

import java.util.HashMap;

public class ProductPrototypeManager {

    private HashMap<String, Product> products = new HashMap<>();

    public ProductPrototypeManager() {}

    public void addProduct(String name, Product product) {
        this.products.put(name, product);
    }

    public Product getProduct(String name) {
        return this.products.get(name);
    }

    public ProductPrototypeManager getInstance() {
        return this;
    }

}
