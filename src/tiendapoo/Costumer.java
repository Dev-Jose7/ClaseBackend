package tiendapoo;

public class Costumer extends User{
    //Atributos
    String costumerType;
    int experiencePoint = 0;

    //Métodos
    @Override //Sobreescritura
    public void createUser() {
        super.createUser();
        System.out.println("Ingrese el tipo de usuario");
        costumerType = lector.next();

        System.out.println("Asigne los puntos");
        experiencePoint = lector.nextInt();
    }

    @Override
    public void selectUser() {
        super.selectUser();
    }

    @Override
    public void selectUserById(int userId) {
        super.selectUserById(userId);
    }

    @Override
    public void deleteUser(int userId) {
        super.deleteUser(userId);
    }
}
