import DAO.abstraction.Entities;
import DAO.impl.StudentImpl;
import bean.Student;
import jakarta.persistence.EntityTransaction;

public class Main {
    public static void main(String[] args) {
//        StudentImpl studentimpl = new StudentImpl();
//
//        Student student = studentimpl.findStudentById(1);
//        student.setSurname("Nacafov");
//        student.setName("Eli");
//
//        studentimpl.updateStudent(student);

        EntityTransaction entityTransaction = Entities.getEntities().getTransaction();
        entityTransaction.begin();
        Student student = Entities.getEntities().find(Student.class, 1);

        entityTransaction.commit();

        student.setSurname("Nacafov");
        student.setName("Eli");
        Entities.getEntities().persist(student);

        System.out.println( Entities.getEntities().find(Student.class, 1));


    }
}
