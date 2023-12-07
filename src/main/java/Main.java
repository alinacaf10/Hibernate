import DAO.impl.StudentImpl;
import bean.Student;

public class Main {
    public static void main(String[] args) {
        StudentImpl studentimpl = new StudentImpl();
        Student student = new Student();
        student.setName("Farhad");
        student.setSurname("Ilham");
        studentimpl.createStudent(student);

        System.out.println(studentimpl.findById(student.getId()));

    }
}
