import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	int hora, min, num, minFinDe;
	
	System.out.println("Ingrese el día de la semana (1,2,3,4 o 5)");
    System.out.println("1 => Lunes");
    System.out.println("2 => Martes");
    System.out.println("3 => Miercoles");
    System.out.println("4 => Jueves");
    System.out.println("5 => Viernes");
    num = s.nextInt();
    
    System.out.print("Ingrese la hora: ");
    hora = s.nextInt();

    System.out.print("Ingrese los minutos: ");
    min = s.nextInt();
    
    minFinDe = 0;
    
    switch (num){
        case 1: if (num == 1)
            minFinDe = (4 * 24 + 15 - hora) * 60 - min;
        break;
        
        case 2: if (num == 2)
            minFinDe = (3 * 24 + 15 - hora) * 60 - min;
        break;
        
        case 3: if (num == 3)
            minFinDe = (2 * 24 + 15 - hora) * 60 - min;
        break;
        
        case 4: if (num == 4)
            minFinDe = (1 * 24 + 15 - hora) * 60 - min;
        break;
        
        case 5: if (num == 5)
            minFinDe = (15 - hora) * 60 - min;
        break;
    
        default:
         System.out.println("Ingrese un numero válido");
    }
    
    System.out.println("Faltan " + minFinDe + " minutos para el fin de semana");

	}
}
