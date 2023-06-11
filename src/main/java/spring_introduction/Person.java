package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.age}")
    private int age;
    @Value("${person.surname}")
    private String surname;

//    public Person() {}

//     pet -> setPet()
//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) {
//    public Person(Pet pet) {
//        this.pet = pet;
//    }

//    @Autowired
//    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person setPet");
        this.pet = pet;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void callPet(){
        System.out.println("Hello my favorite pet.");
        pet.say();
    }
}
