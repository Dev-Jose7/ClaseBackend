//Implementar un sistema para gestionar un zoologico utilzando clases abstractas. Debes tener una clase abstracta que represente un animal generico, cada tipo especifico de animal extendera de esta clase y proporcionana su comportamiento
//debe tener atributos de nombre y edad
//Debe teener un metodo que muestre la informacion de cada animal
//Definir un metodo abstracto que se implementeara en cada subclase

package zoo;

public abstract class Zoo {
    private String animal;
    private int age;

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Zoo(String animal, int age){
        this.animal = animal;
        this.age = age;
    }

    public abstract void animalInfo();

    public void alimentarse(){
        System.out.println(this.animal + " esta alimentandose");
    }

    public void dormir(){
        System.out.println(this.animal + " esta durmiendo");
    }
}
