package com.home.MyfirstSpringApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyfirstSpringAppApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);

		Audi myCar = context.getBean("Audi", Audi.class);

		System.out.println(myCar.getCarBrand());
		System.out.println(myCar.getCarSpeed());
		System.out.println(myCar.playASong());
		System.out.println();

		Volkswagen myCar2 = context.getBean("Volks", Volkswagen.class);

		System.out.println(myCar2.getCarBrand());
		System.out.println(myCar2.getCarSpeed());
		System.out.println(myCar2.playASong());
		System.out.println();

		Audi myCar3 = context.getBean("AudiHappy", Audi.class);

		System.out.println(myCar3.getCarBrand());
		System.out.println(myCar3.getCarSpeed());
		System.out.println(myCar3.playASong());
		System.out.println();

		Volkswagen myCar4 = context.getBean("VolksHappy", Volkswagen.class);

		System.out.println(myCar4.getCarBrand());
		System.out.println(myCar4.getCarSpeed());
		System.out.println(myCar4.playASong());
		System.out.println();

	}

}