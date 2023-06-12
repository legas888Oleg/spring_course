package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void  addStudent(){
        Student st1 = new Student("Oleg Kolpakov", 3, 4.5);
        Student st2 = new Student("Ivan Sorokin", 2, 3.7);
        Student st3 = new Student("Nikita Routov", 3, 4.8);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents()");

        System.out.println(students.get(3));

        System.out.println("Information from method getStudents():");
        System.out.println(students);
        return students;
    }
}
