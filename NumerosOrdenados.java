import java.util.Scanner;
import java.util.TreeSet;

public class NumerosOrdenados {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Ingrese un número (o escriba 'fin' para terminar): ");
                String entrada = sc.nextLine();
                if (entrada.equalsIgnoreCase("fin")) break;

                try {
                    int numero = Integer.parseInt(entrada);
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Intente de nuevo.");
                }
            }
        }

        System.out.println("Números ingresados ordenados de menor a mayor:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
