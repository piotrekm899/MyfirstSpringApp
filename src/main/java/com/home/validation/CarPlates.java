package com.home.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CarPlatesConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CarPlates {

    public String value() default "KR";

    public String message() default "must start with KR";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default{};


}
