package hibernate_test;

import hibernate_test.entity.Detail;
import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            Employee employee = new Employee("Misha", "Sidorov", "HR", 25000);
//            Detail detail = new Detail("Sankt-Peterburg", "+123456", "misha@yandex.ru");
//            employee.setEmpDetail(detail);
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);

            session = factory.getCurrentSession();
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 4);
            detail.getEmployee().setEmpDetail(null);
            session.remove(detail);

//            session.persist(detail);

            session.getTransaction().commit();
            System.out.println("Done!");

            System.out.println(detail != null ? detail.getEmployee() : null);

        } finally {
            session.close();
            factory.close();
        }
    }
}
