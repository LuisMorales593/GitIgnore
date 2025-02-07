package SensorTemperatura;

public class cascoTest {

	public static void main(String[] args) {
		
		
		Cascos mandaloriano = new Cascos(40, 40, null);
		mandaloriano.validarCantidad(-3);
		mandaloriano.setNombre("Liger");
		System.out.println(mandaloriano.getNombre());
		Cascos mandi=new Cascos();
		mandi.getNombre();
		System.out.println(mandi.getNombre());
		mandaloriano.inventarioDescuento(25);
		mandi.inventarioDescuento(25);
		
	

	}

}
