package com.castle.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class WeatherDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String mainDescription;
    private String description;
    private String icon;
    @OneToOne
    private Weather weather;
    @OneToOne
    private DailyWeatherElement dailyWeatherElement;
    @OneToOne
    private HourlyWeatherElement hourlyWeatherElement;
}
