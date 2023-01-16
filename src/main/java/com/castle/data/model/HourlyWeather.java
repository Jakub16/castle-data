package com.castle.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class HourlyWeather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long unixTime;
    private float temperature;
    private float perceivedTemperature;
    private int pressure;
    private int humidity;
    private float uvi;
    private int cloudiness;
    private float windSpeed;
    @OneToOne(mappedBy = "hourlyWeather")
    private WeatherDescription weatherDescription;
    private float probabilityOfPrecipitation;
    private float rainAmount;
}
