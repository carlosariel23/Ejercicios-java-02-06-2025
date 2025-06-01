import java.util.Scanner;

public class ContarVocalA {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese una frase: ");
            String frase = sc.nextLine().toLowerCase();
            int contador = 0;

            for (char c : frase.toCharArray()) {
                if (c == 'a') {
                    contador++;
                }
            }

            System.out.println("La vocal 'A' aparece " + contador + " veces.");
        }
    }
}
