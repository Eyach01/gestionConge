package com.example.gestionconge.Services;

import com.example.gestionconge.Entities.Hotel;
import java.util.List;

public interface IHotelService {
   public Hotel addHotel(Hotel hotel);

    public Hotel updateHotel(Hotel hotel);

    public Hotel retrieveHotel(Long hotelId);

    public List<Hotel> retrieveAllHotels();

    public void deleteHotel(Long hotelId);
}
