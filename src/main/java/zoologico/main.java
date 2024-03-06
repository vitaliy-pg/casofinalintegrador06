package zoologico;

import zoologico.HABITATS.acuaticos;
import zoologico.HABITATS.terrestres;
import zoologico.HABITATS.voladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class main {

    public static void main(String[] args) {
        // Crear instancias de los diferentes tipos de hábitats
        acuaticos acuatico = new acuaticos(26, 70, true, true);
        terrestres terrestre = new terrestres(26, 70, true, true);
        voladores volador = new voladores(26, 70, true, true);

        // Crear una lista de hábitats
        List<Object> listaHabitats = new ArrayList<>().reversed ();
        listaHabitats.add(acuatico);
        listaHabitats.add(terrestre);
        listaHabitats.add(volador);

        // Iterar sobre la lista de hábitats
        for (Object habitat : listaHabitats) {
            System.out.println();
        }

        // Gestión de Hábitats
        AquaticHabitat aquaticHabitat = new AquaticHabitat();
        TerrestrialHabitat terrestrialHabitat = new TerrestrialHabitat();
        AviaryHabitat aviaryHabitat = new AviaryHabitat();

        aquaticHabitat.monitorConditions("Temperatura", 26);
        terrestrialHabitat.monitorConditions("Humedad", 70);
        aviaryHabitat.monitorConditions("Limpieza", 90);

        // Cuidado de Animales
        Lion lion = new Lion("Savannah");
        Penguin penguin = new Penguin("Antarctica");

        lion.feed();
        penguin.feed();

        lion.updateHealth("Enfermo");
        penguin.updateBehavior("Agresivo");

        // Interacción con Visitantes
        VirtualGuide virtualGuide = new VirtualGuide();
        virtualGuide.provideTour("Niños");

        InteractiveKiosk interactiveKiosk = new InteractiveKiosk();
        interactiveKiosk.provideInformation("Información sobre leones");

        // Administración de Recursos
        ResourceManager resourceManager = new ResourceManager();
        resourceManager.addResource("Alimentos", 100);
        resourceManager.addResource("Medicinas", 50);
        resourceManager.addResource("Equipamiento", 10);

        // Mantenimiento y Seguridad
        MaintenanceAndSecuritySystem maintenanceAndSecuritySystem = new MaintenanceAndSecuritySystem();
    }

    abstract static class Habitat {
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

    static class AquaticHabitat extends Habitat {
        public AquaticHabitat() {
            super("Acuático");
        }
    }

    static class TerrestrialHabitat extends Habitat {
        public TerrestrialHabitat() {
            super("Terrestre");
        }
    }

    static class AviaryHabitat extends Habitat {
        public AviaryHabitat() {
            super("Aviario");
        }
    }

    // Clases para el cuidado de animales
    abstract static class Animal {
        String species;
        String habitat;
        String health;
        String behavior;

        public Animal(String species, String habitat) {
            this.species = species;
            this.habitat = habitat;
            this.health = "Saludable";
            this.behavior = "Normal";
        }

        public void feed() {
            System.out.println("Alimentando a " + species);
        }

        public void updateHealth(String healthStatus) {
            this.health = healthStatus;
        }

        public void updateBehavior(String behaviorStatus) {
            this.behavior = behaviorStatus;
        }
    }

    static class Lion extends Animal {
        public Lion(String habitat) {
            super("León", habitat);
        }
    }

    static class Penguin extends Animal {
        public Penguin(String habitat) {
            super("Pingüino", habitat);
        }
    }

    // Clases para la interacción con visitantes
    abstract static class VisitorInteraction {
        abstract void provideTour(String visitorType);
    }

    static class VirtualGuide extends VisitorInteraction {
        @Override
        void provideTour(String visitorType) {
            System.out.println("Bienvenido al tour virtual para " + visitorType);
        }
    }

    static class InteractiveKiosk {
        public void provideInformation(String information) {
            System.out.println("Mostrando información en el kiosco interactivo: " + information);
        }
    }

    // Clases para la administración de recursos
    static class Resource {
        String name;
        int quantity;

        public Resource(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
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

    // Clases para el mantenimiento y la seguridad
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
}