package com.castle.data.repositories;

import com.castle.data.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WeatherRepository extends JpaRepository<Weather, Long> {
    Weather findFirstByOrderByUnixTimeDesc();
}
