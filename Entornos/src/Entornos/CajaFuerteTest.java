package Entornos;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import org.junit.jupiter.api.Test;

private class CajaFuerteTest ;

	@Test
	public void SaldoInicialValido() {

		System.out.println("Prueba 1");
		CajaFuerte miMonedero = new CajaFuerte(100);
		assertEquals(100, miMonedero.getSaldo(), "Saldo esperado 100");
	}

	@Test
	public void saldoInicialValido() {

		try {
			CajaFuerte miMonedero = new CajaFuerte(-50);
			fail("espero un argument eception que ya esta cargadoEn la clase se guarde en er");
		} catch (IllegalArgumentException er) {
			assertEquals("fuera de rango", er.getMessage(), "El valor a comparar deve decir fuera de rango");
			// si le cambio una coma al mensaje ya no sale
			System.out.println(er.getMessage());
		}

	}

	@Test
	public void depositarDinero() {

		CajaFuerte miMonedero = new CajaFuerte(100);
		assertEquals(100, miMonedero.getSaldo(), "Saldo esperado 100");
		miMonedero.depositar(50);
		assertEquals(150, miMonedero.getSaldo(), "Saldo esperado 150");

	}

	@Test
	public void depositarCantidadInvalida() {
		CajaFuerte miMonedero = new CajaFuerte(100);
		try {

			miMonedero.depositar(-20);
			fail("espero un argument exception que ya esta cargadoEn la clase CAJAFUERTE se guarde en er");
		} catch (IllegalArgumentException er) {
			assertEquals("La cantidad a depositar debe ser positiva", er.getMessage(),
					" El mensaje debe decir:La cantidad a depositar debe ser positiva");
			// si le cambio una coma al mensaje ya no sale
			System.out.println(er.getMessage());
		}

	}

	@Test
	public void retirarDineroFondosSuficientes() {
		CajaFuerte miMonedero = new CajaFuerte(100);
		assertEquals(100, miMonedero.getSaldo(), "Saldo inicial 100");
		miMonedero.retirar(50);
		assertEquals(50, miMonedero.getSaldo(), "Saldo esperado 50");

	}

	@Test
	public void retirarDineroSinFondosSuficientes() {
		CajaFuerte miMonedero = new CajaFuerte(50);
		assertEquals(50, miMonedero.getSaldo(), "Saldo  inicial esperado 50");
		try {

			miMonedero.retirar(200);
			fail("espero un argument exception que ya esta cargadoEn la clase CAJAFUERTE se guarde en er");
		} catch (IllegalArgumentException er) {
			assertEquals("Fondos insuficientes", er.getMessage(), " El mensaje debe decir:Fondos Insuficientes");
			// si le cambio una coma al mensaje ya no sale
			System.out.println(er.getMessage());
		}

	}

	@Test
	public void cajaVacia() {
		CajaFuerte miMonedero = new CajaFuerte(100);
		assertEquals(100, miMonedero.getSaldo(), "Saldo inicial 100");
		String mensaje1;
		if (miMonedero.getSaldo() > 0)
			mensaje1 = "Caja no Vacia";
		else {
			mensaje1 = "Caja Vacia";

		}
		assertTrue(miMonedero.estaVacia(), mensaje1);// AQUI miMonedero.estaVacia() es False
		miMonedero.retirar(100);
		assertEquals(0, miMonedero.getSaldo(), "Saldo  0");

		assertTrue(miMonedero.estaVacia(), mensaje1);// AQUI miMonedero.estaVacia() es True

		miMonedero.depositar(50);
		assertEquals(50, miMonedero.getSaldo(), "Saldo  50");
		assertTrue(miMonedero.estaVacia(), mensaje1);// SE SUPONE QUE AQUI VUELTA Tiene saldo entonces false

	}
	@Test
	public void depositarVariasCantidades() {
		CajaFuerte miMonedero = new CajaFuerte(100);
		assertEquals(100, miMonedero.getSaldo(), "Saldo inicial 100");
		miMonedero.depositar(20);
		miMonedero.depositar(30);
		miMonedero.depositar(50);
		
		
		assertEquals((100+20+30+50), miMonedero.getSaldo(), "Saldo inicial 100"); //esto tambien se peude hacer con la suma del saldo pero como mi pc no me deja comprovar
		
		
	
		
	}
	@Test
	public void retirarTodoSaldo() {
		CajaFuerte miMonedero = new CajaFuerte(100);
		String mensaje2;
		if (miMonedero.getSaldo() > 0)
			mensaje2 = "Caja no Vacia";
		else {
			mensaje2 = "Caja Vacia";

			assertEquals(100, miMonedero.getSaldo(), mensaje2);

			miMonedero.retirar(100);
			miMonedero.getSaldo();
			assertEquals(0, miMonedero.getSaldo(), mensaje2);

		}

	}
	public void ValoresDecimales() {
		// Para este metodo devo darle tolerancia a las cantidades ingresadas
		double tolerancia=1.0;
		CajaFuerte miMonedero = new CajaFuerte(100);
		assertEquals(100, miMonedero.getSaldo(), "saldo inicial");
		miMonedero.depositar(50.50);
		assertEquals(150.50, miMonedero.getSaldo(),tolerancia, "saldo Final");
		miMonedero.depositar(50.25);
		assertEquals(100.25, miMonedero.getSaldo(),tolerancia, "saldo Final");
		

	}
	
	
	
}
