package zoologico.HABITATS;

public class voladores extends  habitats{

    boolean puede_volar;

    public voladores ( float temperatura, float humedad, boolean limpieza, boolean puede_volar) {
        super(temperatura, humedad, limpieza);
        this.puede_volar = puede_volar;
    }

    public voladores ( float temperatura, float humedad, boolean limpieza ) {
        super ( temperatura, humedad, limpieza );
    }

    public String toString() {
        return "aviario []";
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    protected void finalize() throws Throwable {
        super.finalize();
    }
    public int hashCode() {
        return super.hashCode();
    }

    public boolean isPuede_volar() {
        return puede_volar;
    }

    public void setPuede_volar(boolean puede_volar) {
        this.puede_volar = puede_volar;
    }

}
