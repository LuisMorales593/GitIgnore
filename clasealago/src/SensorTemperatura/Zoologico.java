//EXAMEN
//@Desarrollado por :Luis Morales
package SensorTemperatura;


import java.util.Arrays;
import java.util.Scanner;

public class Zoologico {
	private String[] nombres;
	private int[] edades;
	private int cantidadAnimales;
	private double promedio;

	// Constructpor por defecto
	public Zoologico() {
		super();
		String[] animales = new String[5];
		int[] anios = new int[5];
		this.cantidadAnimales = 5;
		this.nombres = animales;
		this.edades = anios;
		this.promedio = promedio;

	}

	public Zoologico(String[] nombres, int[] edades, int cantidadAnimales) {
		super();
		this.nombres = nombres;
		this.edades = edades;
		this.cantidadAnimales = cantidadAnimales;
	}

	public void registrarAnimales(int numeroAnimales) {

		System.out.println("Numero de animales registrado:" + numeroAnimales);
		Scanner entrada = new Scanner(System.in);

		String[] animales = new String[numeroAnimales];
		int[] anios = new int[numeroAnimales];

		for (int i = 0; i < numeroAnimales; i++) {
			System.out.println("ingrese animal: ");
			animales[i] = entrada.nextLine();
			System.out.println("ingrese edad");
			anios[i] = entrada.nextInt();
			System.out.println("[" + animales[i] + "-" + anios[i] + "]");
			entrada.nextLine();

		}
		// System.out.println("Las animales son: " + Arrays.toString(animales));
		// System.out.println("Las edades son: " + Arrays.toString(anios));
		this.nombres = animales;
		this.edades = anios;
		this.cantidadAnimales = numeroAnimales;

	}

	public void calcularEdadMedia() {
		int suma = 0;
		double promedio = 0.0;
		for (int i = 0; i < this.cantidadAnimales; i++) {
			suma += this.edades[i];

		}

		promedio = (double) suma / this.cantidadAnimales;// me aseguro que mi resultado sea double
		System.out.printf("PROMEDIO: %.2f", promedio);

		this.promedio = promedio;

	}

	public void animalViejo() {
		int edadViejo = this.edades[0];
		String animalViejo = this.nombres[0];

		for (int i = 0; i < this.cantidadAnimales; i++) {
			if (edadViejo < this.edades[i]) {
				edadViejo = this.edades[i];
				animalViejo = this.nombres[i];

			}

		}
		System.out.println();
		System.out.println("El animal mas Viejo es " + animalViejo + "  y su edad es" + edadViejo);

	}

	public void animalesMayores(int umbral) {
		int contador = 0;
		for (int i = 0; i < this.cantidadAnimales; i++) {
			if (edades[i] > umbral && edades[i] >= 0) {
				contador++;

			}

		}
		System.out.println("Numero de animales por encima del umbral es: " + contador);

	}

	public void mostrarAnimalesMayores(int umbral) {

		System.out.println("Animales con edad mayor al Umbral");
		for (int i = 0; i < this.cantidadAnimales; i++) {
			if (edades[i] > umbral && edades[i] >= 0) {
				System.out.println(nombres[i]);

			}

		}

	}

	public void mostrarAnimales() {
		for (int i = 0; i < this.cantidadAnimales; i++) {

			System.out.println("[" + nombres[i] + "-" + edades[i] + "]");
			
		}
	}
	public void buscarAnimal() {
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Ingrese el animal a buscar:");
		String buscador= entrada2.nextLine();
		for (int i = 0; i < this.cantidadAnimales; i++) {
			 
			if (nombres[i].trim().equals(buscador)) {
				System.out.println("El animal "+nombres[i]+" esta registrado");

			}
			else {
				System.out.println("El animal "+buscador+" NO esta registrado");
			}

		}
		
	
}
}
