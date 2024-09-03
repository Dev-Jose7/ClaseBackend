package tiendapoo;

import java.util.Scanner;

public class Product {
    int productId;
    String productName;
    double cost;
    float profit;
    double price;
    Scanner lector = new Scanner(System.in);

    public void createProduct(){
        String [] product = new String[5];
        String [] tags = {"ID", "Product Name", "Cost", "Profit", "Price"};

        System.out.print("Id: ");
        productId = lector.nextInt();
        lector.nextLine();
        product[0] = productId + "";

        System.out.print("Ingrese nombre: ");
        productName = lector.next();
        product[1] = productName;

        System.out.print("Ingrese costo: ");
        cost = lector.nextDouble();
        lector.nextLine();
        product[2] = Double.toString(cost);

        System.out.print("Ingrese ganancia: ");
        profit = lector.nextFloat();
        lector.nextLine();
        product[3] = Float.toString(profit);

        price = calculatePrice(profit, cost);
        product[4] = Double.toString(price);

        for (int i = 0; i < tags.length; i++) {
            System.out.println(tags[i] + ": " + product[i]);
        }
    }

    public double calculatePrice(float profit, double cost){
        double price = cost/(1-(profit/100));
        return price;
    }

    public void printProduct(){
        System.out.println("Id: " + productId + "\n" +
                "Nombre producto: " + productName + "\n" +
                "Precio: " + "\n" + price);
    }

}
