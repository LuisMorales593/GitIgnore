package SensorTemperatura;

import java.util.Scanner;
//clase que pide un numero hasta que acierta

public class GeneraNum {
public static final int NUMERO_SECRETO=7;// PARA QUE SEA CONSTANTE SE NECESITA UNA FINAL

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr= new Scanner(System.in);
		int numeroUsuario=0;
		int intentos=0;
		
		
		//bucle  hasta acertar
		do {
			
			System.out.println("dame un numero entre 1 y 10");
			numeroUsuario=sr.nextInt();
			
			//considero ue este es un instento mas
			
			intentos ++;
			//consultar si es valido
			if (numeroUsuario<1  || numeroUsuario>10)
				System.out.println("el numero no es valido");
			else
				//comprovamos el acertado
				if(numeroUsuario == NUMERO_SECRETO) 
				{
					System.out.println("felicidades has acertado, nuero de intentos"+intentos);
				  
					
				}
				else
					System.out.println("Prueba de nuevo");
			
		}
		while(numeroUsuario != NUMERO_SECRETO);

	}

}
