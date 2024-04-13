package entities;

public class CarProduct {

    private Double price;
    private String manufacturer;
    private String engine;
    private Integer seat;
    private Integer numWheels;
    private Integer year;

    public void buildPrice(Double price) {
        this.price = price;
    }

    public void buildManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void buildEngine(String engine) {
        this.engine = engine;
    }

    public void buildSeat(Integer seat) {
        this.seat = seat;
    }

    public void buildNumWheels(Integer numWheels) {
        this.numWheels = numWheels;
    }

    public void buildYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public String getEngine() {
        return engine;
    }

    public Integer getSeat() {
        return seat;
    }

    public Integer getNumWheels() {
        return numWheels;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Carro: "  + manufacturer + '\'' +
                "price=" + price +
                ", engine='" + engine + '\'' +
                ", seat=" + seat +
                ", numWheels=" + numWheels +
                ", year=" + year +
                '}';
    }
}