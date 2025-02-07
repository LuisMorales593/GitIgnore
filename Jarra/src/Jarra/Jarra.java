package Jarra;

public class Jarra {

	// Atributos de la clase
	private int capacidadMaxima; // Capacidad máxima de la jarra en ml
	private int cantidadActual; // Cantidad actual de agua en la jarra en ml
	private int temperaturaActual; // Temperatura del agua en la jarra en grados Celsius

	// Constructor por defecto
	public Jarra() {
		super();
		this.capacidadMaxima = 1000;// Capacidad máxima por defecto 1000 ml
		this.cantidadActual = 0; // Jarra vacía por defecto
		this.temperaturaActual = 20; // Temperatura por defecto 20 grados centigrados.

	}
	
	// Constructor Capacidad Maxima

	public Jarra(int capacidadMaxima) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = 0;
		this.temperaturaActual = 20;
	}

	// Método para llenar la jarra
	public void llenarJarra() {
		this.cantidadActual = capacidadMaxima;
	}
	 // Método para vaciar la jarra
    public void vaciarJarra() {
        this.cantidadActual = 0;  // Se pone la cantidad de agua en cero
    }
 // Metodo para servir un vaso de agua
    public void servirVaso(int cantidad) {
        // Validar cantidad del vaso
        if (cantidad > 0 && cantidad <= 500) {
            if (cantidad <= this.cantidadActual) {
                this.cantidadActual -= cantidad;  // Disminuye la cantidad de agua
            } else {
                System.out.println("No hay suficiente agua en la jarra para llenar el vaso.");
                this.cantidadActual = 0;  // Se sirve todo lo que queda
            }
        } else {
            System.out.println("La cantidad a servir debe ser mayor que 0 y menor o igual a 500 ml.");
        }
    }

 // Metodo para agregar agua a la jarra
    public void agregarAgua(int cantidad) {
        if (cantidad >= 0) {
            this.cantidadActual += cantidad;  // Se añade la cantidad de agua indicada
            if (this.cantidadActual > this.capacidadMaxima) {
                this.cantidadActual = this.capacidadMaxima;  // Ajusta si supera la capacidad
            }
        } else {
            System.out.println("La cantidad de agua a agregar debe ser positiva.");
        }
    }
	
 // Metodo para mezclar agua con una nueva cantidad de agua a diferente temperatura
    public void mezclarAgua(int cantidadAguaNueva, int temperaturaNueva) {
        if (cantidadAguaNueva >= 0) {
            // Calcula la temperatura final utilizando la fórmula de mezcla 
        	//valores que tengo en la jarra
            int m1 = this.cantidadActual;
            int T1 = this.temperaturaActual;
            
            //Valores del Agua a agregar.
            int m2 = cantidadAguaNueva;
            int T2 = temperaturaNueva;

            int cantidadTotal = m1 + m2;
            int temperaturaFinal = (m1 * T1 + m2 * T2) / cantidadTotal;

            // Ajusta la temperatura para que no esté fuera de los límites válidos
            if (temperaturaFinal < 0) {
                temperaturaFinal = 0;
            } else if (temperaturaFinal > 100) {
                temperaturaFinal = 100;
            }

            // Actualiza la temperatura y cantidad de agua
            this.temperaturaActual = temperaturaFinal;
            this.cantidadActual += cantidadAguaNueva;

            // Si la cantidad de agua excede la capacidad máxima, se ajusta
            if (this.cantidadActual > this.capacidadMaxima) {
                this.cantidadActual = this.capacidadMaxima;
            }
        } else {
            System.out.println("La cantidad de agua nueva debe ser positiva.");
        }
    }
    
    //Getters and Setters

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public double getTemperaturaActual() {
		return temperaturaActual;
	}

	public void setTemperaturaActual(int nuevaTemperaturaActual) {
		this.temperaturaActual = nuevaTemperaturaActual;
	}
    
    
}
