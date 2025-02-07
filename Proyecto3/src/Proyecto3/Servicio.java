package Proyecto3;

import java.util.*;

public class Servicio {
	/*
	 * Atributos minutos de duración, categoría de tipo entero e importe que puede
	 * contener decimales. private:accesible solo desde la clase. public : accesible
	 * desde cualquier clase(" Hijas").
	 */

	public int minutosDuracion;
	protected int categoria;
	protected double importe;

	/*
	 * Constantes TINTE con valor 0, CORTE con valor 1 y TRATAMIENTO con valor 2 que
	 * identifican la categoría del servicio,ESTAS SE PODRAN UTILIZRA POR TODAS LAS
	 * HIJAS
	 * 
	 * final: significa que este valor no se puede modificar=cte. static : significa
	 * que se puede utilizar en todos los metodos de la clase
	 */

	public static final int TINTE = 0;
	public static final int CORTE = 1;
	public static final int TRATAMIENTO = 2;

	/*
	 * IMPORTE BASE con valor 15 que identifica el importe base de todos los
	 * servicios sobre el que se calculará el importe final y que solo puede ser
	 * utilizada por esta clase.
	 */

	private static final int IMPORTE_BASE = 15;

	// CONSTRUCTOR Prueba2 //
	public Servicio(int minutosDuracion, int categoria) {
		super();
		this.importe = costoFinal();
		this.categoria = categoria;
		this.minutosDuracion = minutosDuracion;
		/* Una excepcion de ley con try un bloque Try-catch */
		try {

			validar();

		} catch (Exception e) {

			this.categoria = TINTE;
			this.importe = 50;
			System.out.println("Error:" + e.toString() + ".....VALORES DEFECTO :TINTE Y IMPORTE=50 : "); // Los Mensajes de el metodo
																						// validar se extraen en el
																						// catch
		}
	}

	///////////////////////////////// METODOS//////////////////////////////////////
	/*
	 * Validar que valida que la categoría introducida esté entre 0 y 2 y de no ser
	 * así lance IllegalArgumentException con un mensaje. También valida que el
	 * importe esté entre 15 y 150 y de no ser así lanza Exception con mensaje. No
	 * necesita que le pasen parámetros.
	 */
	/*
	 * Creo una excepcion para mi constructor Servicio atraves de la clase master
	 * Exception si la categoria no es 0, 1, 2 provoco una Excepcion
	 */
	public void validar() throws Exception {
		/// para leer datos por consola NO LO USO
		// Scanner leerDatos = new Scanner(System.in);
		// System.out.println("Ingrese Categoria:");
		// cat = leerDatos.nextInt();

		if (categoria < 0 || categoria > 2) {

			throw new IllegalArgumentException("¡¡¡WARMMING CATEGORIA NO ENCONTRADA!!!");
		} else {
			System.out.println("Categoria Valida :) ");
			this.categoria = categoria;
			
		}		
		if (importe < 15 || importe > 150) {
			throw new Exception("¡¡¡IMPORTE FUERA DE RANGO!!!");
		} else {
			System.out.println("Importe Valido :)");
		}

		if (minutosDuracion < 30) {
			throw new Exception("¡¡¡¡LOS MINUTOS NO PUEDEN SER MENORES A 30 MIN :( ");

		} else {
			System.out.println("TIEMPO VALIDO :)");
			this.minutosDuracion = minutosDuracion;
			this.importe = costoFinal();
		}

	}

	/*
	 * cambiarDuracion que recibe como parámetro los nuevos minutos de duración y
	 * que actualiza el atributo si los minutos están entre 30 y 120 y de no ser así
	 * lanza Exception.
	 */
	public void cambiarDuracion(int nuevosMinutos) {
		try {
			if (nuevosMinutos < 30 || nuevosMinutos > 120) {
				throw new Exception("Minutos Fuera De Rango Min[30-120]");
			} else {
				System.out.println("NUEVOS MINUTOS :)");
				this.minutosDuracion = nuevosMinutos;
				this.importe = costoFinal();
			}
		} catch (Exception e) {
			System.out.println("Exepcion en cambiarDuracion:" + e.toString());
		}

	}

	/*
	 * DevolverNombreCategoria que devuelve el nombre de la categoría que se ha
	 * pasado por parámetro como dato entero.
	 */

	public String nombreCategoria() {
		switch (categoria) {
		case TINTE:

			return "Tinte";
		case CORTE:

			return "Corte";
		case TRATAMIENTO:

			return "Tratamiento";

		default:

			return "Desconocid@";

		}

	}

	/* Getter y setter */
	public int getMinutosDuracion() {
		return minutosDuracion;
	}

	public void setMinutosDuracion(int minutosDuracion) {
		this.minutosDuracion = minutosDuracion;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public static int getTinte() {
		return TINTE;
	}

	public static int getCorte() {
		return CORTE;
	}

	public static int getTratamiento() {
		return TRATAMIENTO;
	}

	public static int getImporteBase() {
		return IMPORTE_BASE;
	}

	/*
	 * ToString que va a mostrar los minutos de duración, nombre de la categoría e
	 * importe del servicio.
	 */
	@Override
	public String toString() {
		return "Servicio [minutosDuracion=" + minutosDuracion + ", categoria=" + categoria + ", importe=" + importe
				+ "]";
	}

	/*
	 * Costo Final
	 */
	public double costoFinal() {
		double factorCategoria;
		switch (categoria) {
		case TINTE:
			factorCategoria = 1.15;
			break;
		case CORTE:
			factorCategoria = 1.35;
			break;
		case TRATAMIENTO:
			factorCategoria = 1.60;
			break;
		default:
			factorCategoria = 1.0;
		}

		double costo = IMPORTE_BASE * factorCategoria;

		if (minutosDuracion >= 30 && minutosDuracion <= 60)
			costo += 15;
		else if (minutosDuracion >= 61 && minutosDuracion <= 90)
			costo += 30;
		else if (minutosDuracion >= 91 && minutosDuracion <= 120)
			costo += 50;

		return costo;
	}

	public double calculaCosteFinalServicio() {
		// TODO Auto-generated method stub
		return 0;
	}

}
