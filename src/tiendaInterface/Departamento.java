package tiendaInterface;

import java.util.ArrayList;

public class Departamento {
    private int iddep;                       // Identificador único del departamento
    private String nombredep;                 // Nombre del departamento
    private ArrayList<Producto> productos;    // Lista de productos en el departamento

    // Constructor que inicializa el departamento con su ID, nombre y una lista de productos vacía
    public Departamento(int iddep, String nombredep) {
        this.iddep = iddep;
        this.nombredep = nombredep;
        this.productos = new ArrayList<>();   // Inicializa la lista de productos vacía
    }

    // Métodos "get" para obtener el ID y el nombre del departamento
    public int getIddep() { return iddep; }
    public String getNombredep() { return nombredep; }

    // Método para obtener la lista de productos del departamento
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    // Método para agregar un producto a la lista
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para eliminar un producto de la lista por su ID
    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
    }

    // Método para actualizar el precio de un producto en el departamento por su ID
    public void actualizarPrecio(int id, double nuevoPrecio) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                producto.setPrecio(nuevoPrecio);
                break;
            }
        }
    }

    // Método para consultar el stock de un producto en el departamento por su ID
    public int consultarStock(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto.getCantidad();
            }
        }
        return 0; // Devuelve 0 si el producto no se encuentra
    }
}
