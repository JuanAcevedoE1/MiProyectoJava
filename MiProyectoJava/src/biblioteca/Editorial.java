package biblioteca;

public class Editorial {
    private String nombre;
    private String pais;
    private int anioFundacion;

    public Editorial() {
    }

    public Editorial(String nombre, String pais, int anioFundacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.anioFundacion = anioFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(int anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    @Override
    public String toString() {
        return "Editorial:\n" +
               "  Nombre: " + nombre + "\n" +
               "  País: " + pais + "\n" +
               "  Año de Fundación: " + anioFundacion + "\n";
    }
}

