package decorators;

import entities.Bebida;

public class SimplesDecorator implements BebidaDecorator{

    @Override
    public String decorar(Bebida bebida) {
        return bebida.toString();
    }
}
