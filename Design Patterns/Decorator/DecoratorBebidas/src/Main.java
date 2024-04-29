import decorators.BebidaDecorator;
import decorators.ChantillyDecorator;
import decorators.ChocolateDecorator;
import decorators.SimplesDecorator;
import entities.Bebida;

public class Main {
    public static void main(String[] args) {
        Bebida bebida = new Bebida("Bebida 1", 5.00);
        BebidaDecorator decorator = new SimplesDecorator();
        decorator = new ChantillyDecorator(decorator);
        decorator = new ChocolateDecorator(decorator);

        System.out.println(decorator.decorar(bebida));
    }
}