import DAO.impl.StudentImpl;

public class Main {
    public static void main(String[] args) {
        StudentImpl studentimpl = new StudentImpl();

        studentimpl.findSurnames().forEach(System.out::println);


    }
}
