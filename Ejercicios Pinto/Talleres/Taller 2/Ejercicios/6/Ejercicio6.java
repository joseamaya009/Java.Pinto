import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 6 – Parte I: Con 3h, n máximo para T(n)=k1n, k2n^2, k3·10^n.");
        Scanner sc=new Scanner(System.in);
        System.out.print("k1: "); double k1=sc.nextDouble();
        System.out.print("k2: "); double k2=sc.nextDouble();
        System.out.print("k3: "); double k3=sc.nextDouble();

        double n0=1e6;
        System.out.println("Lineal: n<"+(3*n0) + " (usando k1=" + k1 + ")");
        System.out.println("Cuadrático: n<"+(Math.sqrt(3)*n0) + " (usando k2=" + k2 + ")");
        System.out.println("Exponencial: n<"+(n0+Math.log10(3)) + " (usando k3=" + k3 + ")");
        sc.close();
    }
}