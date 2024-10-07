package prueba;

import biblioteca.Autor;
import biblioteca.Libro;
import biblioteca.Editorial;

import java.time.LocalDate;

public class PruebaBiblioteca {
    public static void main(String[] args) {
        System.out.println("Nombre: Juan Esteban Acevedo Echenique C.E: 7502410052");
        System.out.println("***********************************");

        // Creación de objetos
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombia", LocalDate.of(1927, 3, 6));
        Autor autor2 = new Autor();

        Libro libro1 = new Libro("Cien años de soledad", autor1, "1234567890");
        Libro libro2 = new Libro();

        Editorial editorial1 = new Editorial("Sudamericana", "Argentina", 1939);
        Editorial editorial2 = new Editorial();

        // Asignación de valores a objetos no inicializados
        autor2.setNombre("Isabel Allende");
        autor2.setPaisOrigen("Chile");
        autor2.setFechaNacimiento(LocalDate.of(1942, 8, 2));

        libro2.setTitulo("La casa de los espíritus");
        libro2.setAutor(autor2);
        libro2.setIsbn("0987654321");

        editorial2.setNombre("Plaza & Janés");
        editorial2.setPais("España");
        editorial2.setAnioFundacion(1959);

        // Mostrar datos de los objetos creados con formato de lista
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(editorial1);
        System.out.println(editorial2);
    }
}

