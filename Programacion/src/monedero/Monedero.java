package monedero;

/*
 * CFG 28102024 - Clase que simula un monedero con capacidad maxima y actual 
 */

public class Monedero {

	// atributos 
	private double importeActual; // contenido actual del monedero
	private double capacidadMaxima; // cuanto puedo meter al monedero como maximo

	
	// constructor 
	public Monedero(double importeActual, double capacidadMaxima) {
		super();
		this.importeActual = importeActual;
		this.capacidadMaxima = capacidadMaxima;
	}
	

	// metodos que incorpora dinero al monedero
	public void anyadirImporte(double anyadido) {
		
		// comprobar que añadido es valido siendo positivo 
		if (anyadido < 0 ) {
			System.err.println("No se puede anaydir importe negativo");
		}else {
			// calcular cual seria el total con el añadido
			double total = importeActual + anyadido;
			// si supero la capacidadMaxima
			if ( total > capacidadMaxima )
				importeActual = capacidadMaxima;
			else 
				importeActual = importeActual + anyadido;
		}
	}
	
	// metodo que saca dinero del monedero
	public void extraerImporte(double importeExtraer) {
		if (importeExtraer > 0 ) { // comprobar que el dato es valido
			double total = importeActual - importeExtraer;
			if( importeActual < importeExtraer) {
				System.err.println("no se puede extraer todo");
				importeActual = 0;
			}else 
				importeActual = importeActual - importeExtraer;
				
			
		} else 
			System.err.println(" El dato no es valido");
	}
	
	// deuvelve lo que puedo rellenar del monedero 
	public double devolverCapacidad() {
		double diferencia = capacidadMaxima - importeActual;
		return diferencia ;
	}


	public double getImporteActual() {
		return importeActual;
	}


	public void setImporteActual(double importeActual) {
		this.importeActual = importeActual;
	}


	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}


	public void setCapacidadMaxima(double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}


	@Override
	public String toString() {
		return "Monedero [importeActual=" + importeActual + ", capacidadMaxima=" + capacidadMaxima + "]";
	}
	
		
	
}
