package com.home.MyfirstSpringApp;

import org.springframework.beans.factory.annotation.Value;

import java.util.Map;

public class Respondent {

    private String name;
    private String lastName;
    private String DrivingLicence;
    private String favouriteCar;
    private String countryFile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDrivingLicence() {
        return DrivingLicence;
    }

    public void setDrivingLicence(String drivingLicence) {
        DrivingLicence = drivingLicence;
    }

    public String getFavouriteCar() {
        return favouriteCar;
    }

    public void setFavouriteCar(String favouriteCar) {
        this.favouriteCar = favouriteCar;
    }

    public String getCountryFile() {
        return countryFile;
    }

    public void setCountryFile(String countryFile) {
        this.countryFile = countryFile;
    }
}
