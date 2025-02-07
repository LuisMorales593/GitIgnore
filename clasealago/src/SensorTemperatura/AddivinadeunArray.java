package SensorTemperatura;

import java.util.Random;// libreira random.


public class AddivinadeunArray {
	 //static Random random = new Random();
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random Alazar = new Random();//numeros l azar
		
		
        String Zoids[]= {"liger","Lithingzaaids","osopolar","peroloco"};
        //String Zoids[]= new String[10];
		int[] tamanioNumeros = new int[4];//tamaño
	
		for(int i=0;i<Zoids.length;i++)//metodode ancho del siclo fro concatenado altamaña de mi array
			
		{
			
			
			System.out.println(i+1+"  " +Zoids[i]);
			
			int numeroAleatorio = Alazar.nextInt(10)+1;
	        System.out.println( numeroAleatorio);
		}
	

	}

}
