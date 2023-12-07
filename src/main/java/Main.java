import DAO.impl.StudentImpl;
import bean.Student;

public class Main {
    public static void main(String[] args) {
        StudentImpl studentimpl = new StudentImpl();


        System.out.println(studentimpl.findById(52L));

    }
}
