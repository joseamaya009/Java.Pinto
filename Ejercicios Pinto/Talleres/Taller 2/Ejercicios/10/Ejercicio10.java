import java.util.Scanner;
public class Ejercicio10 {
    static long parcial(long m){ return m==1?1:2*parcial(m-1); }
    static long totalA(long n){ return n==1?1:totalA(n-1)+2*parcial(n-1); }
    static long totalB(long n,long m){ return n==1?m:m+totalB(n-1,2*m); }

    public static void main(String[] args) {
        System.out.println("Ejercicio10 – Parte I-a: total/parcial.  I-b: total(n,m).");
        Scanner sc=new Scanner(System.in);
        System.out.print("n para (a): "); long n=sc.nextLong();
        System.out.printf("totalA(%d)= %d ⇒ Θ(n²)\n", n, totalA(n));
        System.out.print("n,m para (b): "); long m=sc.nextLong();
        System.out.printf("totalB(%d,%d)= %d ⇒ Θ(n)\n", n, m, totalB(n,m));
        sc.close();
    }
}