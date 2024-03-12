package zoologico.administrador;

// Clase para representar los recursos del zoológico
class Resource {
    private String name;
    private int quantity;

    public Resource ( String name, int quantity ) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName () {
        return name;
    }

    public int getQuantity () {
        return quantity;
    }

    public void setQuantity ( int quantity ) {
        this.quantity = quantity;
    }
}
