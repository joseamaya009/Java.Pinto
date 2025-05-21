import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 7 – Parte I: Con máquina 100×, n máximo para k1n, k2n^2, k3·10^n.");
        Scanner sc=new Scanner(System.in);
        System.out.print("k1: "); sc.nextDouble();
        System.out.print("k2: "); sc.nextDouble();
        System.out.print("k3: "); sc.nextDouble();

        double n0=1e6;
        System.out.println("Lineal: n<"+(100*n0));
        System.out.println("Cuadrático: n<"+(Math.sqrt(100)*n0));
        System.out.println("Exponencial: n<"+(n0+2));
        sc.close();
    }
}