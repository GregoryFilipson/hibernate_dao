package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CityController {
    private final PersonRepository repository;

    public CityController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public Persons getListProductName(String sity) throws IOException {
        return repository.getPersonsByCity(sity);
    }
}
