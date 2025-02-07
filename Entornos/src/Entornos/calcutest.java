package pruebaSIOSI;

import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;



import org.junit.jupiter.api.Test;

class calcutest {

	@Test
	public void pruebadivision() {
		calcu miCalculadora = new calcu();
		double resultado1 = miCalculadora.dividir(30, 5);
		System.out.println("resultado del constructor= " + resultado1);
		double test1 = (double) 30 / 5;
		System.out.println("resultado del test1= " + test1);
		assertEquals(test1, resultado1, "La division de 30 y 5 debe ser 6");
	}

	@Test
	public void pruebaMultiplicacion() {
		calcu miCalculadora = new calcu();
		miCalculadora.multiplicar(3, 4);
		System.out.println((double) 3 * 4);
		System.out.println("resultado del constructor= " + miCalculadora.multiplicar(3, 4));
		assertEquals(12, miCalculadora.multiplicar(3, 4), "debe dar 12");

	}

	@Test
	public void divisionCero() {
		calcu miCalculadora = new calcu();
		assertThrows(ArithmeticException.class, () -> miCalculadora.dividir(10, 0),
				"Se esperaba una ArithmeticException al dividir por cero");

	}

	@Test
	public void pruebaMensajesFueraRango() {
		calcu miCalculadora = new calcu();

		try {
			miCalculadora.validarDatos(123, 3);
			fail("espero un argument eception que ya cargue en la classe calcu se guarde en er");
		} catch (IllegalArgumentException er) {
			assertEquals("El saldo inicial no puede ser negativo", er.getMessage(), "El valor a comparar deve decir El saldo inicial no puede ser negativo");
			// si le cambio una coma al mensaje ya no sale
			System.out.println(er.getMessage());
		}
	}

	@Test
	//@BeforeEach // ejecuta el metodo  antes para cada prueba
	public void pruebaMensajesEnFueraRango() {
		calcu miCalculadora = new calcu();

		try {
			miCalculadora.validarDatos(5, 3);
			fail("espero un argument eception que ya cargue en la classe calcu se guarde en er");
		} catch (IllegalArgumentException er) {
			assertEquals("En rango", er.getMessage(), "El valor a comparar deve decir En rango");
			// si le cambio una coma al mensaje ya no sale
			System.out.println(er.getMessage());
		}

	}

}
