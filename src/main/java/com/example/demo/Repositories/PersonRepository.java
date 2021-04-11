package com.example.demo.Repositories;


import com.example.demo.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class PersonRepository {

    private final CostumerPersonRepository personRepository;

    @Autowired
    public PersonRepository(CostumerPersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Persons> getPersonsByCity(String city) {
        return personRepository.findByCityOfLiving(city);
    }

    public List<Persons> getPersonsByAge(int age) {
        return personRepository.findByAgeLessThan(age, Sort.by(Sort.Direction.ASC, "age"));
    }

    public List<Persons> getPersonsByNameAndSurname(String name, String surname){
        return personRepository.findByNameAndSurname(name, surname);
    }
}

