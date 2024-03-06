package properties;

public class Venda {
	public int id_venda;
	public int quantidade;
	public int id_produto;
	
	public Venda(int idvenda, int qtd, int idprod) {
		this.id_produto = idprod;
		this.quantidade = qtd;
		this.id_venda = idvenda;
	}

	public int getId_venda() {
		return id_venda;
	}

	public void setId_venda(int id_venda) {
		this.id_venda = id_venda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getId_produto() {
		return id_produto;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}

	public String toString() {
		return "ID: " + id_venda + ", quantidade:" + quantidade;
	}
	
}
