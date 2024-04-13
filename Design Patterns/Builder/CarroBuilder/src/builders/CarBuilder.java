package builders;

import entities.CarProduct;

public interface CarBuilder {

    void buildPreco(Double price);
    void buildEngine(String engine);
    void buildSeat();
    void buildWheels(Integer numWheels);
    void buildYear(Integer year);
    void buildManufacturer();

    CarProduct buildCar();
}
