package biblioteca;

import java.time.LocalDate;

public class Autor {
    private String nombre;
    private String paisOrigen;
    private LocalDate fechaNacimiento;

    public Autor() {
    }

    public Autor(String nombre, String paisOrigen, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "    Nombre: " + nombre + "\n" +
               "    País de Origen: " + paisOrigen + "\n" +
               "    Fecha de Nacimiento: " + fechaNacimiento + "\n";
    }
}
