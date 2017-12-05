package com.home.MyfirstSpringApp;

import com.home.validation.CarPlates;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;

import javax.validation.constraints.*;
import java.util.Map;

public class Respondent {

    @NotNull(message = "this field is required")
    @Size(min=1)
    private String name;

    @NotNull(message = "this field is required")
    @Size(min=1)
    private String lastName;

    @Pattern(regexp = "\\d{2}-\\d{3}", message = "please enter the postal code in XX-XXX format")
    private String postalCode;

    @Min(value = 1, message = "Age must be between 1 and 99")
    @Max(value = 99, message = "Age must be between 1 and 99")
    private Integer age;

    @CarPlates
    private String carPlates;

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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCarPlates() {
        return carPlates;
    }

    public void setCarPlates(String carPlates) {
        this.carPlates = carPlates;
    }
}
