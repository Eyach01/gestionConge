package com.example.gestionconge.Repositories;

import com.example.gestionconge.Entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface HotelRepository extends JpaRepository <Hotel,Long> {

    List<Hotel> findByAvailableFromLessThanEqualAndAvailableToGreaterThanEqual(LocalDate startDate, LocalDate endDate);

}
