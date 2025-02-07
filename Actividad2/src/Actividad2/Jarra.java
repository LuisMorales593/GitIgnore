package Actividad2;

public class Jarra {

	// ATRIBUTOS
	double capacidadMaxima;
	double cantidadActual;
	double temperaturaActual;
	double cantidadAniadida;
	double cantidadSustraida;

	// CONSTRUCTORES
	// constructor por defecto
	public Jarra() {
		super();
		this.capacidadMaxima = 1000;
		this.cantidadActual = 0;
		this.temperaturaActual = 20;
	}
	// Constructorcon la maxima capacidad

	public Jarra(double capacidadMaxima, double cantidadActual, double temperaturaActual) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
		this.temperaturaActual = temperaturaActual;

	}

	// llenarJarra que no sobrepase el nivel

	public boolean evaluoElNivel()

	{
		if (cantidadActual >= capacidadMaxima)

		{
			System.out.println("El Liquido se ha derramado o la jarra esta llena");
			return false;

		} else {
			System.out.println("Ingresa la cantidad");
			return true;
		}
	}

	public double llenarAgua() 
	{
		if(evaluoNivel()==true) {
			cantidadActual=capacidadMaxima;
		 this.capacidadMaxima=capacidadMaxima;
		return cantidadAniadida;}
		else {
			return cantidadAnidida;}
		
					
		
		
	}

	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public double getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(double cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public double getTemperaturaActual() {
		return temperaturaActual;
	}

	public void setTemperaturaActual(double temperaturaActual) {
		this.temperaturaActual = temperaturaActual;
	}

	@Override
	public String toString() {
		return "Jarra [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual
				+ ", temperaturaActual=" + temperaturaActual + "]";
	}

}
