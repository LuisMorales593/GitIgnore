package SensorTemperatura;
//EXAMEN
//@Desarrollado por :Luis Morales
public class TestZoo {

	public static String[] name;
	public static int []years;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zoologico ZooMadrid=new Zoologico(name,years,5);
		//Zoologico ZooMadrid=new Zoologico();
		ZooMadrid.registrarAnimales(3);
		ZooMadrid.calcularEdadMedia();
		ZooMadrid.animalViejo();
		ZooMadrid.animalesMayores(3);
		ZooMadrid.mostrarAnimalesMayores(4);
		ZooMadrid.buscarAnimal();
	}

}
