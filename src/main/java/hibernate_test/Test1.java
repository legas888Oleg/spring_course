package hibernate_test;

import hibernate_test.entity.Detail;
import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            Employee employee = new Employee("Slava", "Nikolaev", "Salary", 20000);
//            Detail detail = new Detail("Petergof", "+799555555", "slavka@yandex.ru");
//            employee.setEmpDetail(detail);
//
//            Session session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            session.persist(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee emp = session.get(Employee.class, 1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//
//            System.out.println(emp.getEmpDetail());

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 2);
            session.remove(emp);

            session.getTransaction().commit();
            System.out.println("Done!");

            System.out.println(emp.getEmpDetail());
        } finally {
            session.close();
            factory.close();
        }
    }
}
