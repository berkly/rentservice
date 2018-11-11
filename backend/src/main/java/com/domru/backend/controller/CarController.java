package com.domru.backend.controller;

import com.domru.backend.domain.Car;
import com.domru.backend.domain.User;
import com.domru.backend.repository.CarRepository;
import com.domru.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/cars")
    public Iterable<Car> getCars() {
        return carRepository.findAll();
    }

    @GetMapping("/{username}/cars")
    public Iterable<Car> getCarsByUsername(@PathVariable String username) {
        User user = userRepository.findUserByUsername(username);
        return user.getRentedCars();
    }
}
