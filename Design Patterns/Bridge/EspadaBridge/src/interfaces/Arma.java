package interfaces;

public abstract class Arma {

  protected EffectImplementation effect;

  public Arma(EffectImplementation effect) {
    this.effect = effect;
  }

  public abstract Double getAdicionalRapido();
  public abstract Double getAdicionalForca();
  public abstract Double getAdicionalEspecial();
  public abstract boolean habilitada();
}
