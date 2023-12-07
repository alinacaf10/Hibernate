package DAO.impl;

import DAO.StudentDAO;
import DAO.abstraction.Entities;
import bean.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;


public class StudentImpl extends Entities implements StudentDAO {

    private  EntityManager entity = Entities.getEntities("student_pu");

    public StudentImpl(String persistence) {
    entity=getEntities(persistence);
    }

    public StudentImpl() {
    }

    @Override
    public Student findStudentById(int id) {
        return entity.find(Student.class, id);
    }

    @Override
    public Student createStudent(Student student) {
        entity.getTransaction().begin();
        entity.persist(student);
        entity.getTransaction().commit();
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        Student studentUpdated = findStudentById(student.getId().intValue());
        entity.getTransaction().begin();
        studentUpdated.setName(student.getName());
        studentUpdated.setSurname(student.getSurname());
        entity.getTransaction().commit();
        return studentUpdated;
    }

    @Override
    public void removeStudent(int id) {
        entity.getTransaction().begin();
        entity.remove(findStudentById(id));
        entity.getTransaction().commit();
    }

    public List<String> findSurnames(){
    entity.getTransaction().begin();
    Query query =   entity.createQuery("select surname from Student");
    entity.getTransaction().commit();
    return query.getResultList();
    }
    public void close(){
        entity.close();
    }
}
