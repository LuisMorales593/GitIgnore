package monedero;

/*
 * CFG 28102024 - Clase que prueba un monedero
 */

public class TestMonedero {

	public static void main(String[] args) {
		
		// crear objeto monedero que contiene 10 euros y su capacidad es 20
		Monedero miMonedero = new Monedero(10, 20);

		
		miMonedero.anyadirImporte(45);
		miMonedero.extraerImporte(30);
		System.out.println("MONEDERO 1 " + miMonedero.toString()); // System.out.println(miMonedero);
		
		// crear objeto monedero que contiene 0 euros y su capacidad es 200
		Monedero miMonederoCarol = new Monedero(0, 200);
		System.out.println("MONEDERO 2 " + miMonederoCarol);
		
		// Mostrar la cantidad que todavia puedo añadir
		double cantidad = miMonederoCarol.devolverCapacidad();
		System.out.println("Todavia puedes añadir "+ cantidad + " al monedero 2");
		

		


	}

}
