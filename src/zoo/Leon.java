package zoo;


public class Leon extends Zoo{

    public Leon(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    void printAnimal(){
        System.out.println("El animal: " + this.getNombre() + " tiene " + this.getEdad() + " años");
    }
}
