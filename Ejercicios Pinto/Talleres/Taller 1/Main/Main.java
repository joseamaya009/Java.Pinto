package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

        String var;
        int opciones, val1, val2, val3, val4, val5, val6;

        System.out.println("Ingrese un número para hacer el ejercicio:");
        System.out.println("1. Distancia recorrida.");
        System.out.println("2. Promedio de un estudiante.");
        System.out.println("3. Respuestas correctas, incorrectas y en blanco.");
        System.out.println("4. Puntajes de partidos.");
        System.out.println("5. planilla.");
        System.out.println("6. Area de un triangulo.");
        System.out.println("7. CD'S");
        System.out.println("8. Plano Cartesiano.");
        System.out.println("9. Edad actual.");
        System.out.println("10. Mayor de dos hermanos.");
        System.out.println("11. Produccion semanal.");
        System.out.println("12. Mayor de tres numeros.");
        System.out.println("13. Tipo de triangulo.");
        System.out.println("14. Convertir a romano.");
        System.out.println("15. Calcular un monto.");
        System.out.println("16. Vocales.");
        System.out.println("17. Decenas.");
        System.out.println("18. Par o impar.");
        System.out.println("19.Numeros pares del 1 al 10");
        System.out.println("20. Sueldo de empleados.");
        System.out.println("21. Mayores y menores de edad.");
        System.out.println("22. Producto por sumas sucesivas.");
        System.out.println("23. 10 números enteros.");
        var = teclado.nextLine();
        opciones = Integer.parseInt(var);

        switch (opciones) {
            case 1:
                System.out.println("Ingrese velocidad:");
                val1 = teclado.nextInt();

                System.out.println("Ingrese el tiempo:");
                val2 = teclado.nextInt();

                System.out.println("La distancia recorrida fue: " + val1 * val2);
                break;

            case 2:
                System.out.println("Ingrese primera nota:");
                val1 = teclado.nextInt();

                System.out.println("Ingrese segunda nota:");
                val2 = teclado.nextInt();

                System.out.println("Ingrese tercera nota:");
                val3 = teclado.nextInt();

                System.out.println("El promedio de las tres notas es: " + (val1 + val2 + val3) / 3.0);
                break;

            case 3:
                System.out.println("Ingrese número de respuestas correctas:");
                val1 = teclado.nextInt();

                System.out.println("Ingrese número de respuestas incorrectas:");
                val2 = teclado.nextInt();

                System.out.println("Ingrese número de respuestas en blanco:");
                val3 = teclado.nextInt();

                System.out.println("Puntaje respuestas correctas: " + (val1 * 4));
                System.out.println("Puntaje  respuestas incorrectas: " + (val1 * -1));
                System.out.println("Puntaje respuestas en blanco:" + (val3 * 0));
                System.out.println("Puntaje final es:" + (val1 + val2 + val3));
                break;

            case 4:
                System.out.println("Ingrese partidos ganados:");
                val1 = teclado.nextInt();

                System.out.println("Ingrese partidos empatados:");
                val2 = teclado.nextInt();

                System.out.println("Ingrese partidos perdidos:");
                val3 = teclado.nextInt();

                System.out.println("El puntaje de partidos ganados es:" + (val1 * 3));
                System.out.println("El puntaje de partidos empatados es:" + (val2 * 1));
                System.out.println("El puntaje de partidos perdidos es:" + (val3 * 0)); 
                System.out.println("El puntaje de partidos total es:" + (val1  + val2 + val3));
                break;
            
            case 5:
                System.out.println("Ingrese horas laboradas en el mes: ");
                val1 = teclado.nextInt();

                System.out.println("Ingrese tarifa por hora: ");
                val2 = teclado.nextInt();

                System.out.println("El valor de la planilla es:" + val1 * val2);
                break;

            case 6:
                System.out.println("Digite longitud del lado A");
                val1 = teclado.nextInt();
  
                System.out.println("Digite longitud del lado B");
                val2 = teclado.nextInt();

                System.out.println("Digite longitud del lado C");
                val3 = teclado.nextInt();

                val4 = (val1 + val2 + val3) /2;

                System.out.println("El area del trinagulo es:" + Math.sqrt(val4  * (val4 - val1) * (val4 - val2) * (val4 - val3)));
                break;

            case 7:
                System.out.println("Digite Gygabytes:");
                val1 = teclado.nextInt();
  
                System.out.println("Digite Megabytes:");
                val2 = teclado.nextInt();

                val2 = val1 * 1024;

                System.out.println("El total de CD'S son:" + (Math.floor(val2/700) +1));
                break;

            case 8:
                System.out.println("Digite abcisa de A");
                val1 = teclado.nextInt();
  
                System.out.println("Digite abcisa de B");
                val2 = teclado.nextInt();

                System.out.println("Digite ordenada de A");
                val3 = teclado.nextInt();

                System.out.println("Digite ordenada de B");
                val4 = teclado.nextInt();

                System.out.println("La distancia es:" + Math.pow(val2 - val1, 2) + Math.pow( val4 - val3,2));
                break;

            case 9:
                System.out.println("Digite año de nacimiento:");
                val1 = teclado.nextInt();
  
                System.out.println("Digite año actual:");
                val2 = teclado.nextInt();

                int edad = val2 - val1;

                if (edad > 17) {
                System.out.println("Debe solicitar su CUIL.");
                }
                else {
                System.out.println("No debe solicitar su CUIL aun.");
                }
                break;

            case 10:
                System.out.println("Digite edad del primer hermano:");
                val1 = teclado.nextInt();
  
                System.out.println("Digite edad del segundo hermano:");
                val2 = teclado.nextInt();

                if (val1 > val2) {
                System.out.println("El primer hermano es el mayor por:"  + (val1 - val2) + " años.");
                }
                else {
                System.out.println("El segundo hermano es el mayor por:"  + (val2 - val1) + " años.");
                }
                break;

            case 11:
                System.out.println("Digite la produccion del lunes:");
                val1 = teclado.nextInt();
  
                System.out.println("Digite la produccion del martes:");
                val2 = teclado.nextInt();

                System.out.println("Digite la produccion del miercoles:");
                val3 = teclado.nextInt();

                System.out.println("Digite la produccion del jueves:");
                val4 = teclado.nextInt();
  
                System.out.println("Digite la produccion del viernes:");
                val5 = teclado.nextInt();

                System.out.println("Digite la produccion del sabado:");
                val6 = teclado.nextInt();

                System.out.println("La produccion total es:" + (val1 + val2 + val3 + val4 + val5 + val6));
                System.out.println("La produccion promedio es:" + (val1 + val2 + val3 + val4 + val5 + val6) / 6);
                break;

            case 12:
                System.out.println("Ingrese primer numero entero:");
                val1 = teclado.nextInt();
  
                System.out.println("Ingrese segundo numero entero:");
                val2 = teclado.nextInt();

                System.out.println("Ingrese tercer numero entero:");
                val3 = teclado.nextInt();

                if (val1 > val2 && val1 > val3) {
                System.out.println("El numero uno es el mayor.");
                }
                else if (val2 > val1 && val2 > val3) {
                System.out.println("El numero dos es el mayor.");
                }
                else {
                System.out.println("El numero tres es el mayor.");
                }
                break;

            case 13:
                System.out.println("Ingrese primer lado del triangulo:");
                val1 = teclado.nextInt();
  
                System.out.println("Ingrese segundo lado del triangulo:");
                val2 = teclado.nextInt();

                System.out.println("Ingrese tercer lado del triangulo:");
                val3 = teclado.nextInt();

                if (val1 != val2 && val1 != val3 && val2 != val3) {
                System.out.println("El triangulo es escaleno.");
                }
                else if (val1 == val2 && val1 == val3 && val2 == val3) {
                System.out.println("El triangulo es equilatero.");
                }
                else {
                System.out.println("El triangulo es isoceles.");
                }
                break;

            case 14:
                System.out.println("Ingrese un numero para convertir a romano ( del 1 al 10)");
                val1 = teclado.nextInt();
                
                String romano= "";

                switch (val1) {
        
                case 1:  romano = "I"; break;
                case 2:  romano = "II"; break;
                case 3:  romano = "III"; break;
                case 4:  romano = "IV"; break;
                case 5:  romano = "V"; break;
                case 6:  romano = "VI"; break;
                case 7:  romano = "VII"; break;
                case 8:  romano = "VIII"; break;
                case 9:  romano = "IX"; break;
                case 10: romano = "X"; break;
                default: System.out.println("Número no válido"); break;
                }

                System.out.println("Número romano: " + romano);
                break;
        
            case 15:
                System.out.println("Ingrese el monto");
                val1 = teclado.nextInt();
                val2 = 0;

                if (val1 >= 0 && val1 < 1000) {
                val2 = (0 * val1) / 100;
                }               
                else if (val1 >= 1000 && val1 < 5000) {
                val2 = (3 * val1) / 100;
                } 
                else if (val1 >= 5000 && val1 < 20000) {
                val2 = (5 * val1) / 100;
                }
                else if (val1 >= 20000) {
                val2 = (8 * val1) / 100;
                }

                System.out.println("El total de la bonificación es: " + val2);
                break;

            case 16:
                System.out.print("Introduce un número del 1 al 5: ");
                opciones = teclado.nextInt();
                val1 = 1;
                val2 = 2;
                val3 = 3;
                val4 = 4;
                val5 = 5;

                switch (opciones) {
                case 1:
                    if (opciones == val1) {
                        System.out.println("La vocal correspondiente es: A");
                    }
                    break;
                case 2:
                    if (opciones == val2) {
                        System.out.println("La vocal correspondiente es: E");
                    }
                    break;
                case 3:
                    if (opciones == val3) {
                        System.out.println("La vocal correspondiente es: I");
                    }
                    break;
                case 4:
                    if (opciones == val4) {
                        System.out.println("La vocal correspondiente es: O");
                    }
                    break;
                case 5:
                    if (opciones == val5) {
                        System.out.println("La vocal correspondiente es: U");
                    }
                    break;
            
                 default:
                System.out.println("Valor inválido");
                }
                break;

            case 17:
                System.out.println("Ingrese un numero entero de dos digitos:");
                val1 = teclado.nextInt();

                val2 = (int) Math.floor(val1/10);

                val3 = val1 - (val2 * 10);

                System.out.println("El numero de decenas es:" + val2);
                System.out.println("El numero de unidades es:" + val3);
                break;

            case 18:
                System.out.println("Ingrese un numero:");
                val1 = teclado.nextInt();

                val2 = val1 / 2;

                val3 = val1 - (val2 * 2);

                if (val3 == 0) {
                System.out.println("El numero es par.");
                }
                else {
                System.out.println("El numero es impar.");
                }
                break;

            case 19:
                System.out.println("Numeros pares del 1 al 10.");
                val1 = 2;

                for (  val2 = 1;  val2 <= 5; val2++ ) {
                System.out.println(val1);
                val1 = val1 + 2;
                }
                break;

            case 20:
                System.out.println("Ingrese total de empleados:");
                val1 = teclado.nextInt();

                val2 = 0;

                for (val4 = 1; val4 <= val1; val4++ ) {
                System.out.println("Ingrese sueldo del (los) empleados:" + val4 + ":");
                val3 = teclado.nextInt();
                val2 += val3;
                }

                System.out.println("El promedio de los sueldos es: " + (val2 / val1));
                break;

            case 21:
                val1 = 0;
                val2 = 0;

                for (val3 = 1; val3 <= 200; val3++) {
                System.out.print("Edad de persona " + val3 + ": ");
                val4 = teclado.nextInt();
                if (val4 < 18) {
                val2++;
                }
                else {
                val1++;
                }
                }

                System.out.println("Contador: " + (val3 - 1));
                System.out.println("Mayores: " + val1);
                System.out.println("Menores: " + val2);
                break;

            case 22:
                System.out.println("Ingrese el primer número:");
                val1 = teclado.nextInt();

                System.out.println("Ingrese el segundo número:");
                val2 = teclado.nextInt();

                val3 = 0;

                for (int k = 1; k <= val2; k++) {
                val3 = val3 + val1;
                }

                System.out.println("El producto por sumas sucesivas es: " + val3);
                break;

            case 23:
                for (val1 = 1; val1 <= 10; val1++) {
                val2 = val1 / 2;
                val3 = val1 - (val2 * 2);

                if (val3 == 0) {
                continue;
                }

                System.out.println(val1);
                }
                break;
            
            case 24:










            default:
            System.out.println("Opción no válida.");
            break;
            }
        }
    }
}