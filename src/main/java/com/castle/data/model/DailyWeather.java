package com.castle.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DailyWeather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long unixTime;
    private long sunrise;
    private long sunset;
    private float dayTemperature;
    private float minTemperature;
    private float maxTemperature;
    private float nightTemperature;
    private float eveningTemperature;
    private float morningTemperature;
    private float dayPerceivedTemperature;
    private float nightPerceivedTemperature;
    private float eveningPerceivedTemperature;
    private float morningPerceivedTemperature;
    private int pressure;
    private int humidity;
    private float windSpeed;
    @OneToOne(mappedBy = "dailyWeather")
    private WeatherDescription weatherDescription;
    private int cloudiness;
    private float probabilityOfPrecipitation;
    private float rainAmount;
    private float uvi;
}
