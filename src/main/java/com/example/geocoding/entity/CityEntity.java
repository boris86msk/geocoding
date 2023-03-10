package com.example.geocoding.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cities")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CityEntity {

    @Id
    @SequenceGenerator(name="citiesSequence", sequenceName="cities_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="citiesSequence")

    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String cityName;

}
