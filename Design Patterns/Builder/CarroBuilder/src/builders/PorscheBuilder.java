package builders;

import entities.CarProduct;

import java.time.LocalDateTime;

public class PorscheBuilder implements CarBuilder {
    
    private CarProduct carProduct = new CarProduct();
    
    @Override
    public void buildPreco(Double price) {
        carProduct.buildPrice(price > 1000000 ? price : 1000000);
    }

    @Override
    public void buildEngine(String engine) {
        carProduct.buildEngine(engine);
    }

    @Override
    public void buildSeat() {
        carProduct.buildSeat(2);
    }

    @Override
    public void buildWheels(Integer numWheels) {
        carProduct.buildNumWheels(numWheels);
    }

    @Override
    public void buildYear(Integer year) {
        carProduct.buildYear(year > 1900 ? year : LocalDateTime.now().getYear());
    }

    @Override
    public void buildManufacturer() {
        carProduct.buildManufacturer("Porsche manufacturer");
    }

    @Override
    public CarProduct buildCar() {
        return this.carProduct;
    }

}
