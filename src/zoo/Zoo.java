//Implementar un sistema para gestionar un zoologico utilzando clases abstractas. Debes tener una clase abstracta que represente un animal generico, cada tipo especifico de animal extendera de esta clase y proporcionana su comportamiento
//debe tener atributos de nombre y edad
//Debe teener un metodo que muestre la informacion de cada animal
//Definir un metodo abstracto que se implementeara en cada subclase

package zoo;

public abstract class Zoo {
    public static void main(String[] args) {
        Leon leon = new Leon("Tomas", 5);
        leon.animalInfo();
        leon.alimentarse();
        leon.caminar();
        leon.dormir();
        leon.cazar();

        System.out.println("");

        Aguila aguila = new Aguila("William", 4);
        aguila.animalInfo();
        aguila.alimentarse();
        aguila.dormir();
        aguila.volar();

        System.out.println("");

        Foca foca = new Foca("Paul", 8);
        foca.animalInfo();
        foca.alimentarse();
        foca.dormir();
        foca.nadar();
    }
}
