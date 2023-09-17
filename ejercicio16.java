import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	int num, nPositivo, nNegativo;
	nPositivo = 0;
	nNegativo = 0;
	
	for (int n = 1; n <= 10; n++){
	    System.out.println("Ingrese el número: "+ n + ": ");
	    num = s.nextInt();
	
	    if (num >0){
	     nPositivo++;
	    }   else if (num < 0){
	        nNegativo++;
	    }
	}
	System.out.println("Cantida de números positivos: "+ nPositivo);
	System.out.println("Cantida de números negativos: "+ nNegativo);
  }
}
