package entities;

import decorators.CoberturaDecorator;
import interfaces.Padaria;

public class CoberturaChocolate extends CoberturaDecorator {

  public CoberturaChocolate(Padaria novoBolo) {
    super(novoBolo);
  }

  @Override
  public Integer getPreco() {
    return super.getPreco() + 1;
  }
}
