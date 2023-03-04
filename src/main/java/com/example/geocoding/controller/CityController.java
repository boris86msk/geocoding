package com.example.geocoding.controller;

import com.example.geocoding.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("city_search")
    public String getCity(@RequestParam String latitude, String longitude) {
        return cityService.getCity(latitude, longitude);
    }
}
//"55.80101", "37.96051"