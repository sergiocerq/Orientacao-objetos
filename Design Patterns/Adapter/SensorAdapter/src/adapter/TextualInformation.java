package adapter;

import interfaces.Sensor;
import interfaces.SensorInformation;

public class TextualInformation implements SensorInformation {

  private Sensor sensor;

  public TextualInformation(Sensor sensor) {
    this.sensor = sensor;
  }

  @Override
  public String getStatus() {
    return this.sensor.readValue() + "";
  }

  public void changeSensor(Sensor newSensor) {
    this.sensor = newSensor;
  }

}