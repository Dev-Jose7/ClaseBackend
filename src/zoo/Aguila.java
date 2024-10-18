package zoo;

public class Aguila extends Animal{
    public Aguila(String name, int age){
        super(name, age);
    }

    @Override
    public void animalInfo() {
        System.out.println("Informacion acerca del animal");
        System.out.println(this.getName() + " es una aguila");
        System.out.println("Tiene " + this.getAge() + " de edad");
        System.out.println("Carnívoro, volador, rapaz, aves, depredador.");
    }

    @Override
    public void alimentarse() {
        System.out.println(this.getName() + " se esta alimentando");
    }

    @Override
    public void caminar() {}

    @Override
    public void dormir() {
        System.out.println(this.getName() + " esta durmiendo");
    }

    public void volar(){
        System.out.println(this.getName() + " Puede volar");
    }
}
