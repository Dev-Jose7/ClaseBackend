package tiendaInterface;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda("Mi Tienda de Ropa");

        // Ejemplo de agregar departamentos
        Departamento hombres = new Departamento(1, "Hombres");
        Departamento mujeres = new Departamento(2, "Mujeres");
        tienda.agregarDepartamento(hombres);
        tienda.agregarDepartamento(mujeres);

        int opcion;

        // Menú principal
        do {
            System.out.println("\n---- Menú Principal ----");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Actualizar precio de producto");
            System.out.println("4. Consultar stock de producto");
            System.out.println("5. Consultar productos de un departamento");
            System.out.println("6. Consultar departamentos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Ejemplo de agregar un producto
                    System.out.print("ID del producto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad en stock: ");
                    int cantidad = scanner.nextInt();

                    Producto nuevoProducto = new Producto(id, nombre, precio, cantidad);
                    hombres.agregarProducto(nuevoProducto); // Ejemplo de agregar al departamento de hombres
                    System.out.println("Producto agregado exitosamente.");
                    break;

                // Puedes añadir más opciones de acuerdo a los métodos que implementamos


                case 6:
                    System.out.println("Departamentos en la tienda:");
                    for (Departamento dep : tienda.consultarDepartamentos()) {
                        System.out.println("- " + dep.getNombredep());
                    }
                    break;

                case 0:
                    System.out.println("Saliendo de la aplicación.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

}