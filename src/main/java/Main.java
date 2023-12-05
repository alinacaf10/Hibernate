import DAO.abstraction.Entities;
import DAO.impl.StudentImpl;
import bean.Student;

public class Main {
    public static void main(String[] args) {
        StudentImpl studentimpl = new StudentImpl();


        Student student2=studentimpl.findStudentById(153);
        student2.setName("Ilham");
        student2.setSurname("Celil");
        studentimpl.updateStudent(student2);

        Entities.closeEntity();


    }
}
