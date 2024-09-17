package com.example.new_androidapp.controller;

import com.example.new_androidapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/api/weather/{city}")
    public Mono<String> getWeather(@PathVariable String city) {
        return weatherService.getWeatherForCity(city);
    }
}
