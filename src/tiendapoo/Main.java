package tiendapoo;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Costumer costumer = new Costumer();


//        product.createProduct(); //Uso de método
//        product.productName = "Almojabana"; //Uso de atributos

        costumer.createUser();
    }

    //Abstracción: Generalizar en bases a las entidades de un elemento
    //Herencia:
    //Encapsulamiento
    //Polimorfismo - sobrecarga (clase) | sobreescritura (instancia)
}
