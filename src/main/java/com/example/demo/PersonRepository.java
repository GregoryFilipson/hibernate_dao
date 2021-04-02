package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public PersonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Persons getPersonsByCity(String sity) {
        TypedQuery<Persons> query = entityManager.createQuery
                ("select Persons from Persons p where p.cityOfLiving =:sity",
                        Persons.class);
        query.setParameter("sity", sity);
        return query.getResultList().stream().findAny().orElse(null);
    }
}