package com.example.geocoding.repository;

import com.example.geocoding.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitiesRepository extends JpaRepository<CityEntity, Long> {
        CityEntity findByCityName(String Name);

}
