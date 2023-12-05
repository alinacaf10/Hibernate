import DAO.abstraction.Entities;
import DAO.impl.StudentImpl;

public class Main {
    public static void main(String[] args) {
        StudentImpl studentimpl = new StudentImpl();

        studentimpl.updateStudent(studentimpl.findStudentById(1), "Farhad", "Nacafov");
        System.out.println(studentimpl.findStudentById(1));
        Entities.closeEntity();


    }
}
