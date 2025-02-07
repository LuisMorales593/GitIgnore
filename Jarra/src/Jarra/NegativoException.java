package Jarra;




public class NegativoException extends Exception {
	//constructor
	

	public NegativoException(String mensaje) {
		super(mensaje);
		
	}
	public NegativoException() {
		super("el numero no es negativismo");
		
	}
	
	
	

}
