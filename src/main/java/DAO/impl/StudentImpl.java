package DAO.impl;

import DAO.StudentDAO;
import DAO.abstraction.Entities;
import bean.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;



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

    public Student findById(Long id){
        Query query=entity.createNamedQuery("find student by id");
        query.setParameter("id",id);
        return (Student) query.getSingleResult();
    }
    public Student updateById(String name,Long id){
        entity.getTransaction().begin();
        Query query=entity.createQuery("Update Student set name = '"+name+"' where id = " + id);
        query.executeUpdate();
        entity.getTransaction().commit();

        return findById(id);
    }
    public void removeStudent(Long id){
        entity.getTransaction().begin();
        Query query=entity.createQuery("delete from Student where id = "+id);
        query.executeUpdate();
        entity.getTransaction().commit();

    }
    public void close(){
        entity.close();
    }
}
