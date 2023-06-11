package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat = context.getBean("catBean", Cat.class);
//        cat.say();
        Person person = context.getBean("personBean", Person.class);
        person.callPet();

        context.close();
    }
}
