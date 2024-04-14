package entities;

public class Maquina extends Equipamento {

    private String descricao;
    private String marca;

    public Maquina() {
        super();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Equipamento makeEquipamento(Equipamento novo, String identificador, Integer quantidade, String descricao, String marca) {
        this.setDescricao(descricao);
        this.setMarca(marca);
        return super.makeEquipamento(novo, identificador, quantidade);
    }
}
