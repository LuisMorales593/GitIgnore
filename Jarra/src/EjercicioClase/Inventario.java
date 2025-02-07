package EjercicioClase;

import java.util.Scanner;

public class Inventario {

	public static int tamanio=2 ;
	public  static String nombreProducto[] = new String[tamanio];
	public static double preciosProductos[] = new double[tamanio];
	public static  int cantidadProducto[] = new int[tamanio];

	public static void main(String[] args) {
		IngresarDatos();
		mostrarDatos();
	
		

	}

	public static void IngresarDatos() {
		Scanner Leer = new Scanner(System.in);// creo mi escaner
		for (int i = 0; i < tamanio; i++) {
			System.out.println("Ingrese Nombre del producto: ");
			nombreProducto[i] = Leer.nextLine();

			System.out.println("Ingrese Precio: ");
			preciosProductos[i] = Leer.nextDouble();

			System.out.println("Cantidad Producto: ");
			cantidadProducto[i] = Leer.nextInt();
			Leer.nextLine();

		}
	}

	public static void mostrarDatos() {
		System.out.println("Producto Cantidad Precio-Unitario");
		 double inventario[]=new double[tamanio];
		 double denominador=0;
		for (int i = 0; i < tamanio; i++) {
			double Valor=cantidadProducto[i]*preciosProductos[i];
			
			
			denominador+=Valor;
			System.out.println("  "+nombreProducto[i]+"    "+cantidadProducto[i]+"       "+preciosProductos[i]+"$      "+Valor+"$");
		}
		
		double promedio= denominador/tamanio;
		System.out.println(promedio);
		
	}

	
			
			
		
		
		
	
}
