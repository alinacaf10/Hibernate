import DAO.StudentDAO;
import DAO.abstraction.Entities;
import bean.Student;

public class FindStudent  {
    public  Student findStudent(){
        Student student= Entities.getEntities().find(Student.class, 1);

        if (student!=null){
            System.out.println(student.toString());
        }
        return student;
    }



}
