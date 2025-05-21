import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1 – Parte I: Dado f(n), g(n), h(n) en Θ(h(n)), con f(n)≥g(n)≥0, ¿qué orden tiene f(n)-g(n)?");
        System.out.println("Parte II: Comprobación numérica y conclusión O(h(n))");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa f(n): "); double fn = sc.nextDouble();
        System.out.print("Ingresa g(n): "); double gn = sc.nextDouble();
        System.out.print("Ingresa h(n): "); double hn = sc.nextDouble();

        if (hn==0) {
            System.out.println("Error: h(n) no puede ser 0.");
        } else {
            System.out.println("Como 0 ≤ f-g ≤ (c2-c1)·h, concluimos f(n)-g(n)∈O(h(n)).");
            System.out.printf("Valor numérico de (f-g)/h = %.5f\n", (fn-gn)/hn);
        }
        sc.close();
    }
}