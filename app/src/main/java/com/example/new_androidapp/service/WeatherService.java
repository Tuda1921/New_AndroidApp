package com.example.new_androidapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {

    private final WebClient webClient;

    @Value("${api.openweathermap.key}")
    private String apiKey;

    public WeatherService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.openweathermap.org").build();
    }

    public Mono<String> getWeatherForCity(String city) {
        return this.webClient.get()
                .uri("/data/2.5/weather?q={city}&appid={apiKey}&units=metric", city, apiKey)
                .retrieve()
                .bodyToMono(String.class);
    }
}
