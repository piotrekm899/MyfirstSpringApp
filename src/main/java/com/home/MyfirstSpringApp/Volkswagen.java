package com.home.MyfirstSpringApp;

import org.springframework.beans.factory.annotation.Value;

public class Volkswagen implements Car {

    @Value("${my.car2}")
    private String carBrand;

    private RadioTuner radio;

    @Value("${my.speed2}")
    private String carSpeed;

    public Volkswagen(RadioTuner radio) {
        this.radio = radio;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarSpeed() {
        return carSpeed;
    }

    @Override
    public String playASong() {
        return radio.playSong();
    }
}
