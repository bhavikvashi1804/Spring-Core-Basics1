package com.bhv.app.config;


import com.bhv.app.model.Person;
import com.bhv.app.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {


    @Bean(name = "vehicle")
    Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW M5");
        return vehicle;
    }

    @Bean
    Vehicle vehicle1() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW M3");
        return vehicle;
    }

    @Bean
    @Primary
    Vehicle vehicle2() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Astin Martin DB12");
        return vehicle;
    }


    @Bean
    Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Joffers Kane");
        person.setVehicle(vehicle);
        return person;
    }

}
