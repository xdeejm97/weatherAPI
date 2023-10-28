package com.git.weatherAPI.controller;

import com.git.weatherAPI.model.WeatherDto;
import com.git.weatherAPI.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {


    private final WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherDto getWeather(){
        return weatherService.getWeather();
    }
}
