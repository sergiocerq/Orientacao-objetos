import entities.effects.FireEffect;
import entities.effects.FreezeEffect;
import entities.weapoons.Bazuca;
import interfaces.Arma;
import interfaces.EffectImplementation;

public class Main {

  public void run() {
    System.out.println("Hello World!");

    EffectImplementation effect = new FireEffect();

    Arma arma = new Bazuca(effect);
    System.out.println(arma.getAdicionalEspecial());

    effect = new FreezeEffect();
    arma = new Bazuca(effect);
    System.out.println(arma.getAdicionalForca());
  }

  public static void main(String[] args) {
    (new Main()).run();
  }
}