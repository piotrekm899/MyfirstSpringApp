package com.home.MyfirstSpringApp;

import org.springframework.beans.factory.annotation.Value;

public class Audi implements Car{

    private RadioTuner radio;

    @Value("${my.car}")
    private String carBrand;

    @Value("${my.speed}")
    private String carSpeed;


    public Audi(RadioTuner song) {
        this.radio = song;
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
