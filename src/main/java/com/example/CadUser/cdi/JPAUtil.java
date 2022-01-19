package com.example.CadUser.cdi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;

public class JPAUtil {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("testePU");

    public static EntityManager getEmf() {
        return emf.createEntityManager();
    }
}
