import entities.PagamentoAdapter;

public class Main {
    public static void main(String[] args) {

        // Classe PagamentoAdapter implementa uma adaptação de PagamentoSDK
        // Ao colocar 2 métodos dentro de um, adaptando assim para o contexto da aplicação

        PagamentoAdapter pagamentoAdapter = new PagamentoAdapter();

        pagamentoAdapter.creditar(100);
        pagamentoAdapter.pagar(50);


    }
}