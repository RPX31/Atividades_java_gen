package Atividades_Aula3;

import java.util.Scanner;

public class Atividade_1 {
	
	public static void main(String[]args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro numero");
		
			int primeiro = leia.nextInt();
			
		System.out.println("Digite o primeiro numero");
			int segundo = leia.nextInt();
			
			
			
			
			if(primeiro < segundo ) {
				System.out.println(" Intervalo inválido! programa finalizado: ");
				
			}
			else {
				System.out.println(" Intervalo inválido! programa finalizado:");
			}
			
			
			for(int repeticao = primeiro; repeticao <= segundo ; repeticao++ ) {
				
				if(repeticao % 3 == 0 && repeticao % 5 == 0) {
					
					System.out.println(repeticao +" "+ "é multiplo de 3 e 5");
				}
				
				leia.close();
			}
			
	}
	
	

}
