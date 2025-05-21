import java.util.Scanner;
public class Ejercicio11 {
    public static int search(String A, String B) {
        int n=A.length(), m=B.length();
        for(int i=0;i<=n-m;i++){
            int j=0;
            while(j<m && A.charAt(i+j)==B.charAt(j)) j++;
            if(j==m) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println("Ejercicio11 – Parte I: B en A compara ≈(n-m+1)*m veces.");
        Scanner sc=new Scanner(System.in);
        System.out.print("A: "); String A=sc.nextLine();
        System.out.print("B: "); String B=sc.nextLine();
        System.out.println("Posición: "+search(A,B));
        sc.close();
    }
}