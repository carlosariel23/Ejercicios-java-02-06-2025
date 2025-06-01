import java.util.Scanner;

public class ContarPalabras {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese una frase: ");
            String frase = sc.nextLine();
            String[] palabras = frase.trim().split("\\s+");
            System.out.println("Cantidad de palabras: " + palabras.length);
        }
    }
}
