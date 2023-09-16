import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	int hora;
	hora = s.nextInt();
	
	if(hora >= 6 && hora <=12){
	    System.out.println("¡Buenos días!"); 
    } else if (hora > 12 && hora <= 20){
	    System.out.println("¡Buenas tardes!");
    } else {
        System.out.println("¡Buenas noches!");
	}
	}
}
