package com.castle.data.repositories;

import com.castle.data.model.DailyWeatherElement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyWeatherElementRepository extends JpaRepository<DailyWeatherElement, Long> {
}
