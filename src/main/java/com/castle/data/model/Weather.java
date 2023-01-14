package com.castle.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private float latitude;
    private float longitude;
    private long unixTime;
    private long sunrise;
    private long sunset;
    private float temperature;
    private float perceivedTemperature;
    private int pressure;
    private int humidity;
    private int cloudiness;
    private float windSpeed;
    @OneToOne(mappedBy = "weather")
    private WeatherDescription weatherDescription;
}
