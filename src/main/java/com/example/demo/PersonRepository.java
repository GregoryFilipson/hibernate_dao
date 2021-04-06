package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@Transactional
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public PersonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List <Persons> getPersonsByCity(String city) {
        TypedQuery<Persons> query = entityManager.createQuery
                ("select Persons from Persons p where p.cityOfLiving =:city",
                        Persons.class);
        query.setParameter("city", city);
        return query.getResultList().stream().collect(Collectors.toList());
    }
}
