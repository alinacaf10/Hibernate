import DAO.impl.StudentImpl;
import bean.Student;

public class Main {
    public static void main(String[] args) {
        StudentImpl studentimpl = new StudentImpl();

        Student student=studentimpl.findStudentById(1);
        System.out.println("Before: "+studentimpl.findStudentById(1));

        studentimpl.updateStudent(student,"Ali","Ilhamoglu");

        System.out.println(studentimpl.findStudentById(1));

    }
}
