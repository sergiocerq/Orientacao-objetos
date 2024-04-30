package proxys;

import interfaces.Residencia;

public class ProxyCasa implements Residencia {


    @Override
    public void entrar(Boolean chaves) {
        if(!chaves) {
            throw new RuntimeException("Não é possível entrar no prédio sem chaves!");
        }

        System.out.println("Entrando na casa através do proxy...");
    }

    @Override
    public void sair() {
        System.out.println("Saindo da casa através do proxy...");
    }
}
