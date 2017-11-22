package com.home.MyfirstSpringApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:car.properties")
public class CarConfig {

    @Bean
    public RadioTuner sadSong(){
        return new SadSong();
    }

    @Bean
    public RadioTuner happySong(){
        return new HappySong();
    }

    @Bean
    public Car Audi(){
        return new Audi(sadSong());
    }

    @Bean
    public Car AudiHappy() {
        return new Audi(happySong());
    }

    @Bean
    public Car Volks() {
        return new Volkswagen(sadSong());
    }

    @Bean
    public Car VolksHappy() {
        return new Volkswagen(happySong());
    }

}
