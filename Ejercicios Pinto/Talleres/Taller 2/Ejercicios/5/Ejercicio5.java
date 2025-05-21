import java.util.Scanner;
public class Ejercicio5 {
    public static boolean esTriang(long N) {
        long sum=1, term=1;
        while (sum<N) { term++; sum+=term; }
        return sum==N;
    }
    public static void main(String[] args) {
        System.out.println("Ejercicio 5 – Parte I: ¿n es triangular?");
        Scanner sc=new Scanner(System.in);
        System.out.print("n: ");
        long n=sc.nextLong();
        System.out.println(n + (esTriang(n)?" sí":" no") + " es triangular.");
        sc.close();
    }
}