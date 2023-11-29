import bean.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FindStudent {
    public static void main(String[] args) {

    EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("student_pu");
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();

        Student student=entityManager.find(Student.class, 1);

        if (student!=null){
            System.out.println(student.toString());
        }
    }
}
