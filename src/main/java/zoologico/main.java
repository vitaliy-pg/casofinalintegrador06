package zoologico;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

1public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResourceManager resourceManager = new ResourceManager();
        MaintenanceAndSecuritySystem maintenanceAndSecuritySystem = new MaintenanceAndSecuritySystem();

        boolean exit = false;
        while (!exit) {
            System.out.println("=== Menú de Opciones ===");
            System.out.println("1. Agregar recursos");
            System.out.println("2. Monitorear condiciones del hábitat");
            System.out.println("3. Realizar tareas de mantenimiento y seguridad");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()

            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre del recurso: ");
                    String resourceName = scanner.nextLine();
                    System.out.print("Ingrese la cantidad de " + resourceName + ": ");
                    int quantity = scanner.nextInt();
                    resourceManager.addResource(resourceName, quantity);
                    break;
                case 2:
                    System.out.println("Monitoreo de condiciones del hábitat...");
                    // Aquí podrías implementar la lógica para monitorear condiciones del hábitat
                    break;
                case 3:
                    System.out.println("Realización de tareas de mantenimiento y seguridad...");
                    // Aquí podrías implementar la lógica para realizar tareas de mantenimiento y seguridad
                    break;
                case 4:
                    exit = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        scanner.close();
    }

    static abstract class Habitat {
        String type;
        Map<String, Integer> conditions;

        public Habitat(String type) {
            this.type = type;
            conditions = new HashMap<>();
        }

        public void monitorConditions(String condition, int value) {
            conditions.put(condition, value);
            System.out.println("Monitoreando " + condition + " en el hábitat " + type + ": " + value);
        }
    }

    static class ResourceManager {
        List<Resource> resources;

        public ResourceManager() {
            resources = new ArrayList<>();
        }

        public void addResource(String name, int quantity) {
            resources.add(new Resource(name, quantity));
            System.out.println("Agregado " + quantity + " unidades de " + name + " al inventario");
        }
    }

    static class MaintenanceAndSecuritySystem {
        List<String> maintenanceTasks;
        List<String> securityCameras;
        List<String> sensors;

        public MaintenanceAndSecuritySystem() {
            maintenanceTasks = new ArrayList<>();
            securityCameras = new ArrayList<>();
            sensors = new ArrayList<>();
        }
    }

    static class Resource {
        String name;
        int quantity;

        public Resource(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }
    }
}