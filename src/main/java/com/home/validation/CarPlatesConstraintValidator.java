package com.home.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CarPlatesConstraintValidator implements ConstraintValidator<CarPlates,String> {

    private String carPlates;

    @Override
    public void initialize(CarPlates constraintAnnotation) {
        carPlates = constraintAnnotation.value();

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;

        if(s != null) {
            result = s.startsWith(carPlates);
        }
        else {
            result = true;
        }

        return result;
    }
}
