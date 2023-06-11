package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    private Pet pet;
    private String surname;
    private int age;

//    public Person() {}

//     pet -> setPet()
//    @Autowired
//    public Person(Pet pet) {
//        this.pet = pet;
//    }

//    @Autowired
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
