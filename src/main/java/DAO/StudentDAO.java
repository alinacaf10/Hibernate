package DAO;

import bean.Student;

public interface StudentDAO {
    Student findStudentById(int id);

    boolean createStudent(Student student);

    Student updateStudent(Student student, String name, String surname);

    boolean removeStudent(int id);
}
