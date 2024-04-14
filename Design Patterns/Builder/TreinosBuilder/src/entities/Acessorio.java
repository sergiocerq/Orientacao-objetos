package entities;

public class Acessorio extends Equipamento {

    private String descricao;

    private void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public Acessorio() {
        super();
    }

    public Equipamento makeEquipamento(Equipamento novo, String identificador, Integer quantidade, String descricao) {
        this.setDescricao(descricao);
        return super.makeEquipamento(novo, identificador, quantidade);
    }
}
