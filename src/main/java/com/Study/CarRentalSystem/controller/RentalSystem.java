package com.Study.CarRentalSystem.controller;


import com.Study.CarRentalSystem.dto.reservationDto;
import com.Study.CarRentalSystem.models.Car;
import com.Study.CarRentalSystem.models.Reservation;
import com.Study.CarRentalSystem.service.CarBookingImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("service")
public class RentalSystem {
    @Autowired
    private CarBookingImplementation carBookingImplementation;

    public RentalSystem(CarBookingImplementation carBookingImplementation) {
        this.carBookingImplementation = carBookingImplementation;
    }

    @GetMapping("/AvailableCars")
    public List<Car> getAvailableCar(){
        List<Car> car=carBookingImplementation.getAvailableVehicles();
        return car;
    }

    @GetMapping("/{id}")
    public Optional<Car> getCarById(@PathVariable("id") Long id){
        Optional<Car> car=carBookingImplementation.getCarById(id);
        return car;


    }

    @PostMapping("/reserve")
    public String reserveCar(@RequestBody Reservation reservation){
        return carBookingImplementation.reserveCar(reservation);

    }

}
