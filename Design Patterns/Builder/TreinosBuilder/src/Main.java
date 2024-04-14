import entities.Equipamento;
import entities.Maquina;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Equipamento p = Maquina.makeEquipamento(new Maquina(), "Maquina", 2, "Maquina de supino", "Marca1");
    }
}