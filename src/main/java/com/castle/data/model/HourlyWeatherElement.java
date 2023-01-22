package com.castle.data.model;

import jakarta.persistence.*;
import lombok.Setter;

@Entity
@Setter
public class HourlyWeatherElement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
    @ManyToOne
    private HourlyWeather hourlyWeather;
}
