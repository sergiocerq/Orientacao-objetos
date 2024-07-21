package decorators;

import interfaces.Padaria;

public abstract class FrutaDecorator implements Padaria {

  private Padaria item;

  public FrutaDecorator(Padaria item) {
    this.item = item;
  }

  @Override
  public Integer getPreco() {
    return this.item.getPreco();
  }
}
