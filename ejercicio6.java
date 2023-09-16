import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	double mb, kb, converTotal;
	
	mb = s.nextDouble();
	kb = 1000;

	converTotal = mb * kb;
	
	System.out.println("Convertir "+ mb + " mb a kb: " + converTotal);
	}
}
