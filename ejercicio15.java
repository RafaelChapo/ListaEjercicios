import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	int num, clave, intentos;
	
	clave = 5943;
	intentos = 0;
	
	while (intentos < 4){
	System.out.println("Ingrese la clave  de 4 cifras de la caja fuerte: ");
	num = s.nextInt();
	System.out.println("");
	
	if (num == clave) {
	    System.out.println("La caja fuerte se ha abierto satisfactoriamente");
	    break;
	} else {
	    System.out.println("Lo siento, esa no es la combinación");
	    intentos++;
	  if (intentos == 4){
	    System.out.println("Has agotado tus intentos");
	  }
	 } 
	 }
	}
}
