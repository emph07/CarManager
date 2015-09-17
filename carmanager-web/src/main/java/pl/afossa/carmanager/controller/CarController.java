package pl.afossa.carmanager.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class CarController {

    @RequestMapping("car-manager/api/create/car")
    @ResponseBody
    public void createCar(){
        System.out.print(" -- Car Created ");
    }
}
