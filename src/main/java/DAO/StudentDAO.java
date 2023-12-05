package DAO;

import bean.Student;

public interface StudentDAO {
    Student findStudentById(int id);

    boolean createStudent(Student student);

    Student updateStudent();
}
