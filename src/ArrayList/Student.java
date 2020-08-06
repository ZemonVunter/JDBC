package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private  String classes;
    private double grade;

    public Student(String name, String classes, double grade) {
        this.name = name;
        this.classes = classes;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", grade=" + grade +
                '}';
    }

    public static void main(String[] args) {
        Student student=new Student("zhengfan","huojian2",15.9);
        Student student2=new Student("gaobo","huojian2",91);
        List<Student> list=new ArrayList<>();
        list.add(student);
        list.add(student2);
        System.out.println(list);


    }
}
