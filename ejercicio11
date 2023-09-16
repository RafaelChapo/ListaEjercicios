import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	int h, m;
	
	System.out.println("Ingrese la hora: ");
	h = s.nextInt();
	
	System.out.println("Ingrese los minutos: ");
	m = s.nextInt();
	
	System.out.println("Hora actual: "+h+":"+m);

    int segMediaNoche = 86400;
    
    int hSeg = h * 3600;
    int mSeg = m * 60;
    int segSuma = hSeg + mSeg;
    int segFalta = segMediaNoche - segSuma;
    
    System.out.println("Segundos que faltan para media noche: "+segFalta);
	}
}
