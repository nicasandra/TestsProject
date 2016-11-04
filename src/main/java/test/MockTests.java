package test;

import model.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import service.StudentService;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by nicasandra on 11/4/2016.
 */
public class MockTests {

    @Mock
    StudentService service = new StudentService();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getTest() {
        Student s = new Student(10, "George", 20, 2500);
        when(service.get(10)).thenReturn(s);

        Assert.assertEquals(service.get(10).getName(), s.getName());
    }

    @Test
    public void callTest() {
        Student s = new Student(10, "George", 20, 2500);
        Student newS = service.get(10);

        verify(service, times(1)).get(10);
    }

    @Test
    public void addTest(){
        Student s = new Student(10, "George", 20, 2500);
        when(service.add(s)).thenReturn(s);

        Assert.assertSame(s, service.add(s));
    }
}
