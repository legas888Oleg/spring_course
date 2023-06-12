package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents()");
//        System.out.println("-----------------------------------------------------------------------------------------------");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void AfterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        firstStudent.setNameSurname("Mr. " + firstStudent.getNameSurname());
//        firstStudent.setAvgGrade(firstStudent.getAvgGrade() + 1);
//
//        System.out.println("AfterReturningGetStudentsLoggingAdvice: логируем получение списка студентов  после метода getStudents()");
//        System.out.println("-------------------------------------------------------------------------------------------------------");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void AfterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("AfterThrowingGetStudentsLoggingAdvice: логируем выброс исключения " + exception);
//    }

    @After("execution(* getStudents())")
    public void AfterGetStudentsLoggingAdvice(){
        System.out.println("AfterGetStudentsLoggingAdvice: логируем нормальное окончание метода getStudents() или выброс исключения");
    }
}
