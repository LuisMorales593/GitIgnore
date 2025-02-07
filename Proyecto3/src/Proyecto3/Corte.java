package Proyecto3;

/*Crear una clase Corte que hereda de Servicio con un atributo de tipo entero
llamado largo que indica el largo de la melena que se va a dejar después del corte. También
tendrá los siguientes métodos*/

public class Corte extends Servicio{
	 private int largo;
	    
	    public Corte(int minutos, int largo) {
	        super(minutos, CORTE);
	        
	        // Validar el largo  con if-else
	        if (validarLongitud(largo)) {
	            this.largo = largo;
	        } else {
	            this.largo = 10; // Asigna 10 si la longitud es inválida
	        }
	        //Incremento 5 $
	        this.importe += 5;
	        
	    }
	    //retorno true si  largo esta entre [5-30] 
	    private boolean validarLongitud(int largo) {
	        return largo >= 5 && largo <= 30;
	    }
	    //ToString que añade al texto devuelto del padre el largo del corte por eso uso "return super".
	    @Override
	    public String toString() {
	        return super.toString() + ", Largo: " + largo + " cm";
	    }

}
