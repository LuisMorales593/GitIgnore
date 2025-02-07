package tema2;
/*
 * CFG 04/11/2024- Clase que simula un helado de sabores de una tienda
 * 
 * String sabor: Sabor del helado (ej. "Vainilla", "Chocolate"). 

double precio: Precio del helado (debe ser un valor positivo). 

int cantidad: Cantidad de helados disponibles en inventario (debe ser un valor positivo o cero). 
 */

public class Helado {
	
	// atributos
	private String sabor; // sabor del helado
	private double precio; // precio del helado
	private int cantidad; // stock que hay del inventario

	// constructor
	public Helado(String sabor, double precio, int cantidad) 
	{
		super();
		this.sabor = sabor;
		
		// valida que el precio sea positivo
		if ( esPrecioValido (precio) )
			this.precio = precio;
		else 
			this.precio = 1; // por defecto digo que los helados valen 1 euro
		
		// cantidad no sea negativa
		if (esCantidadValida(cantidad) )
			this.cantidad = cantidad;
		else this.cantidad = 0;
		// si no me pasan una cantidad buena, digo que hay cero
	}
		
	
	// metodos 
	/**
	 * Cambia el precio del helado si el nuevo precio es positivo en caso contrario error
	 * 	 @param nuevoPrecio
	 * @return boolean
	 */
	public void ajustarPrecio(double nuevoPrecio) {
		
		boolean esValido = esPrecioValido(nuevoPrecio);
		
		if (esValido == true )
			// como es valido actualizo el precio
			this.precio =nuevoPrecio;
		else System.err.println("El precio no puede ser negativo " + nuevoPrecio);
		
	}
	
	

	/**
	 *  Metodo que indica que el precio pasado por parametro es valor positivo
	 * @param precio
	 * @return
	 */
	public boolean esPrecioValido(double precio) {
		if (precio > 0)
			return true;
		
		else return false;
	}
	
/**
 * Metodo que valida que la cantidad sea 0 o superior	
 * @param cantidad
 * @return
 */
	public boolean esCantidadValida(int cantidad) {
		if (cantidad >= 0)
			return true;
		
		else return false;
	}
	
	/**
	 * Cambia la cantidad en inventario si nuevaCantidad es positiva o cero. Si no, muestra un mensaje de error. 
	 */
	
	public void ajustarCantidad(int nuevaCantidad) {
		
		if (esCantidadValida(nuevaCantidad))
			this.cantidad = nuevaCantidad; // setCantidad (nuevaCantidad)
		else System.err.println("Cantidad no valida");
	}
	
	
	/**
	 * Reduce la cantidad en inventario si cantidadAVender es menor o igual a la cantidad en stock y mayor que cero. 
	 * Si la cantidad a vender es negativa o mayor al inventario disponible, muestra un mensaje de error. 
	 */
	public void vender(int cantidadVender) {
		
		// 
		if (cantidadVender <= cantidad && cantidadVender > 0) {
			this.cantidad -= cantidadVender;
		} else System.err.println("no se puede vender la cantida indicada");
	}
	
	/**
	 * Calcula el valor total en inventario multiplicando el precio por la cantidad de helados en stock. 
	 */
	public double calcularValorInventario() {
		boolean precioValido = esPrecioValido(this.precio);
		boolean cantidadValida = esCantidadValida(this.cantidad);
		
		if (precioValido && cantidadValida) {
			// calcula valor inventario y lo devuelvo
			double total = cantidad * precio;
			return total;
		}else return 0.0; // como hay un dato no valido, devuelvo 0

	}
	
	
	/**
	 * incrementarPrecio ( double porcentaje) Incrementa el precio del helado en el porcentaje indicado.
	 */
	 
	public void incrementarPrecio( double porcentaje ) {
		if (porcentaje > 0)
			// calcular el incremento con el porcentaje
			this.precio += this.precio * (porcentaje/100);
		else System.err.println("No se puede incrementar ese porcentaje");
		
	}
	
	// getter y setter 

	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	//toString
	@Override
	public String toString() {
		return "Helado con los siguientes datos [sabor=" + sabor + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

}
