import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	int num;
	
	num = s.nextInt();
	
	if(num % 2 == 0){
	    System.out.println("El número es par");
	}else {
	    System.out.println("El número es impar");
	}
	
	if(num % 5 == 0){
	    System.out.println("El número es divisible por 5");
	}else {
	    System.out.println("El número no es divisible por 5");
	}
	
	}
}
