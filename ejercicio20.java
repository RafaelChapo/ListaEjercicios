import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        long numero, sumaDigitosPares, digito;
        System.out.print("Ingrese un número entero: ");
        numero = s.nextLong();

        sumaDigitosPares = 0;
        boolean primerDigitoPar = true; 

        System.out.print("Dígitos pares: ");
        while (numero > 0) {
            digito = numero % 10; 
        if (digito % 2 == 0) {
                if (!primerDigitoPar) {
                    System.out.print(" ");
                }
                System.out.print(digito);
                sumaDigitosPares += digito;
                primerDigitoPar = false;
            }
            numero /= 10;
        }
        System.out.println("\nLa suma de los dígitos pares es: " + sumaDigitosPares);
        }
    }
