package com.example.CadUser.cdi;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EntityManagerProducer {

    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
