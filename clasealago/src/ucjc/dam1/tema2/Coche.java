package ucjc.dam1.tema2;
/*
 * CFG 30/10/2024 -Clase que simula un coche
 */


public class Coche {

	// atributos 
	private String color;
	private String modelo;
	private double kms;
	private int anyoMatricula;
	private String estado="Arranque";
	
	
	// constructor
	public Coche(String color, String modelo, double kms, int anyoMatricula) {

		this.color = color;
		this.modelo = modelo;
		this.kms = kms;
		this.anyoMatricula = anyoMatricula;
	}
	

	
	public Coche( String modelo, double kms, int anyoMatricula) {

		this.color = "Blanco";
		this.modelo = modelo;
		this.kms = kms;
		this.anyoMatricula = anyoMatricula;
		
	}


	//metodos
	
	/**
	 * Mover el coche la cantidad de km indicada.
	 * Añadir km al atributo kms
	 * 
	 * @param kmDesplazamiento
	 */
	public double  mover(double kmDesplazamiento) {
		
		if ( kmDesplazamiento > 0 )
			this.kms = kms + kmDesplazamiento;
		
		return this.kms;
		
	}
	
	/**
	 * Metodo que pinta el coche del color indicado
	 * @return no devuelve
	 */
	public void cambiarColor(String nuevoColor) {
		// Comprobar que el color pasdo es algo
		
		if ( nuevoColor != null)
			this.color = nuevoColor;
	}



	
	// getter y setter 
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public double getKms() {
		return kms;
	}



	public void setKms(double kms) {
		this.kms = kms;
	}



	public int getAnyoMatricula() {
		return anyoMatricula;
	}


	/**
	 * Metodo que actualiza el año teniendo en cuenta la validacion
	 * @param anyoMatricula
	 */
	public void setAnyoMatricula(int anyoMatricula) {
		// validacion que el año superior al 2000
		if ( anyoMatricula > 2000)
			this.anyoMatricula = anyoMatricula;
	}
	
	// toString
	@Override
	public String toString() {
		return "Coche [color=" + color + ", modelo=" + modelo + ", kms=" + kms + ", anyoMatricula=" + anyoMatricula
				+ "]";
	}	
	

	
}
