import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	int nMax, divisor;
	
	System.out.print("Ingrese el número máximo: ");
	nMax = s.nextInt();
	
	System.out.print("Ingrese el divisor: ");
	divisor = s.nextInt();
	
	System.out.println("Números enteros positivos menores a " + nMax + " que no son divisibles por " + divisor + ":");
	
	for (int n = 1; n < nMax; n++) {
        if (n % divisor != 0) {
            System.out.println(n);
        }
    }
  }
}
