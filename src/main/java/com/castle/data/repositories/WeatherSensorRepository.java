package com.castle.data.repositories;

import com.castle.data.model.WeatherSensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherSensorRepository extends JpaRepository<WeatherSensor, Long> {
    WeatherSensor findFirstByOrderByUnixTimeDesc();
}
