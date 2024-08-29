package javanotes;
import java.util.Scanner;

public class VoidFunction {
    static int customerId = 0;
    static String customerName = "";
    static String customerEmail = "";
    static String password = "";
    static Boolean status = false;

    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        createCustumer();
        printCustomerData();
    }

    public static void createCustumer(){
        System.out.print("Ingrese el id del cliente: ");
        customerId = lector.nextInt();

        System.out.print("Ingrese su nombre: ");
        customerName = lector.next();

        System.out.print("Ingrese su correo: ");
        customerEmail = lector.next();

        System.out.print("Ingrese su contraseña: ");
        password = lector.next();

        System.out.print("Seleccione un estado: ");
        int selection = lector.nextInt();
        selectStatus(selection);
    }

    public static void printCustomerData(){
        System.out.println("ID: " + customerId + "\n" +
                "Usuario: "+ customerName + "\n" +
                "Correo: " +customerEmail + "\n" +
                "Status: " +status + "\n");
    }

    public static void selectStatus(int selection){
        if (selection == 1){
            status = false;
        }else if(selection == 2){
            status = true;
        }else{
            System.out.println("Selección no valida");
        }
    }
}