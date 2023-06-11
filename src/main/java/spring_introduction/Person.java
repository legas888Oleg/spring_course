package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public void setPet(Pet pet) {
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

    public Person() {}

    // pet -> setPet()
    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Hello my favorite pet.");
        pet.say();
    }
}
