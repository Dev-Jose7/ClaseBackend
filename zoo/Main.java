package zoo;

public class Main {
    public static void main(String[] args) {
        Animal leon = new Animal("Leon", 2);
        leon.animalInfo();
        leon.alimentarse();
        leon.dormir();

        Animal zebra = new Animal("Zebra", 4);
        zebra.animalInfo();
        zebra.alimentarse();
        zebra.dormir();
    }
}
