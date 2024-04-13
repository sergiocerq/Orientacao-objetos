package factories;

import entities.ProductPrototypeManager;
import interfaces.Product;

public interface AbstractFactory {

    void addPrototype(String namePrototype, String nameProductPrototype, Product product);
    Product createMergeable(String name);
    Product createSerializable(String name);

}
