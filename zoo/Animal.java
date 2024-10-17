package zoo;

public class Animal extends Zoo {

    public Animal(String animal, int age){
        super(animal, age);
    }

    @Override
    public void animalInfo() {
        System.out.println("Animal: " + this.getAnimal() + " Edad: " + this.getAge());
    }

}
