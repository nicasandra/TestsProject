package model;

/**
 * Created by nicasandra on 11/4/2016.
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private double scholarship;

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        if (scholarship < 200) {
            throw new IllegalArgumentException("Wrong scholarship!");
        }
        this.scholarship = scholarship;
    }

    public Student() {
    }

    public Student(int id, String name, int age, double scholarship) {
        this.id = id;
        this.name = name;
        if (age < 18 || age > 30) {
            throw new IllegalArgumentException("Invalid age!");
        }
        this.age = age;
        if (scholarship < 200) {
            throw new IllegalArgumentException("Wrong scholarship!");
        }
        this.scholarship = scholarship;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 18 || age > 30) {
            throw new IllegalArgumentException("Invalid age!");
        }
        this.age = age;
    }

    public static double netScholarship(double scholarship) {
        double fee = 50;
        return scholarship - fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
