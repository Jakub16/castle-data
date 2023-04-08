package com.castle.data.repositories;

public interface IDataRepository {
    DailyWeatherRepository getDailyWeatherRepository();
    HourlyWeatherRepository getHourlyWeatherRepository();
    WeatherRepository getWeatherRepository();
    WeatherDescriptionRepository getWeatherDescriptionRepository();
    HourlyWeatherElementRepository getHourlyWeatherElementRepository();
    DailyWeatherElementRepository getDailyWeatherElementRepository();
    WeatherSensorRepository getWeatherSensorRepository();
}
