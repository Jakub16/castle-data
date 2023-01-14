package com.castle.data.repositories;

import com.castle.data.model.WeatherDescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherDescriptionRepository extends JpaRepository<WeatherDescription, Long> {
}
