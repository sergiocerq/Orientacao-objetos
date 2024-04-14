package entities;

import java.util.HashMap;

public abstract class Equipamento {

    private String identificador;
    private Integer quantidade;

    public static HashMap<String, Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public String getIdentificador() {
        return identificador;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    private void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    private void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }


    private static HashMap<String, Equipamento> equipamentos = new HashMap<>();

    protected Equipamento(){}

    public static Equipamento makeEquipamento(Equipamento novo, String identificador, Integer quantidade) {
        if(equipamentos.containsKey(identificador)) {
            Equipamento e = equipamentos.get(identificador);
            e.setQuantidade(quantidade);
            return novo;
        }
        equipamentos.put(identificador, novo);
        return novo;
    }

    public static HashMap<String, Equipamento> getInstance() {
        return equipamentos;
    }

}