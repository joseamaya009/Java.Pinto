import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2 – Parte I: log_a(n)∈Θ(log_b(n)); ¿2^{log_a n}∈Θ(2^{log_b n})?");
        System.out.println("Parte II: Cambio de base y contraejemplo exponencial");

        Scanner sc = new Scanner(System.in);
        System.out.print("Base a (>1): "); double a=sc.nextDouble();
        System.out.print("Base b (>1): "); double b=sc.nextDouble();
        System.out.print("Valor n (>0): "); double n=sc.nextDouble();

        double lgA=Math.log(n)/Math.log(a);
        double lgB=Math.log(n)/Math.log(b);
        System.out.printf("log_a(n)=%.5f, log_b(n)=%.5f → Θ iguales.\n", lgA, lgB);

        double eA=Math.pow(2,lgA);
        double eB=Math.pow(2,lgB);
        System.out.printf("2^{log_a n}=%.5f, 2^{log_b n}=%.5f\n", eA, eB);
        System.out.println("Si a≠b, la razón depende de n ⇒ no están en Θ iguales.");
        sc.close();
    }
}