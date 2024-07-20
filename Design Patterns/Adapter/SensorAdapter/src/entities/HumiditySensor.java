package entities;

import interfaces.Sensor;

public class HumiditySensor implements Sensor {

  private Double humidity;

  public HumiditySensor(Double humidity) {
    this.humidity = humidity;
  }

  @Override
  public Double readValue() {
    return this.humidity;
  }
}
