package entities.effects;

import interfaces.EffectImplementation;

public class FreezeEffect implements EffectImplementation {

  private Double adicionalEspecial;
  private Double adicionalForca;

  public FreezeEffect() {
    this.adicionalEspecial = 10.0;
    this.adicionalForca = 2.50;
  }

  @Override
  public Double adicionalEspecial() {
    System.out.println("Adicional especial de gelo.");
    return this.adicionalEspecial;
  }

  @Override
  public Double adicionalForca() {
    System.out.println("Adicional forca de gelo.");
    return this.adicionalForca;
  }
}
