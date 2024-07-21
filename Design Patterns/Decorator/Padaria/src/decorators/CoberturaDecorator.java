package decorators;

import entities.Bolo;
import interfaces.Padaria;

public abstract class CoberturaDecorator implements Padaria {

  private Padaria bolo;

  public CoberturaDecorator(Padaria novoBolo) {
    this.bolo = novoBolo;
  }

  @Override
  public Integer getPreco() {
    return this.bolo.getPreco();
  }
}
