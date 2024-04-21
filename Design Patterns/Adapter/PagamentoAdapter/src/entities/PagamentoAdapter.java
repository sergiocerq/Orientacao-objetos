package entities;

public class PagamentoAdapter {

    private PagamentoSDK pagamento = new PagamentoSDK();

    public void pagar(Integer valor) {
        this.pagamento.autorizar(valor);
        this.pagamento.capturar(valor);
    }

    public void creditar(Integer valor) {
        this.pagamento.creditar(valor);
    }
}
