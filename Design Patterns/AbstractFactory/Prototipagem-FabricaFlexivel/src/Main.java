import entities.Motor;
import entities.Pneu;
import factories.FlexibleFactory;

public class Main {

    public void run() {
        System.out.println("Hello World!");
        FlexibleFactory ff = new FlexibleFactory();
        ff.addPrototype("Mergeable",  "Pneu", new Pneu());
        ff.addPrototype("Serializable",  "Motor", new Motor());

        Pneu p = (Pneu) ff.createMergeable("Pneu");
        Motor m = (Motor) ff.createSerializable("Motor");

    }

    public static void main(String[] args) {
        (new Main()).run();
    }
}