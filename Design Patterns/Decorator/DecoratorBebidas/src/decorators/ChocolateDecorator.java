package decorators;

import entities.Bebida;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class ChocolateDecorator implements BebidaDecorator{

    private BebidaDecorator decorator;
    private Double adicional = 2.00;

    public ChocolateDecorator (BebidaDecorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String decorar(Bebida bebida) {
        bebida.setPreco(this.adicional);
        return decorator.decorar(bebida) + "Adicional de Chocolate !";
    }
}
