import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	int num, nDigitos, nNegativo;
	
	System.out.print("Ingrese un número entero (positivo o negativo) de hasta 5 dígitos: ");
	num = s.nextInt();
	
	nDigitos = 0;
	nNegativo = Math.abs(num);
	
	if (nNegativo == 0) {
	    nDigitos = 1;
	} else {
	    while (nNegativo > 0){
	        nNegativo = nNegativo / 10;
	        nDigitos++;
	    }
	}

    System.out.println("El número tiene " + nDigitos + " dígitos.");

	}
}
