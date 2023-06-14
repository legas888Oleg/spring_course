package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Department department = new Department("HR", 500,1500);
//
//            Employee emp1 = new Employee("Eva", "Kolpakova", 900);
//            Employee emp2 = new Employee("Elena", "Ivanova", 1200);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//
//            session.persist(department);

            Department department = session.get(Department.class, 2);
//
//            System.out.println(department);
//            System.out.println(department.getEmployees());

//            Employee emp = session.get(Employee.class, 2);
//            session.remove(emp);
            session.remove(department);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
