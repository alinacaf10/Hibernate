package DAO.impl;

import bean.Student;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentImplTest {
    private static StudentImpl studentImpl;

    @BeforeAll
    static void beforeAll() {
        studentImpl = new StudentImpl("student_pu_test");
    }

    @AfterAll
    static void afterAll() {
        studentImpl.close();
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findStudentById() {
        Student student = new Student();
        student.setName("Ali");
        student.setSurname("Nacaf1");

        studentImpl.createStudent(student);

        student = studentImpl.findStudentById(student.getId().intValue());

        assertNotNull(student);

        assertNotNull(student.getId());

        assertEquals("Nacaf1", student.getSurname());
    }

    @Test
    void createStudent() {
        Student student = new Student();
        student.setName("Ali");
        student.setSurname("Nacaf1");
        studentImpl.createStudent(student);
        assertNotNull(student.getId());
        assertTrue(student.getId() != null);
    }

    @Test
    void updateStudent() {
        Student student = new Student();
        student.setName("Ali");
        student.setSurname("Nacaf1");

        student = studentImpl.createStudent(student);

        student.setSurname("Nacafov");

        student = studentImpl.updateStudent(student);
        assertNotNull(student);
        assertEquals("Ali",student.getName());
        assertEquals("Nacafov",student.getSurname());

    }

    @Test
    void removeStudent() {
        Student student = new Student();
        student.setName("Ali");
        student.setSurname("Nacaf1");

        student = studentImpl.createStudent(student);
        studentImpl.removeStudent(student.getId().intValue());
        student= studentImpl.findStudentById(student.getId().intValue());
        assertNull(student);

    }
}