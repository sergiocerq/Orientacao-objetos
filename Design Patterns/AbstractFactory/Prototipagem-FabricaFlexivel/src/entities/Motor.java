package entities;

import interfaces.Product;

public class Motor implements Product {

    @Override
    public Product cloneProduct() {
        return new Motor();
    }
}
