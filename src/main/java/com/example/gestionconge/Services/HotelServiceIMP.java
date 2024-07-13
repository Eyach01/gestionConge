package com.example.gestionconge.Services;

import com.example.gestionconge.Entities.Hotel;
import com.example.gestionconge.Repositories.HotelRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HotelServiceIMP implements IHotelService {

    private HotelRepository hotelRepository;

    @Override
    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel updateHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel retrieveHotel(Long id) {
        return hotelRepository.findById(id).orElse(null);
    }

    @Override
    public List<Hotel> retrieveAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public void deleteHotel(Long id) {
        hotelRepository.deleteById(id);

    }
}
