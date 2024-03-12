package zoologico.administrador;

import java.util.HashMap;
import java.util.Map;

// Clase para manejar la administración de recursos del zoológico
class ResourceManager {
    private Map<String, Resource> inventory;

    public ResourceManager () {
        inventory = new HashMap<> ();
    }

    // Agregar un recurso al inventario
    public void addResource ( String resourceName, int quantity ) {
        Resource resource = inventory.get ( resourceName );
        if (resource == null) {
            resource = new Resource ( resourceName, quantity );
            inventory.put ( resourceName, resource );
        } else {
            resource.setQuantity ( resource.getQuantity () + quantity );
        }
    }

    // Realizar un pedido de recursos
    public void placeOrder ( String resourceName, int quantity, String supplier ) {
        System.out.println ( "Realizando pedido de " + quantity + " unidades de " + resourceName + " al proveedor " + supplier );
        // Lógica para realizar el pedido al proveedor
    }

    // Mostrar el inventario de recursos
    public void displayInventory () {
        System.out.println ( "Inventario de Recursos:" );
        for (Map.Entry<String, Resource> entry : inventory.entrySet ()) {
            Resource resource = entry.getValue ();
            System.out.println ( resource.getName () + ": " + resource.getQuantity () );
        }
    }
}
