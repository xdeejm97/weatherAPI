package com.git.weatherAPI.model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Builder
public class WeatherDto {

    private float temperature;
    private int pressure;
    private int humidity;
    private float speed;
}
