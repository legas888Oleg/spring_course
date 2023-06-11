package spring_introduction;

public class Person {
    public void setPet(Pet pet) {
        System.out.println("set pet");
        this.pet = pet;
    }

    private Pet pet;

    public Person() {
        System.out.println("Bean Person is created");
    }

    // pet -> setPet()
    public Person(Pet pet) {
        System.out.println("Bean Person is created");
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Hello my favorite pet.");
        pet.say();
    }
}
