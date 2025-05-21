import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args){
        System.out.println("Ejercicio12 – Parte I: separar en n/2 trozos de 2 y mezclar.");
        Scanner sc=new Scanner(System.in);
        System.out.print("n par: "); int n=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++) A[i]=sc.nextInt();
        int[][] chunks=new int[n/2][2];
        for(int i=0;i<n/2;i++){
            chunks[i][0]=A[2*i];
            chunks[i][1]=A[2*i+1];
            Arrays.sort(chunks[i]);
        }
        int[] out=new int[n], idx=new int[n/2];
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE, w=-1;
            for(int j=0;j<n/2;j++){
                if(idx[j]<2 && chunks[j][idx[j]]<min){
                    min=chunks[j][idx[j]]; w=j;
                }
            }
            out[i]=min; idx[w]++;
        }
        System.out.println(Arrays.toString(out));
        sc.close();
    }
}