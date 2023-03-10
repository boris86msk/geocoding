package com.example.geocoding.repository;

import com.example.geocoding.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HotelRepository extends JpaRepository<HotelEntity, Long> {

    @Query("SELECT he FROM HotelEntity he WHERE he.stars > 3")
    List<HotelEntity> starHotel();

    @Query("SELECT he FROM HotelEntity he inner join CityEntity" +
            " AS ce ON he.citiesId = ce.id WHERE ce.cityName = :city")
    List<HotelEntity> hotelInCity(String city);
}
