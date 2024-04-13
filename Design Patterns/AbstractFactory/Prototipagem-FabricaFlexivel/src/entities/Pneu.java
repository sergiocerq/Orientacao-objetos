package entities;

import interfaces.Product;

public class Pneu implements Product {

    @Override
    public Product cloneProduct() {
        return new Pneu();
    }
}
