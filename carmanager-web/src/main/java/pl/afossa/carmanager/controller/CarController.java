package pl.afossa.carmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.afossa.carmanager.domain.Car;
import pl.afossa.carmanager.domain.CarRepository;

@Controller
@EnableAutoConfiguration
public class CarController {

    private final CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @RequestMapping("car-manager/api/create/car")
    @ResponseBody
    public void createCar(){
        Car car = new Car();
        car.setBrand("Mazda");
        car.setModel("6 Kombi Sport");
        car.setEngineCapacity(2500);
        carRepository.save(car);
    }
}
