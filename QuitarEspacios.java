import java.util.Scanner;

public class QuitarEspacios {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese una cadena: ");
            String cadena = sc.nextLine();
            String sinEspacios = cadena.replaceAll("\\s+", "");
            System.out.println("Cadena sin espacios: " + sinEspacios);
        }
    }
}
