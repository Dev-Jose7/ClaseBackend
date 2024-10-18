package zoo;

public class Foca extends Animal{
    public Foca(String name, int age){
        super(name, age);
    }

    @Override
    public void animalInfo() {
        System.out.println("Informacion acerca del animal");
        System.out.println(this.getName() + " es una foca");
        System.out.println("Tiene " + this.getAge() + " de edad");
        System.out.println("Carnívora, acuática, mamífero, social, nadadora");
    }

    @Override
    public void caminar() {
        System.out.println(this.getName() + " Esta caminando");
    }

    @Override
    public void alimentarse() {
        System.out.println(this.getName() + " Esta alimentandose");
    }

    @Override
    public void dormir() {
        System.out.println(this.getName() + " Esta durmiendo");
    }

    public void nadar(){
        System.out.println(this.getName() + " Puede nadar");
    }
}
