package DAO.abstraction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public abstract class Entities {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    public static EntityManager getEntities(String persistence) {

        entityManagerFactory = Persistence.createEntityManagerFactory(persistence);
        entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }


}
