package com.Study.CarRentalSystem.repository;

import com.Study.CarRentalSystem.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
