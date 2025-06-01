import java.util.LinkedHashSet;

class Libro {
    private int id;
    private String titulo;
    private String edicion;
    private String autor;

    public Libro(int id, String titulo, String edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Edición: " + edicion + ", Autor: " + autor;
    }

    // Para evitar duplicados, se recomienda sobrescribir equals y hashCode si fuera necesario
}

public class LibrosLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Libro> libros = new LinkedHashSet<>();

        libros.add(new Libro(1, "Cien Años de Soledad", "1ra", "Gabriel García Márquez"));
        libros.add(new Libro(2, "El Principito", "2da", "Antoine de Saint-Exupéry"));
        libros.add(new Libro(3, "Don Quijote de la Mancha", "3ra", "Miguel de Cervantes"));

        System.out.println("Libros almacenados:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
