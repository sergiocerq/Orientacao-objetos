package entities;

public class Halter extends Equipamento {

    private Double peso;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Halter() {
    }

    public static Equipamento makeEquipamento(Equipamento novo, String identificador, Integer quantidade, Double peso) {
        super.makeEquipamento(novo, identificador, quantidade);
        setPeso(peso);
        return this;
    }
}
