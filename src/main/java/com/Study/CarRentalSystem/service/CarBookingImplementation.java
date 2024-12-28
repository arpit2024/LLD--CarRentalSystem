package com.Study.CarRentalSystem.service;

import com.Study.CarRentalSystem.dto.reservationDto;
import com.Study.CarRentalSystem.models.Car;
import com.Study.CarRentalSystem.models.Reservation;
import com.Study.CarRentalSystem.repository.CarRepository;
import com.Study.CarRentalSystem.repository.CustomerRepository;
import com.Study.CarRentalSystem.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarBookingImplementation {

    private CarRepository carRepository;
    private CustomerRepository customerRepository;

    public CarBookingImplementation(CarRepository carRepository, CustomerRepository customerRepository, ReservationRepository reservationRepository) {
        this.carRepository = carRepository;
        this.customerRepository = customerRepository;
        this.reservationRepository = reservationRepository;
    }

    private ReservationRepository reservationRepository;


    public List<Car> getAvailableVehicles(){
        List<Car> carList=carRepository.findAll();

        return carList;
    }

    public Optional<Car> getCarById(Long id){
        Optional<Car> car=carRepository.findById(id);

        return car;
    }

    public String reserveCar(Reservation reservation){
        Optional<Car> carOptional=carRepository.findById(reservation.getCarId());
        if(carOptional.isPresent() && carOptional.get().isAvailable()){
            Car car=carOptional.get();
            car.setAvailable(false);
            carRepository.save(car);
            reservationRepository.save(reservation);
            return("Reservation Successfull");
        }
        else{
            return("car not Available");
        }

    }

}
