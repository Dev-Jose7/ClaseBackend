package tiendapoo;

import java.util.Scanner;

public class User {
    //Propiedades
    int userId;
    String userName;
    String lastName;
    String email;
    String password;
    boolean status;

    Scanner lector = new Scanner(System.in);

    //MétodoS
    public void createUser(){
        System.out.println("Ingrese su ID: ");
        userName = lector.next();
    }

    public void selectUser(){

    }

    public void selectUserById(int userId){

    }

    public void updateUser(){

    }

    public  void deleteUser(int userId){

    }
}
