package DAO.impl;

import DAO.StudentDAO;
import DAO.abstraction.Entities;
import bean.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class StudentImpl extends Entities implements StudentDAO {
    @Override
    public Student findStudent() {
        EntityManager entity=Entities.getEntities();
        Student student= entity.find(Student.class, 1);
        EntityTransaction entityTransaction=entity.getTransaction();
        entityTransaction.begin();
        if (student!=null){
            System.out.println(student.toString());
        }
        entityTransaction.commit();
        entity.close();
        return student;
    }

    @Override
    public boolean createStudent(Student student) {

        return false;
    }

    @Override
    public Student updateStudent() {
        return null;
    }
}
