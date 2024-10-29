package interfaces;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal perro = new Perro();

        gato.hacerSonido();
        perro.hacerSonido();
    }
}
