package spring_introduction;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context1.xml");
        Dog pet = context.getBean("myPet", Dog.class);
        pet.setName("Belka");
        Dog pet1 = context.getBean("myPet", Dog.class);
        pet1.setName("Strelka");

        System.out.println(((Dog) pet).getName());
        System.out.println(((Dog) pet1).getName());

        context.close();
    }
}
