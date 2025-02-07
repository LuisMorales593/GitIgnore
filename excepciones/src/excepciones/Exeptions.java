package excepciones;

import java.awt.image.IndexColorModel;
import java.util.Arrays;
import java.util.Scanner;

public class Exeptions {
	public static int[] arrayNumeros= {1,2,3};
	public static String[] arrayProductos= {"GAIA","DarkMagician","blueEyes"};
	public static int numero;
	public static void main(String[] args) {
		
		try {
			//System.out.println(arrayProductos[0]);
			for (int arrayNumeros : arrayNumeros) {
	            System.out.println(arrayNumeros);
	           
			}
			
			ingresoDato();
			for (String arrayProductos : arrayProductos) {
	            System.out.println(arrayProductos);
			}
			System.out.println(Arrays.toString(arrayNumeros));
			System.out.println(Arrays.toString(arrayProductos));
			System.out.println(arrayProductos[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(" \nno existe elemento del arreglo");
			arrayProductos[1]="Blade";
			System.out.println(Arrays.toString(arrayProductos));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(" \nno CAMBIO");
			arrayProductos[1]="Genosaurer";
			System.out.println(Arrays.toString(arrayProductos));
			
		}
		finally {
			System.out.println("resto de excepciones");
		}
		
			
		}
		
		
		public static void ingresoDato() {
			
			Scanner panel= new Scanner(System.in);
			System.out.println("Ingresa un numero : ");
			numero=panel.nextInt();
			System.out.println("Ingresaste: "+numero);
			
			panel.close();
			
		}
		
		
	}


