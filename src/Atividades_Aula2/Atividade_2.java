package Atividades_Aula2;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("informe numero positivo ou negativo:");
			int numero = leia.nextInt();
		
		
		if (numero >= 0 && numero %2 == 0) {
			System.out.println( "Esse numero: "+ numero + " é  par e positivo.  ");
		}else if(numero < 0 && numero %2 == 0){
			System.out.println("Esse numero: "+ numero + " é par e negativo.  ");
		}
		else if(numero %2 != 0 && numero >= 0 ){
			System.out.println("Esse numer: "+ numero + " é impar e positivo.  ");
		}
		else {
			System.out.println("Esse numeo: "+ numero + " é impar e negativo.  ");
		}
		
			
			
		
leia.close();
	}

}
