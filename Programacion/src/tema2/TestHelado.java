package tema2;

public class TestHelado {

	public static void main(String[] args) {
		// Crear helado valido de vainilla
		Helado miHelado = new Helado ("mora", 1.5, 2);
		System.out.println(miHelado);
		
		//ajustar el precio del helado a valido
		miHelado.ajustarPrecio(4);
		System.out.println(miHelado);
		
		// ajustar el precio a un valor no valido
		//miHelado.ajustarPrecio(-1);
		//System.out.println(miHelado);
		
		// ajustar cantidad a valida
		miHelado.ajustarCantidad(5);
		
		// vendrer 8 helados
		miHelado.vender(2);

		
		Helado miHeladoChoco = new Helado ("chocolate", 0.75, 20);
		System.out.println(miHeladoChoco);
		
	}

}
