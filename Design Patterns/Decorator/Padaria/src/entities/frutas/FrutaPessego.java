package entities.frutas;

import decorators.FrutaDecorator;
import interfaces.Padaria;

public class FrutaPessego extends FrutaDecorator {

  public FrutaPessego(Padaria item) {
    super(item);
  }

  public Integer getPreco() {
    return super.getPreco() + 2;
  }

}
