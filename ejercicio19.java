import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int altura;
		
		System.out.println("Ingrese la altura de la L: ");
		altura = s.nextInt();
		
		for (int f=1; f <= altura; f++){
          if (f < altura) {
            System.out.println("*");
        } else {
            for (int c = 1; c <= altura / 2 + 1; c++) {
                System.out.print("*");
                }
            }
        }
	}
}
