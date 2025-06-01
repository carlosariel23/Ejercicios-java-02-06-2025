import java.util.Scanner;

public class EliminarUltimaPalabra {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese una frase: ");
            String frase = sc.nextLine().trim();
            int ultimaEspacio = frase.lastIndexOf(" ");
            if (ultimaEspacio != -1) {
                String nuevaFrase = frase.substring(0, ultimaEspacio);
                System.out.println("Frase sin la última palabra: " + nuevaFrase);
            } else {
                System.out.println("La frase tiene solo una palabra o está vacía.");
            }
        }
    }
}
