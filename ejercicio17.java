import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int numero, contador, sumaImpares, contadorImpares, mayorPares;
        contador = 0;
        sumaImpares = 0;
        contadorImpares = 0;
        mayorPares = Integer.MIN_VALUE;

        System.out.println("Introduzca números");

        do {
        System.out.print("Número: ");
        numero = s.nextInt();

        if (numero >= 0) {
            contador++;

        if (numero % 2 != 0) { 
            sumaImpares += numero;
            contadorImpares++;
        } else { 
            if (numero > mayorPares) {
                mayorPares = numero;
                }
            }
        }
        } while (numero >= 0);

        double mediaImpares = (contadorImpares > 0) ? (double) sumaImpares / contadorImpares : 0;

        System.out.println("Cantidad de números introducidos: " + contador);
        System.out.println("Media de los números impares: " + mediaImpares);
        System.out.println("El mayor de los números pares: " + ((mayorPares != Integer.MIN_VALUE) ? mayorPares : "No se introdujeron números pares."));
    }
}
