package Proyecto3;



public class Tinte extends Servicio {

	/*Crear una clase Tinte que hereda de Servicio con un atributo de tipo cadena
	de texto llamado color que indica el color que se va a emplear en el tinte.*/
	private String color;
    
    public Tinte(int minutos, String color) {
        super(minutos, TINTE);
        this.color = comprobarColor(color);
        this.importe = calculaCosteFinalServicio();
    }
    // Metodo para calcular el coste final del servicio
    @Override
    public double calculaCosteFinalServicio() {
        return super.calculaCosteFinalServicio() + 10; // Incrementa en 10 euros
    }
    
    // Metodo para comprobar y validar el color
    private String comprobarColor(String color) {
        if (color=="ROSA" || color=="LILA") {
            return "NEGRO";
        }
        return color;
    }
    
 // toString que añade el color del tinte al texto de la clase padre
    @Override
    public String toString() {
        return super.toString() + ", Color: " + this.color;
    }
	

}
