package dao;

import model.Student;

import java.util.ArrayList;

/**
 * Created by nicasandra on 11/4/2016.
 */
public class StudentDao {
    ArrayList<Student> studList = new ArrayList();

    public Student add(Student s) {
        studList.add(s);
        return s;
    }

    public Student get(int id) {
        for (Student std : studList) {
            if (std.getId() == id) {
                return std;
            }
        }
        return null;
    }
}
