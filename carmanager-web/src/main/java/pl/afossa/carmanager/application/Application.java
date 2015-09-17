package pl.afossa.carmanager.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import pl.afossa.carmanager.controller.CarController;

@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CarController.class, args);
    }

}
