package com.git.weatherAPI.webClient.weather;

import com.git.weatherAPI.model.WeatherDto;
import com.git.weatherAPI.webClient.dto.OpenWeatherWeatherDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherClient {

    private final String API_KEY = "3874cea9be38716ee2cd53300bc3b6c1";
    private final String WEATHER_URL = "https://api.openweathermap.org/data/2.5/";
    private RestTemplate restTemplate = new RestTemplate(); //pozwala zwrócić z JSON na obiekt javovy



    public WeatherDto getWeatherForCity(String city) {
        OpenWeatherWeatherDto openWeatherWeatherDto = restTemplate.getForObject(WEATHER_URL + "weather?q={city}&appid={apiKey}&units=metric&lang=pl",
                OpenWeatherWeatherDto.class, city, API_KEY);

        return WeatherDto.builder()
                .temperature(openWeatherWeatherDto.getMain().getTemp())
                .pressure(openWeatherWeatherDto.getMain().getPressure())
                .humidity(openWeatherWeatherDto.getMain().getHumidity())
                .speed(openWeatherWeatherDto.getWind().getSpeed())
                .build();
    }
}
