package Atividades_Aula2;

import java.util.Scanner;

public class Atividade_1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("informe o primeiro numero:");
			int numeroA = leia.nextInt();
		System.out.print("informe o primeiro numero:");
			int numeroB = leia.nextInt();
		System.out.print("informe o primeiro numero:");
			int numeroC = leia.nextInt();
			
			
	if( (numeroA + numeroB > numeroC)) {
		
		System.out.println("numeroA e numeroB juntos, são maiores que NumeroC");
	}
	else if ((numeroA + numeroB < numeroC)){
		
		System.out.println("numeroA e numeroB  juntos, não são maiores que NumeroC");
		
	}
	else {
		System.out.println("ERROR 400:tente novamente");
	}
	
		
		
		leia.close();
		
		
		
		
		
	}
	

	
	
}
