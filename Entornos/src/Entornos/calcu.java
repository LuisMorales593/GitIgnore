package pruebaSIOSI;

public class calcu {//pongo todas las excepciones
	public double numerador;
	public double denominador;
	public calcu() {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public double dividir(double n, double d) {
		double division=(double) n/d;
		if(d==0) {
			throw new ArithmeticException("No se puede dividir por cero");
			//throw new IllegalArgumentException("no cerooo"); no se puede poner 2 exceptions
		}
		return division;
	}
	public double multiplicar(double n, double d) {
		
		double m=n*d;
		return n*d;
		
	}
	public void validarDatos(double n,double d) {//numerador enter 1 y 10
		
		if (n<0||n>10) {
			throw new IllegalArgumentException("fuera de rango");//mando mi excepcion
			
		}else {
			this.numerador=n;
			this.denominador=d;
			throw new IllegalArgumentException("En rango");//mando mi excepcion
		}
		
		
	}

}
