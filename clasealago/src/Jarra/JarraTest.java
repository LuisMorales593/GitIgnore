package Jarra;

public class JarraTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crea una jarra con el constructor por defecto
        Jarra jarra1 = new Jarra();
        System.out.println("Capacidad máxima de la jarra 1000ml, cantidad actual: " + jarra1.getCantidadActual() + " ml");

        // Llenar la jarra
        jarra1.llenarJarra();
        System.out.println("Jarra 1 llena: " + jarra1.getCantidadActual() + " ml");

        // Servir un vaso de 250 ml
        jarra1.servirVaso(250);
        System.out.println("Después de servir 250 ml, quedan: " + jarra1.getCantidadActual() + " ml");

        // Servir otro vaso de 150 ml
        jarra1.servirVaso(150);
        System.out.println("Después de servir 150 ml, quedan: " + jarra1.getCantidadActual() + " ml");

        // Agregar 800 ml de agua
        jarra1.agregarAgua(800);
        System.out.println("Después de agregar 800 ml, la jarra tiene: " + jarra1.getCantidadActual() + " ml");

        // Mezclar el agua con 250 ml a 10 grados Celsius
        jarra1.mezclarAgua(250, 10);
        System.out.println("Después de mezclar, la jarra tiene: " + jarra1.getCantidadActual() + " ml y temperatura: " + jarra1.getTemperaturaActual() + "°C");

        // Vaciar la jarra
        jarra1.vaciarJarra();
        System.out.println("Después de vaciar, la jarra tiene: " + jarra1.getCantidadActual() + " ml");

        // Crear una segunda jarra con capacidad maxima de 2000 ml
        Jarra jarra2 = new Jarra(2000);

        // Llenar la jarra 2
        jarra2.llenarJarra();
        System.out.println("Jarra 2 llena: " + jarra2.getCantidadActual() + " ml");

        // Servir vasos de 250 ml hasta vaciar la jarra
        int vaso = 250;
        int contador = 1;
        while (jarra2.getCantidadActual() >= vaso) {
            jarra2.servirVaso(vaso);
            System.out.println("He servido el vaso número " + contador + ", quedan " + jarra2.getCantidadActual() + " ml en la jarra.");
            contador++;
        }

	}

}
