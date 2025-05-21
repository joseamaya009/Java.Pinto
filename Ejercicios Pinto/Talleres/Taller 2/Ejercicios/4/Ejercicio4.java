import java.util.Scanner;
public class Ejercicio4 {
    static long t(long n) {
        if (n<=0) return 0;
        long cdo = n*(n+1)/2;   // Θ(n^2)
        return cdo + 4*t(n/2);
    }
    public static void main(String[] args) {
        System.out.println("Ejercicio 4 – Parte I: Orden de t(n) de un doble for más 4 llamadas G(n/2).");
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        long n=sc.nextLong();
        System.out.printf("t(%d)≈%d ⇒ Θ(n^2 log n)\n", n, t(n));
        sc.close();
    }
}