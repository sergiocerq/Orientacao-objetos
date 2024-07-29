package entities.effects;

import interfaces.EffectImplementation;

public class FireEffect implements EffectImplementation {

  private Double adicionalEspecial;
  private Double adicionalForca;

  public FireEffect() {
    this.adicionalEspecial = 4.20;
    this.adicionalForca = 12.50;
  }

  @Override
  public Double adicionalEspecial() {
    System.out.println("Adicional Especial de fogo.");
    return this.adicionalEspecial;
  }

  @Override
  public Double adicionalForca() {
    System.out.println("Adicional Força de fogo.");
    return this.adicionalForca;
  }
}
