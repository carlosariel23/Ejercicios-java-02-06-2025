import java.util.ArrayList;

class Alumno {
    private String codigo;
    private String nombre;
    private String carnet;

    public Alumno(String codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet;
    }
}

public class ListaAlumnosArrayList {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("A001", "Juan Pérez", "C12345"));
        alumnos.add(new Alumno("A002", "Ana López", "C67890"));
        alumnos.add(new Alumno("A003", "Carlos Ruiz", "C54321"));

        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }
}
