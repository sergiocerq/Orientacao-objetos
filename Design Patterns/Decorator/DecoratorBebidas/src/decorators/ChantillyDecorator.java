package decorators;

import entities.Bebida;

public class ChantillyDecorator implements BebidaDecorator {

    private Double adicional = 1.50;
    private BebidaDecorator decorator;

    public ChantillyDecorator(BebidaDecorator bebidaDecorator) {
        this.decorator = bebidaDecorator;
    }

    @Override
    public String decorar(Bebida bebida) {
        bebida.setPreco(this.adicional);
        return decorator.decorar(bebida) + "\nAdicional de Chantilly !\n";
    }

}
