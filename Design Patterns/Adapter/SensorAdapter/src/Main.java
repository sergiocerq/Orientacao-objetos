import adapter.TextualInformation;
import entities.HumiditySensor;
import entities.LuminositySensor;
import entities.TemperatureSensor;
import interfaces.Sensor;
import interfaces.SensorInformation;

public class Main {

  public void run() {
    Sensor sensor = new LuminositySensor(12.82);
    SensorInformation mySensor = new TextualInformation(sensor);
    System.out.println("Luminosity: " + mySensor.getStatus());
    sensor = new HumiditySensor(36.65);
    mySensor.changeSensor(sensor);
    System.out.println("Humidity: " + mySensor.getStatus());
    sensor = new TemperatureSensor(25.04);
    mySensor.changeSensor(sensor);
    System.out.println("Temperature: " + mySensor.getStatus());
  }

  public static void main(String[] args) {
    (new Main()).run();
  }
}