package com.example.geocoding.controller;

import com.example.geocoding.entity.CityEntity;
import com.example.geocoding.entity.HotelEntity;
import com.example.geocoding.repository.CitiesRepository;
import com.example.geocoding.repository.HotelRepository;
import com.example.geocoding.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;
    @Autowired
    private CitiesRepository citiesRepository;
    @Autowired
    private HotelRepository hotelRepository;


    @GetMapping("/star")
    public List<HotelEntity> getStar() {
        return hotelRepository.starHotel();
    }

    @GetMapping("/all_citi")
    public CityEntity getCities(@RequestParam String name) {
        return citiesRepository.findByCityName(name);
    }

    @GetMapping("/hotel_search")
    public List<HotelEntity> getHotel(@RequestParam String latitude, String longitude) {
        String cityName = cityService.getCity(latitude, longitude);
        return hotelRepository.hotelInCity(cityName);
    }
}
//"55.80101", "37.96051"