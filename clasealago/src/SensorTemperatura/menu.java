package SensorTemperatura;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int opcion;

		while (true) {
			System.out.println("Men�:");
			

			System.out.print("Elige una opci�n (1, 2 o 3): ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Has seleccionado Opci�n 1");
				break;

			case 2:
				System.out.println("Has seleccionado Opci�n 2");
				break;

			case 3:
				System.out.println("�Hasta luego!");
				scanner.close();
				return;

			default:
				System.out.println("Opci�n no v�lida, intenta de nuevo.");
			}

		}

	}
}
