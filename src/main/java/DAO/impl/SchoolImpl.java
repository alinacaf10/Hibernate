package DAO.impl;

import DAO.SchoolDAO;
import DAO.abstraction.Entities;
import bean.School;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;


public class SchoolImpl extends Entities implements SchoolDAO {

    private  EntityManager entity = Entities.getEntities("student_pu");

    public SchoolImpl(String persistence) {
    entity=getEntities(persistence);
    }

    public SchoolImpl() {
    }

    @Override
    public School findSchoolById(int id) {
        return entity.find(School.class, id);
    }

    @Override
    public School createSchool(School school) {
        entity.getTransaction().begin();
        entity.persist(school);
        entity.getTransaction().commit();
        return school;
    }

    @Override
    public School updateSchool(School school) {
        School SchoolUpdated = findSchoolById(school.getId().intValue());
        entity.getTransaction().begin();
        SchoolUpdated.setName(school.getName());
        SchoolUpdated.setCity(school.getCity());
        entity.getTransaction().commit();
        return SchoolUpdated;
    }

    @Override
    public void removeSchool(int id) {
        entity.getTransaction().begin();
        entity.remove(findSchoolById(id));
        entity.getTransaction().commit();
    }


    public School updateById(String name,Long id){
        entity.getTransaction().begin();
        Query query=entity.createQuery("Update School set name = '"+name+"' where id = " + id);
        query.executeUpdate();
        entity.getTransaction().commit();

        return findSchoolById(id.intValue());
    }
    public void removeSchool(Long id){
        entity.getTransaction().begin();
        Query query=entity.createQuery("delete from School where id = "+id);
        query.executeUpdate();
        entity.getTransaction().commit();

    }
    public void close(){
        entity.close();
    }
}
