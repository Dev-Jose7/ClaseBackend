package zoo;
//Implementar un sistema para gestionar un zoologico utilzando clases abstractas. Debes tener una clase abstracta que represente un animal generico, cada tipo especifico de animal extendera de esta clase y proporcionana su comportamiento
//debe tener atributos de nombre y edad
//Debe teener un metodo que muestre la informacion de cada animal
//Definir un metodo abstracto que se implementeara en cada subclase
abstract public class Zoo {
    private int edad;
    private String nombre;
    public Zoo(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    abstract void printAnimal();
}
