package entities.weapoons;

import interfaces.Arma;
import interfaces.EffectImplementation;

public class Espada extends Arma {

  public Espada(EffectImplementation effect) {
    super(effect);
  }

  @Override
  public Double getAdicionalRapido() {
    return 15.0;
  }

  @Override
  public Double getAdicionalForca() {
    return 20 + this.effect.adicionalForca();
  }

  @Override
  public Double getAdicionalEspecial() {
    return 30 + effect.adicionalEspecial();
  }

  @Override
  public boolean habilitada() {
    return false;
  }
}
