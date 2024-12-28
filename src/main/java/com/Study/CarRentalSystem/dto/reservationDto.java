package com.Study.CarRentalSystem.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class reservationDto {
    private Long customerId;
    private Long carId;
    private String startDate;
    private String endDate;
    private Double totalPrice;
}
