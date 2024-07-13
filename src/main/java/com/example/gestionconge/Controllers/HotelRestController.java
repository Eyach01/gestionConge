package com.example.gestionconge.Controllers;

import com.example.gestionconge.Entities.Hotel;
import com.example.gestionconge.Services.IHotelService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
public class HotelRestController {

    private IHotelService hotelService;
    @CrossOrigin(origins = "http://localhost:4200/")
    @PostMapping("/addHotel")
    public Hotel addHotel(@RequestBody Hotel hotel) {
        return hotelService.addHotel(hotel);
    }
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping("/all")
    public List<Hotel> getAllHotels() {
        return hotelService.retrieveAllHotels();
    }

    @CrossOrigin(origins = "http://localhost:4200/")
    @PutMapping("/update")
    public Hotel updateHotel(@RequestBody Hotel hotel) {
        return hotelService.updateHotel(hotel);
    }
    @CrossOrigin(origins = "http://localhost:4200/")
    @GetMapping("/get/{id}")
    public Hotel getById(@PathVariable("id") Long hotelId) {
        return hotelService.retrieveHotel(hotelId);
    }

    @CrossOrigin(origins = "http://localhost:4200/")
    @DeleteMapping("/delete/{id}")
    public void deleteHotel(@PathVariable("id") Long hotelId) {
        hotelService.deleteHotel(hotelId);
    }

}
