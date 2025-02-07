package ucjc.dam1.tema2;

import libro.Coche;

public class TestCoche {

	public static void main(String[] args) {
		
		Coche bmwBlanco = new Coche("x3", 10, 2024);
		
		Coche cocheOrby = new Coche("gris", "Cayenne", 137000, 2022);
		
		double totalKm = cocheOrby.mover(50);
		
		System.out.println( "Ahora tu coche lleva " +  totalKm);
		
		
		cocheOrby.cambiarColor("verde");
		
		cocheOrby.setAnyoMatricula(2021);
		
		System.out.println(cocheOrby);
		
		//-----------------------
		//instancie un coche y lo inicialice a  color rojo y con 100 km, lo mueva 20 km y lo pinte de verde.
		
		Coche cocheRojo = new Coche("rojo", "fiat panda", 20, 2024);
		totalKm = cocheRojo.mover(20);
		cocheRojo.setKms(120);
		cocheRojo.mover(120);
		cocheRojo.setColor("verde");
		
		
	}

}
