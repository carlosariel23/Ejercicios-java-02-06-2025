import java.util.Scanner;

public class PromedioPositivos {
    public static void main(String[] args) {
        int suma = 0, positivos = 0, total = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Ingrese un número (o escriba 'fin' para terminar): ");
                String entrada = sc.nextLine();
                if (entrada.equalsIgnoreCase("fin")) {
                    break;
                }
                try {
                    int numero = Integer.parseInt(entrada);
                    suma += numero;
                    total++;
                    if (numero > 0) positivos++;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Intente de nuevo.");
                }
            }
        }
        if (total > 0) {
            double promedio = (double) suma / total;
            System.out.println("Promedio: " + promedio);
            System.out.println("Cantidad de números positivos: " + positivos);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
    }
}
