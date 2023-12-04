package DAO.abstraction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public abstract class Entities {
    private static String PERSISTENCE="student_pu";
    public static EntityManager getEntities(){

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory(PERSISTENCE);
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        return entityManager;
    }
}
