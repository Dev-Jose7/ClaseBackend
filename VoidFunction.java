package javanotes;
import java.util.Scanner;

public class VoidFunction {
    static int customerId = 0;
    static String customerName = "";
    static String customerEmail = "";
    static String password = "";
    static String status = "";

    static Scanner lector = new Scanner(System.in);
    static StatusCustomer sc = new StatusCustomer();


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

        System.out.println("Seleccione un estado");
        int selection = lector.nextInt();
        status = selectStatus(selection);
    }

    public static void printCustomerData(){
        System.out.println("ID: " + customerId + "\n" +
                "Usuario: "+ customerName + "\n" +
                "Correo: " +customerEmail + "\n" +
                "Status: ");
    }

    public static String selectStatus(int selection){
        String active = "";
        if (selection == 1){
            active = String.valueOf(StatusCustomer.TRUE);
            return active;
        }else if(selection == 2){
            active = String.valueOf(StatusCustomer.FALSE);
        }else{
            System.out.println("Selección no valida");
        }
    }
}