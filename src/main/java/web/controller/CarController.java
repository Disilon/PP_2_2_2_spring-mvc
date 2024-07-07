package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private CarService carService;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "5") int count,
                          ModelMap model) {
        CarService carService = new CarService();
        List<Car> cars = carService.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
