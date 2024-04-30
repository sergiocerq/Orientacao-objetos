package entities;

import interfaces.Residencia;

public class Casa implements Residencia {
    @Override
    public void entrar(Boolean chaves) {
        System.out.println("Entrando na casa");
    }

    @Override
    public void sair() {
        System.out.println("Saindo da casa...");
    }
}
