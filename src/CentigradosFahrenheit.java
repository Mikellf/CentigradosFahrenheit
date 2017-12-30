
import java.util.Scanner;
public class CentigradosFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		double centigrados, fahrenheit; /*Definimos las variables*/
		
		System.out.println("introduzca los Grados Centígrados para convertir a Grados Fahrenheit");
		centigrados = sc.nextDouble();
		fahrenheit = ((9*centigrados)/5)+32;
		System.out.println(centigrados + " Grados Centigrados son " + fahrenheit + " Grados Fahrenheit");
		sc.close();
	}

}
