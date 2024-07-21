package entities;

import interfaces.Sensor;

public class TemperatureSensor implements Sensor {

  private Double temperatura;

  public TemperatureSensor(Double temp) {
    this.temperatura = temp;
  }

  @Override
  public Double readValue() {
    return this.temperatura;
  }
}