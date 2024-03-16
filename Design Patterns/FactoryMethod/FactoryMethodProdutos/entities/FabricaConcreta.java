package entities;

import java.util.ArrayList;
import java.util.List;

public class FabricaConcreta implements Factory {

	private List <Product> produtos;
	
	public FabricaConcreta() {
		this.produtos = new ArrayList<Product>();
	}
	
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		for(Product produto: produtos) {
			System.out.println(produto.getNome());
		}
		return this.produtos;
	}

	@Override
	public void addProducts(Product p) {
		// TODO Auto-generated method stub
		this.produtos.add(p);
	}
	
}
