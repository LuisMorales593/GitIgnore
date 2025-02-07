package SensorTemperatura;

import java.util.Arrays;

public class Inventario {
	public static String[] inventario = { "cola", "pan", "leche", "queso" };
	public static double[] precios = { 1, 2, 3, 4 };
	public static int[] cantidad = { 5, 5, 4, 4 };
	public static int tamanio = 4;

	public static void main(String[] args) {
		calcularInventario();
		productoCaroBarato();
		descuento();
		analicisPrecios();

	}

	public static void calcularInventario() {
		System.out.println("\nINVENTARIO");
		double[] arrayProductos = new double[tamanio];
		for (int i = 0; i < tamanio; i++) {
			arrayProductos[i] = cantidad[i] * precios[i];
			//inventario[i] = inventario[i];
			System.out.println(inventario[i] + "  precio UNITARIO " + precios[i]);
			System.out.println("el precio INVENTARIO por TOTAL " + cantidad[i] + " X " + inventario[i] + "......"
					+ arrayProductos[i] + "$");
		}
		
		System.out.println("total " +  3.0*0.80);

	}

	public static void productoCaroBarato() {
		System.out.println("\npRODUCTO mAYOR Y MENOR");
		double productoCaro = precios[0];
		double productoBarato = precios[0];
		for (int i = 0; i < tamanio; i++) {
			if (productoCaro < precios[i]) {
				productoCaro = precios[i];
			}

		}

		for (int i = 0; i < tamanio; i++) {
			if (productoBarato > precios[i]) {
				productoBarato = precios[i];
			}

		}
		System.out.println("Producto caro cuesta: " + productoCaro + "$");
		System.out.println("Producto barato cuesta: " + productoBarato + "$");

	}

	public static void descuento() {
		System.out.println("\nDESCUENTO");
		double[] preciosDescontados = new double[tamanio];
		for (int i = 0; i < tamanio; i++) {
			preciosDescontados[i] = 0.8 * precios[i];
			inventario[i] = inventario[i];
			System.out.println("Producto: " + inventario[i] + "  precio con descuento: " + preciosDescontados[i] + "$");

		}
		System.out.println(Arrays.toString(preciosDescontados));

	}

	public static void analicisPrecios() {

		System.out.println("\nANALICIS DE PRECIOS");
		// Calcular el precio promedio de los productos.

		// - Identificar y listar los productos que tienen un precio superior al
		// promedio.

		// - Para los productos por encima del promedio, mostrar:

		// * Nombre del producto

		// * Precio original
		double suma = 0;

		for (int i = 0; i < tamanio; i++) {

			suma += precios[i];

		}

		double promedio = suma / tamanio;
		System.out.println("promedio inventario: " + promedio + "$");
		for (int i = 0; i < tamanio; i++) {
			if (precios[i] > promedio) {
				inventario[i] = inventario[i];
				System.out.println(
						"Producto superior a la media:" + inventario[i] + "   Precio original:" + precios[i] + "$");

			}

		}

	}

}
