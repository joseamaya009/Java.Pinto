import java.util.Scanner;
public class Ejercicio8 {
    public static void maxMin(int[] A) {
        int max, min, i=0;
        if (A.length%2==0) {
            if (A[0]>A[1]) { max=A[0]; min=A[1]; }
            else           { max=A[1]; min=A[0]; }
            i=2;
        } else {
            max = min = A[0];
            i=1;
        }
        while (i+1<A.length) {
            int x=A[i], y=A[i+1];
            int mx = x>y?x:y, mn = x<y?x:y;
            if (mx>max) max=mx;
            if (mn<min) min=mn;
            i+=2;
        }
        System.out.printf("Max=%d, Min=%d\n", max, min);
    }
    public static void main(String[] args) {
        System.out.println("Ejercicio 8 – Parte I: max/min en <3n/2 comparaciones.");
        Scanner sc=new Scanner(System.in);
        System.out.print("n: "); int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++){ System.out.print("A["+i+"]="); A[i]=sc.nextInt(); }
        maxMin(A);
        sc.close();
    }
}