import java.util.Scanner;

public class Primera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;

        // Pedir número
        System.out.println("Ingrese un número (máximo 500):");
        i = teclado.nextInt();

        while (i > 500) {
            System.out.println("El número no puede ser mayor a 500. Intente nuevamente:");
            i = teclado.nextInt();
        }

        // Elegir qué mostrar
        System.out.println("¿Qué números quiere?");
        System.out.println("1. Números pares");
        System.out.println("2. Números impares");
        System.out.println("3. Números primos");
        System.out.print("Ingrese su elección (1-3): ");
        int opcion = teclado.nextInt();

        System.out.println("\nMostrando resultados del 1 al " + i + ":\n");

        switch (opcion) {
            case 1:
                for (int j = 1; j <= i; j++) {
                    if (j % 2 == 0) {
                        System.out.println(j + " - Par");
                    }
                }
                break;

            case 2:
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0) {
                        System.out.println(j + " - Impar");
                    }
                }
                break;

            case 3:
                System.out.println("Números primos:");
                for (int j = 2; j <= i; j++) {
                    int divisores = 0;
                    for (int k = 1; k <= j; k++) {
                        if (j % k == 0) {
                            divisores++;
                        }
                    }
                    if (divisores == 2) {
                        System.out.println(j);
                    }
                }
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        teclado.close();
    }
}