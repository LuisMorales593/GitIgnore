package Jarra;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestExepciones {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner consola1=null;
		try {
			consola1= new Scanner(System.in);
			System.out.println("numerador: ");
			double num1=consola1.nextDouble();
			System.out.println("denominador: ");
			double num2=consola1.nextDouble();
			double res=(double)num1/num2;
			System.out.println("resuesta= "+res);
			if (res<0) {
				throw new NegativoException("Estoy ACA ");
			}
		} catch (NegativoException e) {
			// TODO Auto-generated catch block
			System.out.println("Exepcion de mi constructor de numero negativo solo en mensaje");
			
		}
		catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Exepcion al introducir una letra ");
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("lllegeu a  admitir cualquier excepcion con Exception");
		}
		finally
		{
			consola1.close();
		}

	}

}
