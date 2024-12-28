package com.Study.CarRentalSystem.service;

import com.Study.CarRentalSystem.dto.reservationDto;
import com.Study.CarRentalSystem.models.Car;
import com.Study.CarRentalSystem.models.Reservation;
import com.Study.CarRentalSystem.repository.CarRepository;
import com.Study.CarRentalSystem.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CarRentalService {

    List<Car> getAvailableVehicles();

    Optional<Car> getCarById(Long id);

    String reserveCar(Reservation reservation);


}
