package com.home.MyfirstSpringApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class carsController {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);

    Audi sadAudi = context.getBean("Audi", Audi.class);
    Audi happyAudi = context.getBean("AudiHappy", Audi.class);
    Volkswagen sadVolks = context.getBean("Volks", Volkswagen.class);
    Volkswagen happyVolks = context.getBean("VolksHappy", Volkswagen.class);


}
