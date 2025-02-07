package Deber;

//Pertener a: Tnlgo. Carlos Luis Morales.
//DAM// Desarrollado 30/10/2024
import java.util.Scanner;//Libreria Scanner para tomar datos de consola.

public class DeberCode

{
	// variables
	static int c1 = 0, c2 = 0, c3 = 0; // Ingreso variables cantidad del producto.
	static String p1 = null, p2 = null, p3 = null;// Ingreso Variables de nombres
	static int op;// Variable de selección menú principal.
	static int ele;// Variable de selección eliminar.
	static int act;// Variable de selección actualizar.
	static int bo; // Variable de buscar.
	static Scanner SCAN = new Scanner(System.in); // Sirve para recoger texto por consola

	public static void main(String[] args) // Menu Principal

	{
		// Try catch para evitar que el programa termine si hay un error

		// Opciones();
		// op = Integer.parseInt(SCAN.nextLine());
		// int num=-1; //Variable local del main Metodo 1.

		// Scanner leer = new Scanner(System.in);//Scanner local del main Metodo 1.

		while (op != 6) {
			try {
				// Try catch para evitar que el programa termine si hay un error

				Opciones();
				// Metodo de ingreso 2: Cambiar num por op.
				// Recoger una variable por consola
				op = Integer.parseInt(SCAN.nextLine());
				// Integer.parseInt funciona en una cadena.
				// Esa cadena puede provenir de cualquier lugar.
				// No se limita a la clase Scanner .

				// num=leer.nextInt();

				switch (op) {

				case 1:
					System.out.println("AGREGAR\n");
					Agregar();
					break;
				case 2:
					System.out.println("ELIMINAR");
					Eliminar();
					break;
				case 3:
					System.out.println("ACTUALIZAR INVENTARIO");
					Actualizar();
					break;
				case 4:
					System.out.println("MOSTRAR INVENTARIO");
					Mostrar();
					break;
				case 5:
					System.out.println("BUSCAR PRODUCTO");
					Buscar();
					break;
				case 6:
					System.out.println("Adios");
					break;

				default:
					System.out.println("Uoop! Error!");
					break;
				}

				System.out.println("\n"); // Mostrar un salto de línea en Java
			}

			catch (Exception e) {
				System.out.println("Debes seleccionar un numero de opcion");

			}
		}

	}

	public static void Opciones()// Solo menú de Opciones.
	{

		System.out.println("\n SISTEMA GESTION DE INVENTARIO" + "\n1. Agregar producto" + "\n2. Eliminar producto"
				+ "\n3. Actualizar cantidad" + " \n4. Mostrar inventario" + "\n5. BuscaProducto" + "\n6. Salir"
				+ "\nElige una opcion: ");
	}

	public static void Agregar() // Metodo Agrego los 3 productos.
	{
		// Producto1
		System.out.println("\nNombre del Producto1: ");// Muestro texto.
		p1 = SCAN.nextLine(); // Ingreso dato p1 por consola por consola.
		System.out.println("\nCantidad del Producto1: ");
		c1 = SCAN.nextInt();// Ingreso dato p2 por consola por consola.
		SCAN.nextLine();// Scanner hace avanzar este escáner más allá de la línea actual

		// Producto2
		System.out.println("Nombre del Producto2: ");
		p2 = SCAN.nextLine();
		System.out.println("Cantidad del Producto2: ");
		c2 = SCAN.nextInt();
		SCAN.nextLine();

		// Producto3
		System.out.println("Nombre del Producto3: ");
		p3 = SCAN.nextLine();
		System.out.println("Cantidad del Producto3: ");
		c3 = SCAN.nextInt();
		SCAN.nextLine();

	}

	public static void Eliminar() // Método para eliminar un producto.
	{

		System.out.println("Producto a eliminar\n" + "Para eliminar " + p1 + " presione 1\n" + "Para eliminar " + p2
				+ " presione 2\n" + "Para eliminar " + p3 + " presione 3\n");
		System.out.println(" Ingrese N: ");
		ele = Integer.parseInt(SCAN.nextLine());

		switch (ele) {
		case 1:
			p1 = null;
			c1 = 0;
			System.out.println(" Producto 1 eliminado");
			break;
		case 2:
			p2 = null;
			c2 = 0;
			System.out.println("Producto 2 eliminado ");
			break;
		case 3:
			p3 = null;
			c3 = 0;
			System.out.println("Producto 3 eliminado");
			break;
		default:
			System.out.println("Opcion no identificado");
			break;

		}

	}

	public static void Actualizar() // Método para actualizar el producto.
	{
		System.out.println("Ingrese el codigo del Producto 1, 2  o 3 : ");
		ele = Integer.parseInt(SCAN.nextLine());
		switch (ele) {
		case 1:
			if (p1 != null) {
				System.out.println("Acualiza la cantidad de "+p1+": ");
				c1 = SCAN.nextInt();
				SCAN.nextLine();
				break;
			} else {
				System.out.println("Producto no existe");
			}
			break;
		case 2:
			if (p2 != null) {
				System.out.println("Acualiza la cantidad de "+p2+": ");
				c2 = SCAN.nextInt();
				SCAN.nextLine();
				break;
			} else {
				System.out.println("Producto no existe");
			}
			break;
		case 3:
			if (p3 != null) {
				System.out.println("Acualiza la cantidad de "+p3+": ");
				c3 = SCAN.nextInt();
				SCAN.nextLine();
				break;
			} else {
				System.out.println("Producto no existe");
			}
			break;

		default:

			System.out.println("Codigo no identificado");
			break;

		}

	}

	public static void Mostrar() // Método para eliminar un producto.
	{
		System.out.println("Inventario Actual\n" + "Producto 1: " + p1 + " Cantidad:" + c1 + "\n" + "Producto 2: " + p2
				+ " Cantidad:" + c2 + "\n" + "Producto 3: " + p3 + " Cantidad:" + c3 + "\n");

	}

	public static void Buscar() // Método para buscar un producto.
	{
		System.out.println("Ingrese codigo del producto a buscar");
		bo = Integer.parseInt(SCAN.nextLine());
		switch (bo) {
		case 1:
			System.out.println("Producto 1: " + p1 + " Cantidad:" + c1 + "\n");

			break;
		case 2:
			System.out.println("Producto 2: " + p2 + " Cantidad:" + c2 + "\n");

			break;
		case 3:
			System.out.println("Producto 3: " + p3 + " Cantidad:" + c3 + "\n");

			break;
		default:
			System.out.println("Uoop! Error!");
			break;
		}

	}

}
