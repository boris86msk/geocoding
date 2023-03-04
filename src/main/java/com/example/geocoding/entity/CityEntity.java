package com.example.geocoding.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "test_city")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CityEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "city_name")
    private String cityName;

}
