import java.util.LinkedList;

public class ListaAlumnosLinkedList {
    public static void main(String[] args) {
        LinkedList<Alumno> alumnos = new LinkedList<>();

        alumnos.add(new Alumno("A001", "Juan Pérez", "C12345"));
        alumnos.add(new Alumno("A002", "Ana López", "C67890"));
        alumnos.add(new Alumno("A003", "Carlos Ruiz", "C54321"));

        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }
}
