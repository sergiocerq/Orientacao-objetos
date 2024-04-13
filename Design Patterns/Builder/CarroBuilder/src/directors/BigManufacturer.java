package directors;

import builders.CarBuilder;
import builders.FiatBuilder;
import builders.PorscheBuilder;
import entities.CarProduct;

public class BigManufacturer {

    public CarProduct createPorscheCar() {
        CarBuilder porscheBuilder = (PorscheBuilder) new PorscheBuilder();
        porscheBuilder.buildEngine("V8");
        porscheBuilder.buildManufacturer();
        porscheBuilder.buildPreco(2000000.0);
        porscheBuilder.buildSeat();
        porscheBuilder.buildWheels(4);
        porscheBuilder.buildYear(2023);

        return porscheBuilder.buildCar();
    }

    public CarProduct createFiatCar() {
        CarBuilder fiatBuilder = new FiatBuilder();
        fiatBuilder.buildEngine("Motor 1");
        fiatBuilder.buildManufacturer();
        fiatBuilder.buildPreco(100000.0);
        fiatBuilder.buildSeat();
        fiatBuilder.buildWheels(4);
        fiatBuilder.buildYear(2023);

        return fiatBuilder.buildCar();
    }
}
