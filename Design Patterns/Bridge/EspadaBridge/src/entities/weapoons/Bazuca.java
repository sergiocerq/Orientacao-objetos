package entities.weapoons;

import interfaces.Arma;
import interfaces.EffectImplementation;

public class Bazuca extends Arma {

  public Bazuca(EffectImplementation effect) {
    super(effect);
  }

  @Override
  public Double getAdicionalRapido() {
    return 16.67;
  }

  @Override
  public Double getAdicionalForca() {
    return 5 + effect.adicionalForca();
  }

  @Override
  public Double getAdicionalEspecial() {
    return 25.00 + effect.adicionalEspecial();
  }

  @Override
  public boolean habilitada() {
    return false;
  }
}
