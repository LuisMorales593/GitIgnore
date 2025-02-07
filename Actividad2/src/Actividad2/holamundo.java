package Actividad2;



	package entornos;

	import static org.junit.jupiter.api.Assertions.*;
	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertTrue;
	import static org.junit.jupiter.api.Assertions.assertTrue;
	import static org.junit.jupiter.api.Assertions.fail;

	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.params.ParameterizedTest;
	import org.junit.jupiter.params.provider.CsvSource;
	import org.junit.jupiter.params.provider.ValueSource;

	public class calculadoraTest {

	    @Test
	    public void testSumar() {
	        Calculadora calculadora = new Calculadora();
	        int resultado = calculadora.sumar(5, 3);
	        assertEquals(8, resultado, "La suma de 5 y 3 debe ser 8");
	    }

	    @Test
	    public void testRestar() {
	        Calculadora calculadora = new Calculadora();
	        int resultado = calculadora.restar(10, 4);
	        assertEquals(6, resultado, "La resta de 10 y 4 debe ser 6");
	    }

	    @Test
	    public void testMultiplicar() {
	        Calculadora calculadora = new Calculadora();
	        int resultado = calculadora.multiplicar(7, 6);
	        assertEquals(42, resultado, "La multiplicación de 7 y 6 debe ser 42");
	    }

	    @Test
	    public void testDividir() {
	        Calculadora calculadora = new Calculadora();
	        int resultado = calculadora.dividir(20, 4);
	        assertEquals(5, resultado, "La división de 20 entre 4 debe ser 5");
	    }

	    @Test
	    public void testDividirPorCero() {
	        Calculadora calculadora = new Calculadora();
	        // Verificar que lanzar una excepción al dividir por cero
	        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0),
	                "Se esperaba una ArithmeticException al dividir por cero");
	    }
	}





	CLASE SIMPLE

	package entornos;

	public class Calculadora {
		
			
		

		    public int sumar(int a, int b) {
		        return a + b;
		    }

		    public int restar(int a, int b) {
		        return a - b;
		    }

		    public int multiplicar(int a, int b) {
		        return a * b;
		    }

		    public int dividir(int a, int b) {
		        if (b == 0) {
		            throw new ArithmeticException("No se puede dividir por cero");
		        }
		        return a / b;
		    
		}
		

	}


	package Casco;

	public class Mandaloriano {

		// Atributos
		private String nombre;
		private double precio;

		public Mandaloriano(String nombre, double precio) {
			super();
			this.nombre = nombre;
			this.precio = precio;

		}

		// metodos{}
		public void ajustarPrecio(double nuevoPrecio) {
			if (nuevoPrecio >= 0) {

				System.out.println("Precio Correcto");
				this.precio = nuevoPrecio;
				

			} else
				System.err.println("Cantidad no valida");
				this.precio = 0;
				
			
			
		}
		
		
		public void regaloPrecio(double nuevoPrecio)
		{
			if (75<= nuevoPrecio && nuevoPrecio<=100) 
			{
				nuevoPrecio=nuevoPrecio-80;
				this.precio=nuevoPrecio;
				if(precio<0) {
					this.precio=8;
				}
				else
					this.precio=precio;
					
				
			}
			else 
			{
				nuevoPrecio=precio+10;
				this.precio=nuevoPrecio;
				
				
			}
		}

		@Override
		public String toString() {
			return "Mandaloriano [nombre=" + nombre + ", precio=" + precio + "]";
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

	}

}
