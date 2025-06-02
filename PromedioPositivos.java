// Importa la clase Scanner para leer datos desde el teclado
import java.util.Scanner;

// Clase principal
public class PromedioPositivos {
    public static void main(String[] args) {
        // Variables para almacenar la suma de los números, la cantidad de positivos y el total ingresado
        int suma = 0, positivos = 0, total = 0;

        // Se utiliza un bloque try-with-resources para asegurar que el Scanner se cierre automáticamente
        try (Scanner sc = new Scanner(System.in)) {

            // Bucle infinito que solo termina si el usuario escribe "fin"
            while (true) {
                System.out.print("Ingrese un número (o escriba 'fin' para terminar): ");
                String entrada = sc.nextLine();  // Lee la entrada del usuario como texto

                // Si el usuario escribe "fin" (en cualquier combinación de mayúsculas o minúsculas), se rompe el bucle
                if (entrada.equalsIgnoreCase("fin")) {
                    break;
                }

                try {
                    // Intenta convertir la entrada a un número entero
                    int numero = Integer.parseInt(entrada);

                    // Suma el número al total acumulado
                    suma += numero;

                    // Aumenta el contador de números válidos ingresados
                    total++;

                    // Si el número es positivo, aumenta el contador de positivos
                    if (numero > 0) positivos++;

                } catch (NumberFormatException e) {
                    // Si la conversión falla (por ejemplo, el usuario ingresó letras), muestra un mensaje de error
                    System.out.println("Entrada no válida. Intente de nuevo.");
                }
            }
        }

        // Si se ingresaron números válidos, calcula y muestra el promedio y la cantidad de positivos
        if (total > 0) {
            double promedio = (double) suma / total;  // Se hace cast a double para obtener un promedio decimal
            System.out.println("Promedio: " + promedio);
            System.out.println("Cantidad de números positivos: " + positivos);
        } else {
            // Si no se ingresaron números válidos, muestra un mensaje informando eso
            System.out.println("No se ingresaron números válidos.");
        }
    }
}
