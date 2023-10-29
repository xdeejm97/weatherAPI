package com.git.weatherAPI.service;

import com.git.weatherAPI.model.WeatherDto;
import com.git.weatherAPI.webClient.weather.WeatherClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherService {

    private final WeatherClient weatherClient;
    public WeatherDto getWeather(){
        return weatherClient.getWeatherForCity("warszawa");
    }



}
