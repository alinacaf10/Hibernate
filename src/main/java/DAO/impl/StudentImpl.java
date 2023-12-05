package DAO.impl;

import DAO.StudentDAO;
import DAO.abstraction.Entities;
import bean.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class StudentImpl extends Entities implements StudentDAO {
    private final EntityManager entity = Entities.getEntities();

    @Override
    public Student findStudentById(int id) {
            Student student = entity.find(Student.class, id);
            EntityTransaction entityTransaction = entity.getTransaction();
            entityTransaction.begin();

            entityTransaction.commit();
        entity.close();
        return student;
    }

    @Override
    public boolean createStudent(Student student) {
        EntityTransaction entityTransaction = entity.getTransaction();

        entityTransaction.begin();

        entity.persist(student);

        entityTransaction.commit();

        entity.close();


        return true;
    }

    @Override
    public Student updateStudent() {
        return null;
    }
}
