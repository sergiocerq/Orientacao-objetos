package entities;

import java.util.List;

public interface Factory {
	public List getProducts();
	public void addProducts(Product p);
}
