package com.castle.data.repositories;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Getter
public class DataRepository implements IDataRepository {
    private final DailyWeatherRepository dailyWeatherRepository;
    private final HourlyWeatherRepository hourlyWeatherRepository;
    private final WeatherDescriptionRepository weatherDescriptionRepository;
    private final WeatherRepository weatherRepository;
}
//Instead of creating 'element' entities, mapper will map 'element' dto instances into normal instances