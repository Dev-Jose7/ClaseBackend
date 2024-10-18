package zoo;

public class Leon extends Animal{
    public Leon(String name, int age){
        super(name, age);
    }

    @Override
    public void animalInfo() {
        System.out.println("Informacion acerca del animal");
        System.out.println(this.getName() + " es un león");
        System.out.println("Tiene " + this.getAge() + " de edad");
        System.out.println("Carnívoro, terrestre, social, cazador, mamífero.");
    }

    @Override
    public void caminar() {
        System.out.println(this.getName() + " se esta desplazando");
    }

    @Override
    public void alimentarse() {
        System.out.println(this.getName() +  " esta alimentándose");
    }

    @Override
    public void dormir() {
        System.out.println(this.getName() + "esta durmiendo");
    }

    public void cazar(){
        System.out.println(this.getName() + " puede cazar");
    }
}
