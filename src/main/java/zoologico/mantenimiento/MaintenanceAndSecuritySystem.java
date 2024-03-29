package zoologico.mantenimiento;

import java.util.ArrayList;
import java.util.List;

// Clase para representar el sistema de mantenimiento y seguridad del zoológico
class MaintenanceAndSecuritySystem {
    private List<MaintenanceTask> maintenanceTasks;
    private List<String> securityCameras;
    private List<String> sensors;

    public MaintenanceAndSecuritySystem () {
        maintenanceTasks = new ArrayList<> ();
        securityCameras = new ArrayList<> ();
        sensors = new ArrayList<> ();
    }

    // Agregar una tarea de mantenimiento
    public void scheduleMaintenance ( String facility, String description, boolean urgent ) {
        MaintenanceTask task = new MaintenanceTask ( facility, description, urgent );
        maintenanceTasks.add ( task );
        System.out.println ( "Tarea de mantenimiento programada para: " + facility + ", Descripción: " + description );
    }

    // Agregar una cámara de seguridad
    public void addSecurityCamera ( String location ) {
        securityCameras.add ( location );
        System.out.println ( "Cámara de seguridad agregada en: " + location );
    }

    // Agregar un sensor
    public void addSensor ( String location ) {
        sensors.add ( location );
        System.out.println ( "Sensor agregado en: " + location );
    }

    // Mostrar las tareas de mantenimiento pendientes
    public void displayMaintenanceTasks () {
        System.out.println ( "Tareas de Mantenimiento Pendientes:" );
        for (MaintenanceTask task : maintenanceTasks) {
            System.out.println ( "Facilidad: " + task.getFacility () + ", Descripción: " + task.getDescription () + ", Urgente: " + task.isUrgent () );
        }
    }

    // Mostrar las cámaras de seguridad y sensores instalados
    public void displaySecurityDevices () {
        System.out.println ( "Cámaras de Seguridad Instaladas:" );
        for (String camera : securityCameras) {
            System.out.println ( camera );
        }
        System.out.println ( "Sensores Instalados:" );
        for (String sensor : sensors) {
            System.out.println ( sensor );
        }
    }
}
