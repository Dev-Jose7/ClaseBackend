package interfaces;

public class Perro implements Animal{
    @Override
    public void hacerSonido() {
        System.out.println("Guau, Guau");
    }
}