import java.util.Scanner;
public class Ejercicio15 {
    static int[] A; static int cnt;
    static class H { int max,min; }
    public static void maxMin(int i,int j,H h){
        cnt++;
        if(A[i]<=A[j]) { h.max=A[j]; h.min=A[i]; }
        else           { h.max=A[i]; h.min=A[j]; }
        if(i+1<=j-1){
            H h2=new H(); maxMin(i+1,j-1,h2);
            cnt++; if(h2.max>h.max) h.max=h2.max;
            cnt++; if(h2.min< h.min) h.min=h2.min;
        }
    }
    public static void main(String[] args){
        System.out.println("Ejercicio15 – Parte I: número de comparaciones de MAX_MIN recursivo.");
        Scanner sc=new Scanner(System.in);
        System.out.print("n: "); int n=sc.nextInt();
        A=new int[n]; for(int i=0;i<n;i++) A[i]=sc.nextInt();
        cnt=0; H h=new H(); maxMin(0,n-1,h);
        System.out.printf("Max=%d, Min=%d, Comp=%d ~1.5n\n", h.max,h.min,cnt);
        sc.close();
    }
}