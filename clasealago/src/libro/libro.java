package libro;
public class libro
{
	//Atributos
	private String titulo="";
	private String autor="";
	private int numeroPaginas;
	private int paginaActual;
	private  boolean abierto=false;
	
	//constructor
	
	public libro(String titulo, String autor, int numeroPaginas, int paginaActual, boolean abierto) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.paginaActual = paginaActual;
		this.abierto = abierto;
		
	}

	public libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		
		//inicializar
		this.numeroPaginas = 100;
		this.paginaActual = 1;
		this.abierto = false ;
		
		
		
		
	}
	
	
	
	
	
	
	}
	