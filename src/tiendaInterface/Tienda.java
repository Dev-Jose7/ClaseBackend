package tiendaInterface;
import java.util.ArrayList;

public class Tienda {
    private String nombre;                         // Nombre de la tienda
    private ArrayList<Departamento> departamentos; // Lista de departamentos en la tienda

    // Constructor que inicializa la tienda con su nombre y una lista vacía de departamentos
    public Tienda(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();    // Inicializa la lista de departamentos vacía
    }

    // Método para obtener el nombre de la tienda
    public String getNombre() { return nombre; }

    // Método para agregar un departamento a la tienda
    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    // Método para consultar todos los departamentos de la tienda
    public ArrayList<Departamento> consultarDepartamentos() {
        return departamentos;
    }

    // Método para consultar productos de un departamento por su nombre
    public ArrayList<Producto> consultarProductosPorDepartamento(String nombreDepartamento) {
        for (Departamento dep : departamentos) {
            if (dep.getNombredep().equalsIgnoreCase(nombreDepartamento)) {
                return dep.getProductos();
            }
        }
        return new ArrayList<>(); // Devuelve una lista vacía si no encuentra el departamento
    }
}
