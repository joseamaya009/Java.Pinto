import java.util.Scanner;
public class Ejercicio13 {
    public static boolean isPal(String C,int i,int j){
        if(i>=j) return true;
        if(C.charAt(i)!=C.charAt(j)) return false;
        return isPal(C,i+1,j-1);
    }
    public static void main(String[] args){
        System.out.println("Ejercicio13 – Parte I: palíndromo con comparaciones de extremos.");
        Scanner sc=new Scanner(System.in);
        System.out.print("Cadena: "); String C=sc.nextLine();
        boolean pal=isPal(C,0,C.length()-1);
        System.out.println("¿Palíndromo? "+pal+" (peor Θ(n), medio Θ(1))");
        sc.close();
    }
}