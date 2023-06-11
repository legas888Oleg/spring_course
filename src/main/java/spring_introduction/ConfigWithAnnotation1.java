package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context2.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

//        Cat cat = context.getBean("catBean", Cat.class);
//        cat.say();

        context.close();
    }
}
