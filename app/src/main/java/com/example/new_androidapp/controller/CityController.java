package com.example.new_androidapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CityController {

    @GetMapping("/api/cities")
    public List<String> getCities() {
        return Arrays.asList("Hà Nội", "Hồ Chí Minh", "Đà Nẵng", "Hải Phòng", "Cần Thơ");
    }
}
