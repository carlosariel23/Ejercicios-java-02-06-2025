import java.util.Scanner;

public class CapitalizarPalabras {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese una cadena: ");
            String cadena = sc.nextLine().toLowerCase();
            String[] palabras = cadena.split(" ");
            StringBuilder resultado = new StringBuilder();

            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {
                    resultado.append(Character.toUpperCase(palabra.charAt(0)))
                             .append(palabra.substring(1)).append(" ");
                }
            }

            System.out.println("Resultado: " + resultado.toString().trim());
        }
    }
}
