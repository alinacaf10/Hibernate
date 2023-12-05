package DAO;

import bean.Student;

public interface StudentDAO {
    public  Student findStudentById(int id);
    public boolean createStudent(Student student);
    public Student updateStudent();
}
