package com.castle.data.repositories;

import com.castle.data.model.HourlyWeatherElement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HourlyWeatherElementRepository extends JpaRepository<HourlyWeatherElement, Long> {
}
