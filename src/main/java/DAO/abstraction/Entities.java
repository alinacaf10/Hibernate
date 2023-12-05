package DAO.abstraction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public abstract class Entities {
    private static final String PERSISTENCE = "student_pu";
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    public static EntityManager getEntities() {

        entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE);
        entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }

    public static void closeEntity() {
        entityManagerFactory.close();
        entityManager.close();
    }
}
