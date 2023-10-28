package com.git.weatherAPI.service;

import com.git.weatherAPI.model.WeatherDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class WeatherService {

    private final String API_KEY = "3874cea9be38716ee2cd53300bc3b6c1";
    private final String WEATHER_URL = "https://api.openweathermap.org/data/2.5/";
    private RestTemplate restTemplate = new RestTemplate(); //pozwala zwrócić z JSON na obiekt javovy

    public WeatherDto getWeather(){
        String response = getWeatherForCity("warszawa");
        log.info(response);
        return null;
    }

    private String getWeatherForCity(String city) {
        return restTemplate.getForObject(WEATHER_URL + "weather?q={city}&appid={apiKey}&units=metric&lang=pl",
                String.class, city, API_KEY);
    }

}
