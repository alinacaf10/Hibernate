import DAO.SchoolDAO;
import DAO.StudentDAO;
import DAO.impl.SchoolImpl;
import DAO.impl.StudentImpl;
import bean.School;
import bean.Student;

public class Main {
    public static void main(String[] args) {
        StudentImpl studentimpl = new StudentImpl();

        SchoolDAO schoolDAO=new SchoolImpl();
        Student student=new Student();
        student.setName("Ali");
        student.setSurname("Ilham");
        studentimpl.createStudent(student);
//        School school=new School();
//        school.setName("68");
//        school.setCity("Baku");
//        schoolDAO.createSchool(school);

        studentimpl.addSchool(student.getId(),schoolDAO.findSchoolById(1));
        System.out.println(student);

    }
}
