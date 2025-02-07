


/*
 *CFG 01/11/2024 - Clase que simula un rectangulo en el eje de coordenadas y lo desplazo 
 * 
 */

public class rectangulo {
	
	
	// atributos
	private int x1, y1; // posicion x e y del primer vertice
	private int x2, y2; // vertice superior izquierdo
	private int x3, y3; // vertice superior derecho
	private int x4, y4; // vertice inferior derecho


	// constructores
	
	// constructor que crea rectangulo partiendo de los 4 vertices
	public RectanguloDesplazamiento(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
	}
	
	// constructor crea un rectángulo partiendo de la base y la altura,  de forma que su vértice inferior izquierdo esté en (0,0).
	public RectanguloDesplazamiento(int base, int altura) {
		// compongo el rectangulo en funcion de la base y la altura proporcionadas
		
		// vertice inferior izquierdo
		x1 = 0;
		y1 = 0;
		
		// vertice superior izquierdo
		x2 = 0; 
		y2 = altura;
		
		// vertice inferior derecho
		x4 = base;
		y4 = 0;
		
		// vertice superior derecho
		x3 =  base;
		y3 = altura;
		
	}
	
	
	// metodos
	
/**
 * Método que desplace en horizontal el rectángulo en el plano 
 * @param desplazamiento
 */
	public void desplazarHorizontal(int desplazamiento) {
		
		// mover en horizontal el rectangulo 
		if ( desplazamiento > 0) {
			// vertice 1 
			x1 = x1 + desplazamiento;
				
			// vertice 2 
			x2 =  x2 + desplazamiento;
			
			// vertice 3 
			x3 =  x3 + desplazamiento;
			
			// vertice 4 
			x4 =  x4 + desplazamiento;
		}
	}

	
	
	/**
	 * Método que desplace en vertical el rectángulo en el plano 
	 * @param desplazamiento
	 */
		public void desplazarVertical(int desplazamiento) {
			
			// mover en vertical el rectangulo 
			if ( desplazamiento > 0) {
				// vertice 1 
				y1 = y1 + desplazamiento;
					
				// vertice 2 
				y2 =  y2 + desplazamiento;
				
				// vertice 3 
				y3 =  y3 + desplazamiento;
				
				// vertice 4 
				y4 =  y4 + desplazamiento;
			}
		}

		// metodos getter, setter y toString
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}

	public int getX4() {
		return x4;
	}

	public void setX4(int x4) {
		this.x4 = x4;
	}

	public int getY4() {
		return y4;
	}

	public void setY4(int y4) {
		this.y4 = y4;
	}

	@Override
	public String toString() {
		return "El RectanguloDesplazamiento creado tiene las siguiente coordenadas [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", x3=" + x3
				+ ", y3=" + y3 + ", x4=" + x4 + ", y4=" + y4 + "]";
	}	
		
	
}
