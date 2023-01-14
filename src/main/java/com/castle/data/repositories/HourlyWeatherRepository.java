package com.castle.data.repositories;

import com.castle.data.model.HourlyWeather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HourlyWeatherRepository extends JpaRepository<HourlyWeather, Long> {
}
