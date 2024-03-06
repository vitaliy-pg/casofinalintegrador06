package administrador;

import java.util.HashMap;
import java.util.Map;

// Clase para representar los recursos del zoológico
class Resource {
    private String name;
    private int quantity;

    public Resource(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// Clase para manejar la administración de recursos del zoológico
class ResourceManager {
    private Map<String, Resource> inventory;

    public ResourceManager() {
        inventory = new HashMap<>();
    }

    // Agregar un recurso al inventario
    public void addResource(String resourceName, int quantity) {
        Resource resource = inventory.get(resourceName);
        if (resource == null) {
            resource = new Resource(resourceName, quantity);
            inventory.put(resourceName, resource);
        } else {
            resource.setQuantity(resource.getQuantity() + quantity);
        }
    }

    // Realizar un pedido de recursos
    public void placeOrder(String resourceName, int quantity, String supplier) {
        System.out.println("Realizando pedido de " + quantity + " unidades de " + resourceName + " al proveedor " + supplier);
        // Lógica para realizar el pedido al proveedor
    }

    // Mostrar el inventario de recursos
    public void displayInventory() {
        System.out.println("Inventario de Recursos:");
        for (Map.Entry<String, Resource> entry : inventory.entrySet()) {
            Resource resource = entry.getValue();
            System.out.println(resource.getName() + ": " + resource.getQuantity());
        }
    }
}

// Clase principal que demuestra el uso del módulo de administración de recursos
class ZooResourceManagement {
    public static void main(String[] args) {
        // Crear el gestor de recursos del zoológico
        ResourceManager resourceManager = new ResourceManager();

        // Agregar recursos al inventario
        resourceManager.addResource("Alimento para leones", 50);
        resourceManager.addResource("Medicina para aves", 100);
        resourceManager.addResource("Equipamiento de limpieza", 20);

        // Mostrar el inventario actual
        resourceManager.displayInventory();

        // Realizar un pedido de recursos
        resourceManager.placeOrder("Alimento para elefantes", 30, "ProveedorA");

        // Mostrar el inventario actualizado después del pedido
        resourceManager.displayInventory();
    }
}
