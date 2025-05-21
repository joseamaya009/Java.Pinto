import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar y validar n ≥ 1
        int n;
        do {
            System.out.print("Ingresa n (entero ≥ 1): ");
            while (!sc.hasNextInt()) {
                System.out.print("Error: no es un entero. Ingresa n (≥ 1): ");
                sc.next();
            }
            n = sc.nextInt();
        } while (n < 1);

        long tiempoTrivial = (long) n * n;
        double tiempoDV = n * (Math.log(n) / Math.log(2));

        // Mostrar resultados
        System.out.println("\nPARTE I:");
        System.out.println("Algoritmo trivial: Θ(n²)");
        System.out.println("Divide y Vencerás: T(n)=2T(n/2)+n·log₂(n) ⇒ Θ(n log n)");
        System.out.println("\nPARTE II:");
        System.out.printf("Para n = %d:%n", n);
        System.out.printf("  - n² = %d%n", tiempoTrivial);
        System.out.printf("  - n·log₂(n) ≈ %.2f%n", tiempoDV);
        System.out.println("Observa que n·log₂(n) crece más despacio que n².");

        sc.close();
    }
}