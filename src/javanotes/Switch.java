package javanotes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    static int productId;
    static String productName;
    static double cost;
    static float profit;
    static double price;

    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void createProduct(){
        String [] product = new String[5];

        System.out.println("Id: ");
        productId = lector.nextInt();
        lector.nextLine();
        product[0] = productId + "";

        System.out.println("Ingrese nombre: ");
        productName = lector.next();
        product[1] = productName;

        System.out.println("Ingrese costo: ");
        cost = lector.nextDouble();
        lector.nextLine();
        product[2] = Double.toString(cost);

        System.out.println("Ingrese ganancia: ");
        profit = lector.nextFloat();
        lector.nextLine();
        product[3] = Float.toString(profit);

        price = calculatePrice(profit, cost);
        product[4] = Double.toString(price);

        menu();
    }

    public static double calculatePrice(float profit, double cost){
        double price = cost/(1-(profit/100));
        return price;
    }

    public static void printProduct(){
        System.out.println("Id: " + productId + "\n" +
                "Nombre producto: " + productName + "\n" +
                "Precio: " + "\n" + price);
    }

    public static void menu(){
        System.out.println("Seleccione una opcion" + "\n" + "1. Para crear producto" + "\n" + "2. Para imprimir el producto");

        int option = lector.nextInt();
        lector.nextLine();

        switch (option){
            case 1:
                System.out.println("----Crear producto----");
                createProduct();
                break;

            case 2:
                System.out.println("----Ver producto----");
                printProduct();
                break;

            default:
                System.out.println("Opción incorrecta");

        }
    }
}
