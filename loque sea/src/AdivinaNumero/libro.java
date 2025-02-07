package AdivinaNumero;

public class libro {
	
	private String titulo;
	private String autor;
	private int anyoPublicacion;
	private boolean prestado=false;
	public int cantidad;
	
	//Cosntructor nunca devuelve nada se llama igual que la clase
	public libro(String titulo, String autor, int anyoPublicacion, boolean prestado, int cantidad) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anyoPublicacion = anyoPublicacion;
		this.prestado = prestado;
		this.cantidad = cantidad;
	}

	public libro(String titulo, String autor, int anyoPublicacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anyoPublicacion = anyoPublicacion;
	}
	public String prestar() 
	{
		if(prestado||cantidad==0)
			//no hay ejemplares que rpestar
			return "Error: El Libro esta ya prestado o no hay mas ejemplares";
		else 
		{
			//voy a pretarlo
			prestado=true;
			cantidad=cantidad -1;
			return "el libro a sido prestado";
			
		}
	}
	
	
	public String devolver() 
	{
		if(!prestado) 
		{
			return "error libro no prestado";
			
		}
		else 
		{
			prestado=false;
			cantidad++;
			return "libro se ha devuelto correctamente";
		}
		
	}
	
	public boolean esAntiguo() 
	{
		if(anyoPublicacion<2000)
			return true;
		else
			return false;
	}
	
	public void mostrarInformacion() 
	{
		System.out.println("Titulo:"+titulo);
		System.out.println("Autor:"+autor);
		//mostra is essta o no prestado maquillaje
		
		if(prestado)
			System.out.println("prestado si");
		else
			System.out.println("prestado no");
		
	}
	
	public boolean estaDisponible() 
	{
		if (!prestado && cantidad>0)
			return true;
		else return false;
		
			
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}

	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "libro [titulo=" + titulo + ", autor=" + autor + ", anyoPublicacion=" + anyoPublicacion + ", prestado="
				+ prestado + ", cantidad=" + cantidad + "]";
	}
	
	
	
	

}
