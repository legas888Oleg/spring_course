package ru.legas.spring.course.mvc_hibernate_aop.dao;

import ru.legas.spring.course.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
}
