package entities.coberturas;

import decorators.CoberturaDecorator;
import interfaces.Padaria;

public class CoberturaMorango extends CoberturaDecorator {

  public CoberturaMorango(Padaria bolo){
    super(bolo);
  }

  @Override
  public Integer getPreco() {
    return super.getPreco() + 2;
  }
}
