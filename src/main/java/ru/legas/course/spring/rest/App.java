package ru.legas.course.spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.legas.course.spring.rest.configuration.MyConfig;
import ru.legas.course.spring.rest.entity.Employee;

import java.util.List;

public class App {
    private static Communication communication;

    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        communication =
                context.getBean("communication", Communication.class);

//        System.out.println(getAllEmployees());

//        System.out.println(getEmployeesById(1));

        // add new employee
//        Employee employee = new Employee("Sveta", "Sokolova", "HR", 12000);
//        saveEmployee(employee);
//        System.out.println(getEmployeesById(employee.getId()));

        // update employee
//        employee.setId(11);
//        employee.setName("Vika");
//        saveEmployee(employee);
//        System.out.println(getEmployeesById(employee.getId()));

        // delete employee
        deleteEmployee(11);
    }

    private static List<Employee> getAllEmployees(){
        return communication.showAllEmployees();
    }

    private static Employee getEmployeesById(int id){
        return communication.getEmployee(id);
    }

    private static void saveEmployee(Employee employee){
        communication.saveEmployee(employee);
    }

    private static void deleteEmployee(int id){
        communication.deleteEmployee(id);
    }
}
