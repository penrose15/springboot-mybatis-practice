package com.example.mybatisPractice.controller;

import com.example.mybatisPractice.domain.City;
import com.example.mybatisPractice.mapper.CityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cities")
@RestController
@RequiredArgsConstructor
public class CityController {
    private final CityMapper cityMapper;

    @GetMapping("/{state}")
    City getCity(@PathVariable("state") String state) {
        return cityMapper.findByState(state);
    }
}
