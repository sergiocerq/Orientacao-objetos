package entities;

import interfaces.Padaria;

public abstract class Bolo implements Padaria {

  private Integer preco;

  public Bolo(Integer preco) {
    this.preco = preco;
  }

  @Override
  public Integer getPreco() {
    return preco;
  }
}
