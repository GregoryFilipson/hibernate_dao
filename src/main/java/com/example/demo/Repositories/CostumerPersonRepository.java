package com.example.demo.Repositories;


import com.example.demo.Persons;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CostumerPersonRepository extends JpaRepository<Persons, Long> {
    List<Persons> findByCityOfLiving(String cityOfLiving);
    List<Persons> findByAgeLessThan(int lessThan, Sort sort);
    List<Persons> findByNameAndSurname(String name, String surname);
}
