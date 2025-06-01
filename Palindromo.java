import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese una palabra: ");
            String palabra = sc.nextLine().toLowerCase();
            String reversa = new StringBuilder(palabra).reverse().toString();

            if (palabra.equals(reversa)) {
                System.out.println("Es una palabra palíndroma.");
            } else {
                System.out.println("No es una palabra palíndroma.");
            }
        }
    }
}
