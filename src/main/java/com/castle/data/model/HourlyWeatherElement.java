package com.castle.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
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
    @OneToOne(mappedBy = "hourlyWeatherElement")
    private WeatherDescription weatherDescription;
    private float probabilityOfPrecipitation;
    private float rainAmount;
    @ManyToOne
    private HourlyWeather hourlyWeather;
}
