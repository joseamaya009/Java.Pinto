import java.util.Scanner;
public class Ejercicio9 {
    static double T(double n) {
        if(n<=1) return 1;
        return 2*T(n/4)+Math.log(n)/Math.log(2);
    }
    public static void main(String[] args) {
        System.out.println("Ejercicio 9 – Parte I: T(n)=2T(n/4)+log n → Orden?");
        Scanner sc=new Scanner(System.in);
        System.out.print("n: "); double n=sc.nextDouble();
        System.out.printf("T(%.0f)≈%.2f ⇒ Θ(√n)\n", n, T(n));
        sc.close();
    }
}