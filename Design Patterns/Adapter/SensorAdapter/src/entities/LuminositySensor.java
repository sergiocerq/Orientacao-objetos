package entities;

import interfaces.Sensor;

public class LuminositySensor implements Sensor {

  private Double luminosity;

  public LuminositySensor(Double luminosity) {
    this.luminosity = luminosity;
  }

  @Override
  public Double readValue() {
    return this.luminosity;
  }
}
