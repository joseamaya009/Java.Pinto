import java.util.Scanner;

public class Tercero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de Respuestas Correctas: ");
        int correctas = scanner.nextInt();

        System.out.print("Número de Respuestas Incorrectas: ");
        int incorrectas = scanner.nextInt();

        System.out.print("Número de Respuestas en Blanco: ");
        int enBlanco = scanner.nextInt();

        int puntajeCorrectas = correctas * 4;
        int puntajeIncorrectas = incorrectas * 1;

        int puntajeFinal = puntajeCorrectas + puntajeIncorrectas + enBlanco;

        System.out.println("Puntaje de Respuestas Correctas: " + puntajeCorrectas);
        System.out.println("Puntaje de Respuestas Incorrectas: " + puntajeIncorrectas);
        System.out.println("Puntaje final es: " + puntajeFinal);

        scanner.close();
    }
}