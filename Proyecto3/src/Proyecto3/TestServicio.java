package Proyecto3;

import java.util.*; //Importo todo 

public class TestServicio {

	public static void main(String[] args) {
		System.out.println("PROYECTO 3");
		testFinal();

	}

//////////////////////////////////////////TEST DE PRUEBAS //////////////////////////////////////////////////////////
	public static void test1() {
		Scanner ingresoDatos = new Scanner(System.in);

		/*
		 * Reglas Servicio EnQueLeSirvo = new Servicio(minutos, categoria,importe);
		 * Importe debe ser entre 15-150. Categoria solo 0, 1, 2.
		 */

		try {
			System.out.println("\nIngrese Categoria:");
			int input2 = ingresoDatos.nextInt();

			Servicio EnQueLeSirvo = new Servicio(3, 15);

			System.out.println(EnQueLeSirvo.toString());
		} catch (InputMismatchException e) {
			System.out.println("Error:" + e.toString());
			System.out.println("No sale la letra");
		}

	}

	public static void test2() {
		/*
		 * Reglas Servicio EnQueLeSirvo = new Servicio(minutos,categoria, importe); 
		 * Importe debe ser entre 15-150. Categoria se ingresa por consola solo 0, 1, 2.
		 */
		Servicio aVender = new Servicio(1,0);
		aVender.costoFinal();
		System.out.println("Saca la tarjeta que  me debes: "+aVender.costoFinal()+"$");
		System.out.println("Categoria: "+aVender.nombreCategoria());
		System.out.println(aVender.toString());
		
		
		//aVender.cambiarDuracion(5);
		

	}
	/////////////////////////////////////////////TEST FINAL
	public static void testFinal() {
		///Tinte (minutos,"Color")
		Tinte tinte = new Tinte(50, "ROSA");
		//Corte(min,Largo)
        Corte corte = new Corte(40, 4);
        //Tratamiento(Minutos de duracion)
        Tratamiento tratamiento = new Tratamiento(100);
        System.out.println("-----------------------------SERVICIOS----------------------------");
        System.out.println(tinte);
        System.out.println(corte);
        System.out.println(tratamiento);
        
        try {
            tratamiento.cambiarDuracion(50);
            //Genero mi excepcion al tratar de darle  menos minutos
            System.out.println("Duracion del tratamiento cambiada: " + tratamiento);
        } catch (Exception e) {
            System.out.println("Error al cambiar la duracion del tratamiento: " + e.getMessage());
        }
		
	}

}
