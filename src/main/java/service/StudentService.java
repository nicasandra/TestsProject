package service;

import dao.StudentDao;
import model.Student;

/**
 * Created by nicasandra on 11/4/2016.
 */
public class StudentService {

    public StudentDao studentDao = new StudentDao();

    public StudentService() {
        Student s1 = new Student(0, "Popescu Andrei", 18, 450);
        Student s2 = new Student(1, "Ionescu Gabriel", 19, 460);
        Student s3 = new Student(2, "Ivanescu George", 21, 230);
        this.add(s1);
        this.add(s2);
        this.add(s3);
    }

    public Student add(Student s) {
        return studentDao.add(s);
    }

    public Student get(int id) {
        return studentDao.get(id);
    }
}
