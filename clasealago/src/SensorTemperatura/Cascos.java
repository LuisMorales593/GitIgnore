package SensorTemperatura;

public class Cascos {
	private  int cantidad;
	private double precio;
	private String nombre;
	public Cascos(int cantidad, double precio, String nombre) {
		super();
		this.cantidad = cantidad;
		this.precio = precio;
		this.nombre = nombre;
	}
	
	///constructor por defecto
	public Cascos() {
		super();
		this.cantidad = 30;
		this.precio = 100;
		this.nombre = "casco mandaloriano";
		
	}
	public int validarCantidad(int nuevaCantidad) {
		if (nuevaCantidad>=0 && nuevaCantidad<=100) 
		{
			System.out.println("ingreso valido ");
				this.cantidad=nuevaCantidad;
		}else {
			System.out.println("ingreso  no valido ");
		}
			
		
		return nuevaCantidad;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void inventarioDescuento(double decuento) {
		
		
		double precioDescuento=((100-decuento)*this.precio)/100;
		
		this.precio=precioDescuento;
		
		System.out.println(" ITEM: "+ this.nombre+" con decuiento "+this.precio);
	}
	

}
