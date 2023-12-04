package DAO;

import bean.Student;

public interface StudentDAO {
    public  Student findStudent();
    public boolean createStudent(Student student);
    public Student updateStudent();
}
