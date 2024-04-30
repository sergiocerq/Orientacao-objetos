package entities;

import interfaces.Residencia;

public class Predio implements Residencia {

    @Override
    public void entrar(Boolean chaves) {
        System.out.println("Entrando no prédio...");
    }

    @Override
    public void sair() {
        System.out.println("Saindo do prédio...");
    }
}
