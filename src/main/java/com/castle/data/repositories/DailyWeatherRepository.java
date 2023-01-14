package com.castle.data.repositories;

import com.castle.data.model.DailyWeather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyWeatherRepository extends JpaRepository<DailyWeather, Long> {
}
