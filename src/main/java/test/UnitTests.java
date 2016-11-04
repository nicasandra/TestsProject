package test;

import model.Student;
import org.junit.Test;
import service.StudentService;

import static org.junit.Assert.*;

/**
 * Created by nicasandra on 11/4/2016.
 */
public class UnitTests {

    StudentService service = new StudentService();

    @Test
    public void testGet() {
        Student s = service.get(0);
        assertEquals(s.getId(), 0);
    }

    @Test
    public void testAdd() {
        Student s = new Student(6, "Popescu Marius", 22, 500);
        assertSame(service.add(s), s);
    }

    @Test
    public void ageBound() {
        try {
            Student s = new Student(7, "Ionescu Vasile", 44, 600);
            fail("Bounds needed to age!");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test
    public void scholarshipBound() {
        try {
            Student s = new Student(8, "Popescu Alex", 18, 150);
            fail("Bounds needed to scholarship!");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test
    public void scholarshipSetter() {
        try {
            Student s = new Student();
            s.setScholarship(160);
            fail("Bounds needed to setScholarship()!");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test
    public void ageSetter() {
        try {
            Student s = new Student();
            s.setAge(15);
            fail("Bounds needed to setAge()!");
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test
    public void netScholarship() {
        assertEquals(Student.netScholarship(200), 150, 0.1);
    }

}
