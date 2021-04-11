package com.example.demo;

import com.example.demo.Repositories.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getListPersonByCity(String city) {
        return repository.getPersonsByCity(city);
    }

    @GetMapping("/persons/by-age")
    public List<Persons> getListPersonsByAge(int age) {
        return repository.getPersonsByAge(age);
    }

    @GetMapping("/persons/by-name-and-surname")
    public List<Persons> getListPersonsByNameAndSurname(String name, String surname) {
        return repository.getPersonsByNameAndSurname(name, surname);
    }
}
