package DAO;

import bean.Student;

public interface StudentDAO {
    Student findStudentById(int id);

    Student createStudent(Student student);

    Student updateStudent(Student student);

    void removeStudent(int id);
    void close();
}
