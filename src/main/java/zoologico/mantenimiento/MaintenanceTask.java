package zoologico.mantenimiento;

// Clase para representar una tarea de mantenimiento
class MaintenanceTask {
    private String facility;
    private String description;
    private boolean urgent;

    public MaintenanceTask ( String facility, String description, boolean urgent ) {
        this.facility = facility;
        this.description = description;
        this.urgent = urgent;
    }

    public String getFacility () {
        return facility;
    }

    public String getDescription () {
        return description;
    }

    public boolean isUrgent () {
        return urgent;
    }
}
