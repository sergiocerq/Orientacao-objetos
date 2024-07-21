import entities.*;

public class Main {

  private void run() {
    Bolo bolo = new BoloBaunilha();
    System.out.println("Bolo baunilha: " + bolo.getPreco());

    bolo = new BoloChocolate();
    System.out.println("Bolo chocolate: " + bolo.getPreco());

    System.out.println("Bolo de chocolate com cobertura de chocolate e de morango: " + new CoberturaMorango(new CoberturaChocolate(bolo)).getPreco());
  }

  public static void main(String[] args) {
    (new Main()).run();
  }
}