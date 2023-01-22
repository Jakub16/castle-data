package com.castle.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class HourlyWeather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long unixTimeOfForecast = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
    @OneToMany(mappedBy = "hourlyWeather")
    private List<HourlyWeatherElement> hourlyWeatherElements = new ArrayList<>();
}
