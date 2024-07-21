package entities.frutas;

import decorators.FrutaDecorator;
import interfaces.Padaria;

public class FrutaAmora extends FrutaDecorator {

  public FrutaAmora(Padaria item) {
    super(item);
  }

  @Override
  public Integer getPreco() {
    return super.getPreco() + 1;
  }
}
