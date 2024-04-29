package entities;

public class Bebida {
    private String nome;
    private Double preco;

    public Bebida (String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco += preco;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nPreço: " + this.getPreco();
    }

}
