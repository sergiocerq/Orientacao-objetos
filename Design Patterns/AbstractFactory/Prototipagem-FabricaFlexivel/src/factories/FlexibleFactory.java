package factories;

import entities.ProductPrototypeManager;
import interfaces.Product;

import java.util.HashMap;

public class FlexibleFactory implements AbstractFactory {

    private ProductPrototypeManager productPrototypeManager = new ProductPrototypeManager();
    private HashMap<String, ProductPrototypeManager> prototypes = new HashMap<>();

    @Override
    public void addPrototype(String prototype, String name, Product product) {
        productPrototypeManager.addProduct(name, product);
        prototypes.put(prototype, productPrototypeManager);
    }

    @Override
    public Product createMergeable(String name) {
        HashMap<String, Product> mergeableProducts = new HashMap<>();
        Product produto = null;

        for(String prototype: prototypes.keySet()) {
            System.out.println(prototype);
            if(prototypes.equals("Mergeable"))
                mergeableProducts.put(prototype, (Product) prototypes.get(name));
        }



        for(String product: mergeableProducts.keySet())
            if(product.equalsIgnoreCase(name))
                produto = mergeableProducts.get(product).cloneProduct();

        return produto;
    }

    @Override
    public Product createSerializable(String name) {
        HashMap<String, Product> serializableProducts = new HashMap<>();
        Product serializable = null;

        for(String key: prototypes.keySet())
            if(key.equalsIgnoreCase("Serializable"))
                serializableProducts.put(key, (Product) prototypes.get(key));

        for(String nameProduct: serializableProducts.keySet())
            if(nameProduct.equalsIgnoreCase(name))
                serializable = serializableProducts.get(nameProduct).cloneProduct();


        return serializable;
    }
}
