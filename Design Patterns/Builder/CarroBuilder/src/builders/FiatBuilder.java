package builders;

import entities.CarProduct;

import java.time.LocalDate;

public class FiatBuilder implements CarBuilder {

    private CarProduct carProduct = new CarProduct();

    @Override
    public void buildPreco(Double price) {
        carProduct.buildPrice(price > 50000 ? price : 100000);
    }

    @Override
    public void buildEngine(String engine) {
        carProduct.buildEngine(engine);
    }

    @Override
    public void buildSeat() {
        carProduct.buildSeat(5);
    }

    @Override
    public void buildWheels(Integer numWheels) {
        carProduct.buildNumWheels(numWheels > 5 ? numWheels : 4);
    }

    @Override
    public void buildYear(Integer year) {
        carProduct.buildYear(year > 1900 ? year : LocalDate.now().getYear());
    }

    @Override
    public void buildManufacturer() {
        carProduct.buildManufacturer("Fiat Manufacturer");
    }

    @Override
    public CarProduct buildCar() {
        return this.carProduct;
    }
}
