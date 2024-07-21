import entities.bolos.Bolo;
import entities.bolos.BoloBaunilha;
import entities.bolos.BoloChocolate;
import entities.coberturas.CoberturaChocolate;
import entities.coberturas.CoberturaMorango;
import entities.frutas.FrutaAmora;
import entities.frutas.FrutaPessego;

public class Main {

  private void run() {
    Bolo bolo = new BoloBaunilha();
    System.out.println("Bolo baunilha: " + bolo.getPreco());

    bolo = new BoloChocolate();
    System.out.println("Bolo chocolate: " + bolo.getPreco());
    System.out.println("Bolo de chocolate com cobertura de chocolate e de morango: " + new CoberturaMorango(new CoberturaChocolate(bolo)).getPreco());
    System.out.println("Bolo de chocolate com frutas de pêssego: " + new FrutaPessego(bolo).getPreco());

    bolo = new BoloBaunilha();
    System.out.println("Bolo baunilha com frutas de amora: " + new FrutaAmora(bolo).getPreco());
  }

  public static void main(String[] args) {
    (new Main()).run();
  }
}