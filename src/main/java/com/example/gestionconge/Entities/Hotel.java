package com.example.gestionconge.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private int availableRooms;
    private double pricePerNight;
    private LocalDate availableFrom;
    private LocalDate availableTo;
    private boolean partner;
}
