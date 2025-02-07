package Proyecto3;

/*Crear una clase Tratamiento que hereda de Servicio con un atributo de tipo
numérico con decimales llamado mililitros que indica los ml de líquido que se usan en el
tratamiento.*/
public class Tratamiento extends Servicio {
	private double mililitros;

	public Tratamiento(int minutosDuracion) {
		super(minutosDuracion, TRATAMIENTO);
		this.mililitros = calcularMililitros();
		this.importe += 15;
	}

	private double calcularMililitros() {

		/*
		 * CalcularMililitros que calcula los ml necesarios para el tratamiento en
		 * función de la duración. Si el tratamiento dura más de 60 minutos los
		 * mililitros que se necesitan es la mitad de la duración incrementado en 10 ,
		 * si es menor, es la mitad de la duración incrementado en 5.
		 */
		double base = minutosDuracion / 2;
		if (minutosDuracion > 60) {
			return base + 10;
		} else {
			return base + 5;
		}
	}

	// APRENDO JAVA EN VES DE IF ELSE SE USA ESTAS SENTENCIAS MAS
	// CORTAS//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////        CONDICION SI ES TRUE //// (ES TRUE): (ES FALSE)
	// return (minutosDuracion > 60) ? (minutosDuracion / 2) + 10 : (minutosDuracion / 2) + 5;
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// ToString que añade a texto devuelto del padre los mililitros de tratamiento
	// Sobreescribe lo que tiene la calse Servicio.
	@Override
	public String toString() {
		return super.toString() + ", Mililitros: " + mililitros + " ml";
	}

}
