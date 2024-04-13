import directors.BigManufacturer;
import entities.CarProduct;

public class Main {

    public void run() {
        System.out.println("Hello world!");
        BigManufacturer bigManufacturer = new BigManufacturer();

        CarProduct carroPorsche = bigManufacturer.createPorscheCar();
        System.out.println(carroPorsche);

        CarProduct carroFiat = bigManufacturer.createFiatCar();
        System.out.println(carroFiat);
    }

    public static void main(String[] args) {
        (new Main()).run();
    }
}